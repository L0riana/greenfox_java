package com.greenfoxacademy.redditclone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RedditPost {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String postTitle;
  private String url;
  private int score;

  public RedditPost() {
    score = 0;
  }

  public RedditPost(String postTitle) {
    this.postTitle = postTitle;
  }

  public RedditPost(String postTitle, String url) {
    this.postTitle = postTitle;
    this.url = url;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPostTitle() {
    return postTitle;
  }

  public void setPostTitle(String postTitle) {
    this.postTitle = postTitle;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
