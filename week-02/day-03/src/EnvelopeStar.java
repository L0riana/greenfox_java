import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {

    drawLines(graphics);

  }

  private static void drawLines(Graphics graphics) {
    int x = 15; //number of lines per side
    int n = 2;
    for (int i = 0; i < x; i++) {
      graphics.setColor(Color.GREEN);
      graphics.drawLine(WIDTH / 2, 0, WIDTH / 2, WIDTH);
      graphics.drawLine(0, WIDTH / 2, WIDTH, WIDTH / 2);
      graphics.drawLine(i * WIDTH / n / x, WIDTH / n, WIDTH / n, WIDTH / n - (i + 1) * WIDTH / x / n);
      graphics.drawLine(WIDTH / n, i * WIDTH / n / x, WIDTH / n + (i + 1) * WIDTH / n / x, WIDTH / n);
      graphics.drawLine(i * WIDTH / n / x, WIDTH / n, WIDTH / n, (i + 1) * WIDTH / n / x + WIDTH / n);
      graphics.drawLine(WIDTH / n, WIDTH - i * WIDTH / n / x, WIDTH / n + (i + 1) * WIDTH / n / x, WIDTH / n);
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
