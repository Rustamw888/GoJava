package Lesson_10.forms;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyForm2 extends JFrame {

  private JTextField field1;
  private JTextField field2;

  public MyForm2(String name) {
    super(name);
    setLayout(new FlowLayout());
    field1 = new JTextField(10);
    field2 = new JTextField(10);
    add(field1);
    add(field2);
    pack();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);

  }
}
