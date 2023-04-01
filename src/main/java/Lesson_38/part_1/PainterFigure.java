package Lesson_38.part_1;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class PainterFigure extends JPanel {

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.BLUE);
    g.setColor(Color.MAGENTA);
    for (int i = 0; i < 100; i++) {
      g.fillRect(50 + i, 50 + i, 50, 50);

    }
  }
}
