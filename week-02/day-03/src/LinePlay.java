import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    drawLines(graphics);

  }

  private static void drawLines(Graphics graphics) {
    int x = 15; //number of lines per side
    for (int i = 0; i < x; i++) {
      graphics.setColor(new Color(153,0,153));
      graphics.drawLine(i*WIDTH/x, 0,WIDTH, (i+1)*WIDTH/x);
      graphics.setColor(Color.GREEN);
      graphics.drawLine(0, i*WIDTH/x,(i+1)*WIDTH/x, WIDTH);
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
