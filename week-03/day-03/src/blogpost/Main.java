package blogpost;

public class Main {

  public static void main(String[] args) {
    // write your code here

    BlogPost blogPost1 = new BlogPost("John Doe", "Lorem ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04");
    BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
    BlogPost blogPost3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

//    System.out.println(blogPost1.toString());
//    System.out.println(blogPost2.toString());
//    System.out.println(blogPost3.toString());

    Blog myBlog = new Blog();

    myBlog.addBlogPost(blogPost1);
    myBlog.addBlogPost(blogPost2);
    myBlog.addBlogPost(blogPost3);

    System.out.println(myBlog.getBlogPostList().size());
    System.out.println(myBlog.getBlogPostList().toString());
    myBlog.deleteBlogPost(0);
    System.out.println(myBlog.getBlogPostList().toString());
    System.out.println(myBlog.getBlogPostList().size());
    myBlog.updateBlogPost(1,blogPost2);
    myBlog.addBlogPost(blogPost3);
    System.out.println(myBlog.getBlogPostList().toString());

  }
}
