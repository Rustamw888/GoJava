package Lesson_10;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class BoxLayoutGUIExample {

  public static void main(String[] args) {
    JPanel windowContent = new JPanel();
    BoxLayout boxLayout = new BoxLayout(windowContent, BoxLayout.X_AXIS);
//  BoxLayout boxLayout = new BoxLayout(windowContent, BoxLayout.Y_AXIS);
//  BoxLayout boxLayout = new BoxLayout(windowContent, BoxLayout.PAGE_AXIS);
//  BoxLayout boxLayout = new BoxLayout(windowContent, BoxLayout.LINE_AXIS);

    windowContent.setLayout(boxLayout);

    // Создание
    JLabel label1 = new JLabel("Number1");
    JTextField textField1 = new JTextField(10);
    JButton button1 = new JButton("ADD");
    JLabel label2 = new JLabel("Number2");
    JTextField textField2 = new JTextField(10);
    JButton button2 = new JButton("ADD");

    // Заполнение
    windowContent.add(label1);
    windowContent.add(button1);
    windowContent.add(textField1);
    windowContent.add(label2);
    windowContent.add(button2);
    windowContent.add(textField2);

    JFrame frame = new JFrame();
    frame.setContentPane(windowContent);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setVisible(true);

  }

}
