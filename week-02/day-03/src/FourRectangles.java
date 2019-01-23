import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics) {

    // draw four different size and color rectangles.
    // avoid code duplication.
    graphics.setColor(Color.RED);
    graphics.drawRect(0,0,10,10);
    graphics.setColor(Color.GREEN);
    graphics.drawRect(0,0,20,20);
    graphics.setColor(Color.BLUE);
    graphics.drawRect(0,0,30,30);
    graphics.setColor(Color.YELLOW);
    graphics.drawRect(0,0,40,40);

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
