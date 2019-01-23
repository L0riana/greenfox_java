import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.

    int a, b;
    a = 20;
    b = 200;

    graphics.setColor(Color.RED);
    graphics.drawLine(a, a, b, a);

    graphics.setColor(Color.GREEN);
    graphics.drawLine(b, a, b, b);

    graphics.setColor(Color.BLUE);
    graphics.drawLine(b, b, a, b);

    graphics.setColor(Color.YELLOW);
    graphics.drawLine(a, b, a, a);

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
