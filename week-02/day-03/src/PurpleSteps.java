import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

    int size1 = 20;
    int size2 = 20;


    drawRectangle1(graphics, size1);
    drawRectangle2(graphics, size2);

  }

  private static void drawRectangle1(Graphics graphics, int size) { // draw purple rectangles
    for (int i = 0; i < WIDTH / size; i++) {
        graphics.setColor(new Color(153,0,153));
        graphics.fillRect(i * size, i * size, size, size);
      }
    }
  private static void drawRectangle2(Graphics graphics, int size) { // draw empty rectangles with black border
    for (int i = 0; i < WIDTH / size; i++) {
      graphics.setColor(Color.BLACK);
      graphics.drawRect(i * size, i * size, size, size);
    }
  }


  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
