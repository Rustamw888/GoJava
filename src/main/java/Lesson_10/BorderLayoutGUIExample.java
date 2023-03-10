package Lesson_10;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutGUIExample {

  public static void main(String[] args) {
    JPanel windowContent = new JPanel();
    BorderLayout borderLayout = new BorderLayout();
    windowContent.setLayout(borderLayout);

    // Создание
    JLabel label1 = new JLabel("Number1");
    JTextField textField1 = new JTextField(10);
    JButton button1 = new JButton("ADD");
    JLabel label2 = new JLabel("Number2");
    JTextField textField2 = new JTextField(10);
    JButton button2 = new JButton("ADD");

    // Заполнение
    windowContent.add("North", label1);
    windowContent.add("South", button1);
    windowContent.add("East", textField1);
    windowContent.add("West", label2);
    windowContent.add(button2);
    windowContent.add(textField2);

    JFrame frame = new JFrame();
    frame.setContentPane(windowContent);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setVisible(true);
  }

}
