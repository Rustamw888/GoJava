package Lesson_38.part_1;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class PainterFigure extends JPanel implements Runnable {

  private int x = 50;
  private int y = 50;

  public PainterFigure(String title) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 500);
    frame.setLocation(300, 200);
    frame.setResizable(true);
    frame.add(this);
    frame.setVisible(true);
    new Thread(this).start();
  }

  @Override
  public void paintComponent(Graphics g) {
//    super.paintComponent(g);
    this.setBackground(Color.BLUE);
    g.setColor(Color.MAGENTA);
    g.fillRect(x, y, 5, 5);
  }

  @Override
  public void run() {
    while (true) {
      try {
        x += 1;
        y = (int) (Math.sin((double) 8 * x * Math.PI / 180) * 50) + 100;
        System.out.println(y);
        this.repaint();
        sleep(10);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
}
