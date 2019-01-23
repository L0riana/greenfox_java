import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    int startX = 0;
    int startY = 0;
    drawLines(graphics, startX, startY);

  }

  public static void drawLines(Graphics graphics, int x, int y) {
    for (int i = 0; i < WIDTH/20; i++) {
      if (x != 0){
        x = x + 20;
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
      } else if (x == WIDTH){
        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
        y = y + 20;
      }
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