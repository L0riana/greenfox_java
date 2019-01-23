package com.greenfoxacademy.redditclone;

import com.greenfoxacademy.redditclone.model.RedditPost;
import com.greenfoxacademy.redditclone.repository.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RedditcloneApplication implements CommandLineRunner {

  private RedditPostRepository redditPostRepository;

  @Autowired
  public RedditcloneApplication(RedditPostRepository redditPostRepository) {
    this.redditPostRepository = redditPostRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditcloneApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    redditPostRepository.save(new RedditPost("First Reddit post"));
    redditPostRepository.save(new RedditPost("Second Reddit post"));
  }
}
