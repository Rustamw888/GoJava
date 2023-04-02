package Lesson_38.part_1;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class PainterFigure extends JPanel implements Runnable {

  Points points = new Points(50, 50);
  private int x = points.getX();
  private int y = points.getY();

  public PainterFigure(String title) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(900, 900);
    frame.setLocation(100, 100);
    frame.setResizable(true);
    frame.add(this);
    frame.setVisible(true);
    new Thread(this).start();
  }

  @Override
  public void paintComponent(Graphics g) {
//    super.paintComponent(g);
//    this.setBackground(Color.BLUE);
    g.setColor(Color.MAGENTA);
    g.fillRect(x + 450, y + 450, 5, 5);
  }

  @Override
  public void run() {
    double teta = 0;
    while (true) {
      try {
        teta += 0.1;
        points.spirograf(teta, 80, 190, 80);
        x = points.getX();
        y = points.getY();
        this.repaint();
        sleep(10);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
}

class Points {
  private int x;
  private int y;

  public Points(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void sinusoida(int x) {
    if (x > 1000) {x = 0;}
    this.y = (int) (Math.sin((double) 8 * x * Math.PI / 180) * 50) + 100;
  }

  public void spirograf(double teta, double R, double r, double d) {
    this.x = (int) ((R - r) * Math.cos(teta) + d * Math.cos((R - r) * teta / r));
    this.y = (int) ((R - r) * Math.sin(teta) + d * Math.sin((R - r) * teta / r));
  }
}
