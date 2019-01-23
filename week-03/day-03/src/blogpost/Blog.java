package blogpost;

import java.util.ArrayList;
import java.util.List;

public class Blog {

  List<BlogPost> blogPostList = new ArrayList<>();

  public List<BlogPost> getBlogPostList() {
    return blogPostList;
  }

  public void addBlogPost(BlogPost blogPost){
    this.blogPostList.add(blogPost);
  }

  public void deleteBlogPost(int i){
    this.blogPostList.remove(i);
  }

  public void updateBlogPost(int i, BlogPost blogPost) {
    this.blogPostList.set(i, blogPost);
  }
  @Override
  public String toString() {
    return "Blog{" +
            "blogPosts=" + blogPostList +
            '}';
  }
}
