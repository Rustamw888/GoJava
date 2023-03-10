package Lesson_10;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayoutGUIExample {

  public static void main(String[] args) {
    JPanel windowContent = new JPanel();
    FlowLayout flowLayout = new FlowLayout();
    windowContent.setLayout(flowLayout);

    // Создание
    JLabel label1 = new JLabel("Number1");
    JTextField field1 = new JTextField(10);
    JButton button1 = new JButton("ADD");
    JLabel label2 = new JLabel("Number2");
    JTextField field2 = new JTextField(10);
    JButton button2 = new JButton("ADD");

    // Размещение
    windowContent.add(label1);
    windowContent.add(button1);
    windowContent.add(field1);
    windowContent.add(label2);
    windowContent.add(button2);
    windowContent.add(field2);

    JFrame frame = new JFrame();
    frame.setContentPane(windowContent);

    frame.setSize(400, 200);
    frame.setVisible(true);
  }

}
