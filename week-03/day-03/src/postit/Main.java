package postit;

public class Main {

  public static void main(String[] args) {
   /*Create a postit class that has
            a backgroundColor
            a text on it
            a textColor
            Create a few example post-it objects:
    an orange with blue text: "Idea 1"
    a pink with black text: "Awesome"
    a yellow with green text: "Superb!"
    */
    PostIt postIt1 = new PostIt("orange", "Idea1", "blue");
    PostIt postIt2 = new PostIt("pink", "Awesome", "black");
    PostIt postIt3 = new PostIt("yellow", "Superb", "green");

    System.out.println(postIt1.toString());
    System.out.println(postIt2.toString());
    System.out.println(postIt3.toString());
  }
}
