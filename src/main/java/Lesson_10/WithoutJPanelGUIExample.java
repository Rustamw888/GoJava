package Lesson_10;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class WithoutJPanelGUIExample {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(400, 200);
    frame.setTitle("Title");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    FlowLayout layout = new FlowLayout();
    frame.setLayout(layout);

    JLabel label1 = new JLabel("Number1");
    JButton button1 = new JButton("ADD");
    JTextField textField1 = new JTextField(10);
    JLabel label2 = new JLabel("Number2");
    JButton button2 = new JButton("ADD");
    JTextField textField2 = new JTextField(10);

    frame.add(label1);
    frame.add(button1);
    frame.add(textField1);
    frame.add(label2);
    frame.add(button2);
    frame.add(textField2);

    frame.setVisible(true);
  }

}
