package Lesson_10.forms;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MyForm1 {

  JFrame frame;
  JTextField field1;
  JTextField field2;

  public MyForm1(String name) {
    frame = new JFrame(name);
    frame.setLayout(new FlowLayout());
    field1 = new JTextField(10);
    field2 = new JTextField(10);
    frame.add(field1);
    frame.add(field2);

    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

}
