package Lesson_38.part_1;

import javax.swing.*;

public class MainTest {

  public static void main(String[] args) {
    PainterFigure painter = new PainterFigure();

    JFrame frame = new JFrame("My Frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 500);
    frame.setLocation(300, 200);
    frame.setResizable(true);
    frame.add(painter);
    frame.setVisible(true);
  }
}
