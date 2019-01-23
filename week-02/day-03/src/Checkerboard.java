import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.

    int boxNumberPerRow = 8;
    int sizeOfBox = WIDTH/boxNumberPerRow;

    drawCheckerboard(graphics, sizeOfBox);

  }

  private static void drawCheckerboard(Graphics graphics, int sizeOfBox) {
    int x;
    int y;
    for (int row = 0; row < WIDTH / sizeOfBox; row++) {
      for (int col = 0; col < WIDTH / sizeOfBox; col++) {
        if (((row % 2 == 1) && (col % 2 == 1)) || ((row % 2 == 0) && (col % 2 == 0))){
          x = sizeOfBox * row;
          y = sizeOfBox * col;
          graphics.setColor(Color.BLACK);
          graphics.fillRect(x, y, sizeOfBox, sizeOfBox);
        }
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
