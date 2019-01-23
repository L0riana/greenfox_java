package com.greenfoxacademy.todo_rest_api.security;

import com.greenfoxacademy.todo_rest_api.models.ApplicationUser;
import com.greenfoxacademy.todo_rest_api.services.CustomUserDetailsService;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.greenfoxacademy.todo_rest_api.security.SecurityConstant.HEADER_STRING;
import static com.greenfoxacademy.todo_rest_api.security.SecurityConstant.SECRET;
import static com.greenfoxacademy.todo_rest_api.security.SecurityConstant.TOKEN_PREFIX;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

  private final CustomUserDetailsService customUserDetailsService;

  public JWTAuthorizationFilter(AuthenticationManager authenticationManager,
                                CustomUserDetailsService customUserDetailsService) {
    super(authenticationManager);
    this.customUserDetailsService = customUserDetailsService;
  }

  @Override
  protected void doFilterInternal(HttpServletRequest request,
                                  HttpServletResponse response,
                                  FilterChain chain) throws IOException, ServletException {
    String header = request.getHeader(HEADER_STRING);
    if ((header == null) || !header.startsWith(TOKEN_PREFIX)) {
      chain.doFilter(request, response);
      return;
    }
    UsernamePasswordAuthenticationToken usernamePasswordAuth = getAuthenticationToken(request);
    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuth);
    chain.doFilter(request, response);
  }

  private UsernamePasswordAuthenticationToken getAuthenticationToken(HttpServletRequest request) {
    String token = request.getHeader(HEADER_STRING);
    if (token == null) {
      return null;
    }
    String username = Jwts.parser().setSigningKey(SECRET)
            .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
            .getBody()
            .getSubject();
    UserDetails userDetails = customUserDetailsService.loadUserByUsername(username);
    ApplicationUser applicationUser = customUserDetailsService.loadApplicationUserByUsername(username);
    if (username != null) {
      return new UsernamePasswordAuthenticationToken(applicationUser, null, userDetails.getAuthorities());
    }
    return null;
  }
}
