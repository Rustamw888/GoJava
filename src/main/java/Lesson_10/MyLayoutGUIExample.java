package Lesson_10;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MyLayoutGUIExample {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(600, 600);
    frame.setTitle("Title");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    FlowLayout layout = new FlowLayout();
    frame.setLayout(layout);

    JButton button = new JButton("ADD BUTTON");
    frame.setBounds(80, 50, 100, 20);
    frame.add(button);

    frame.setVisible(true);
  }

}
