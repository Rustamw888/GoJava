package Lesson_25.part_5;

import Lesson_25.part_4.Point;
import Lesson_25.part_4.Shape;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.geom.Line2D;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Drawing extends JFrame {

  Shape shape;

  public Drawing(String name) throws HeadlessException {
    super(name);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(10, 10, 630, 725);
    setVisible(true);
  }

  class MyComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      List<Point> points = shape.getPoints();
      Point lastPoint = shape.getLastPoint();
      Graphics2D graphics2D = (Graphics2D) g;
      for (Point point : points) {
        Line2D line = new Line2D.Double(lastPoint.getX(), lastPoint.getY(), point.getX(), point.getY());
        graphics2D.setColor(Color.RED);
        graphics2D.draw(line);
        lastPoint = point;
      }
    }
  }

  public void drawShape(Shape shape) {
    this.shape = shape;
    add(new MyComponent());
  }

  class MyComponent1 extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D graphics2D = (Graphics2D) g;
      Font font = new Font("Arial", Font.BOLD, 20);
      g.setFont(font);
      g.drawString("Дима Zалуповец", 30, 50);
      Image image = new ImageIcon("src/main/java/Lesson_25/part_5/img.png").getImage();
      g.drawImage(image, 0, 70, null);
      g.drawRect(100, 200, 400, 300);
      g.drawLine(130, 400, 200, 300);
      g.setColor(Color.RED);
      g.fillOval(10, 10, 200, 200);
      g.drawOval(10, 10, 200, 200);

      Line2D line2D = new Line2D.Double(0, 0, 100.2, 200.3);
      graphics2D.draw(line2D);
    }
  }
}
