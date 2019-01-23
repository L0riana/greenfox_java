package com.greenfoxacademy.redditclone.repository;

import com.greenfoxacademy.redditclone.model.RedditPost;
import org.springframework.data.repository.CrudRepository;

public interface RedditPostRepository extends CrudRepository<RedditPost, Long> {


}
