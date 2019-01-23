package com.greenfoxacademy.traveloffice.controllers;

import com.greenfoxacademy.traveloffice.services.AttractionServiceImpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AttractionController.class, AttractionRestController.class})
@WebAppConfiguration
@EnableWebMvc
public class AttractionControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @MockBean
  AttractionServiceImpl attractionServiceImpl;

  @InjectMocks
  private AttractionRestController attractionRestController;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }


  @Test
  public void testIndexPageIsOk() throws Exception {
    mockMvc
            .perform(get("/"))
            .andExpect(status().isOk());
  }

  @Test
  public void testEditAttractionIsOk() throws Exception {
    mockMvc
            .perform(get("/edit/1"))
            .andExpect(status().isOk());
  }

  @Test
  public void testNotExistingEndpoint() throws Exception {
    mockMvc
            .perform(get("/bingo"))
            .andExpect(status().is4xxClientError());
  }

  @Test
  public void testAttractionRestControllerIsOk() throws Exception {
  }
}