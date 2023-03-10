package Lesson_10.fields;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FieldsExamples extends JFrame {

  private JTextField field1;
  private JTextField field2;
  private ConverterForExamples converter = new ConverterForExamples();

  public FieldsExamples(String name) {
    super(name);
    setLayout(new FlowLayout());
    field1 = new JTextField(10);
    field2 = new JTextField(10);

    add(field1);
    add(field2);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
    setVisible(true);

    field1.addActionListener(converter);
    field2.addActionListener(converter);
  }

  private class ConverterForExamples implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
      String str = "";
      if (event.getSource() == field1) {
        str = String.format("Field 1: %s", event.getActionCommand());
      } else if(event.getSource() == field2) {
        str = String.format("Field 2: %s", event.getActionCommand());
      }
      JOptionPane.showMessageDialog(null, str);
    }
  }
}


