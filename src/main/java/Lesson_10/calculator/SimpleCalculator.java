package Lesson_10.calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class SimpleCalculator {

  // Создание компонентов
  JPanel window;
  JTextField display;
  JButton button0;
  JButton button1;
  JButton button2;
  JButton button3;
  JButton button4;
  JButton button5;
  JButton button6;
  JButton button7;
  JButton button8;
  JButton button9;
  JButton buttonPoint;
  JButton buttonEqual;
  JButton buttonPlus;
  JButton buttonMinus;
  JButton buttonMultiply;
  JButton buttonSplit;
  JButton buttonPercent;
  JPanel panelButton;

  // Создаем конструктор
  SimpleCalculator() {

    window = new JPanel();
    window.setLayout(new BorderLayout());

    display = new JTextField(30);
    window.add("North", display);

    button0 = new JButton("0");
    button1 = new JButton("1");
    button2 = new JButton("2");
    button3 = new JButton("3");
    button4 = new JButton("4");
    button5 = new JButton("5");
    button6 = new JButton("6");
    button7 = new JButton("7");
    button8 = new JButton("8");
    button9 = new JButton("9");
    buttonPoint = new JButton(".");
    buttonEqual = new JButton("=");
    buttonPlus = new JButton("+");
    buttonMinus = new JButton("-");
    buttonMultiply = new JButton("*");
    buttonSplit = new JButton("/");
    buttonPercent = new JButton("%");

    panelButton = new JPanel();
    panelButton.setLayout(new GridLayout(4, 3));

    // Добавляем кнопки
    panelButton.add(button7);
    panelButton.add(button8);
    panelButton.add(button9);
    panelButton.add(buttonPlus);

    panelButton.add(button4);
    panelButton.add(button5);
    panelButton.add(button6);
    panelButton.add(buttonMinus);

    panelButton.add(button1);
    panelButton.add(button2);
    panelButton.add(button3);
    panelButton.add(buttonMultiply);

    panelButton.add(buttonPoint);
    panelButton.add(button0);
    panelButton.add(buttonEqual);
    panelButton.add(buttonSplit);

//    panelButton.add(buttonPercent);

    window.add("Center", panelButton);

    JFrame frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.pack(); // выбирает окно под размер содержимого
    frame.setContentPane(window);
    frame.setVisible(true);
  }
}
