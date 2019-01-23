import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.

    int size = 50;
    Color color = new Color(0, 0, 0);
    drawRectangle(graphics, size, randomColor(color));

  }

  private static Color randomColor(Color color) {
    Random random = new Random();
    int r = random.nextInt(256);
    int g = random.nextInt(256);
    int b = random.nextInt(256);
    Color randomColor = new Color(r, g, b);
    color = randomColor;
    return randomColor;
  }


  public static void drawRectangle(Graphics graphics, int rectSize, Color color) {
    for (int i = 0; i < WIDTH/rectSize; i++) {
      for (int j = 0; j < HEIGHT/rectSize; j++) {
        graphics.setColor(randomColor(color));
        graphics.fillRect(i*rectSize,j*rectSize, rectSize, rectSize);
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
