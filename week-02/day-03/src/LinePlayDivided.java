import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayDivided {
  public static void mainDraw(Graphics graphics) {

    drawLines(graphics);

  }

  private static void drawLines(Graphics graphics) {
    int x = 15; //number of lines per side
    int n = 2; //number of boxes per row and column
    int a = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < x; j++) {
        graphics.setColor(new Color(153, 0, 153));
        graphics.drawLine(a + i * WIDTH / n / x, 0, WIDTH / n, (i + 1) * WIDTH / n / x);
        a += WIDTH/n;
      }

    }
    /*for (int i = 0; i < x; i++) {
      graphics.setColor(new Color(153, 0, 153));
      graphics.drawLine(i * WIDTH / n / x, 0, WIDTH / n, (i + 1) * WIDTH / n / x);
      graphics.drawLine(WIDTH / n + i * WIDTH / x / n, 0, WIDTH, (i + 1) * WIDTH / n / x);
      graphics.drawLine(i * WIDTH / n / x, WIDTH / n, WIDTH / n, (i + 1) * WIDTH / n / x + WIDTH / n);
      graphics.drawLine(WIDTH / n + i * WIDTH / x / n, 0 + WIDTH / n, WIDTH, (i + 1) * WIDTH / n / x + WIDTH / n);
      graphics.setColor(Color.GREEN);
      graphics.drawLine(0, i * WIDTH / n / x, (i + 1) * WIDTH / n / x, WIDTH / n);
      graphics.drawLine(WIDTH / n, i * WIDTH / n / x, WIDTH / n + (i + 1) * WIDTH / n / x, WIDTH / n);
      graphics.drawLine(0, WIDTH / n + i * WIDTH / n / x, (i + 1) * WIDTH / n / x, WIDTH);
      graphics.drawLine(WIDTH / n, WIDTH / n + i * WIDTH / n / x, WIDTH / n + (i + 1) * WIDTH / n / x, WIDTH);
    */
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
