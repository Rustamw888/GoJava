package Lesson_44.part_7;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

import static Lesson_44.part_7.TestRPM.evalAnswer;

public class FormulaParse {

  public static void main(String[] args) {

    String formula = "100-50/5";
//    System.out.println(Arrays.toString(formula.split("\\b")));
//    System.out.println(getPolandNotation(formula).toArray(new String[getPolandNotation(formula).size()]));
    System.out.println(getPolandNotation(formula));
    String[] test = getPolandNotation(formula).toArray(new String[0]);
    System.out.println(test);
    System.out.println(evalAnswer(test));
  }

  private static ArrayDeque<String> getPolandNotation(String text) {

    ArrayDeque<String> box1 = new ArrayDeque<>();
    Stack<String> box2 = new Stack<>();
    char symbol;
    String temp = new String();
    for (int i = 0; i < text.length(); i++) {
      symbol = text.charAt(i);
      if (isDigit(symbol)) {
        temp += String.valueOf(symbol);
//        box1.add(String.valueOf(symbol));
        if (i == text.length() - 1 || !isDigit(text.charAt(i + 1))) {
          box1.add(temp);
          temp = "";
        }
      } else if (isMathSymbol(symbol)) {
        if (getPriority(symbol) == 1) {
          box2.push(String.valueOf(symbol));
        } else if (getPriority(symbol) > 1) {
          while (box2.size() != 0) {
            if (getPriority(box2.peek().charAt(0)) >= getPriority(symbol)) {
              box1.add(box2.pop());
            } else {
              break;
            }
          }
          box2.push(String.valueOf(symbol));
        } else if (getPriority(symbol) == -1) {
          while (getPriority(box2.peek().charAt(0)) != 1) {
            box1.add(box2.pop());
          }
          box2.pop();
        }
      }
    }
    while (!box2.isEmpty()) {
      box1.add(box2.pop());
    }
    return box1;
  }

  private static boolean isDigit(char c) {
    if (c >= '0' && c <= '9' || c == '.') {
      return true;
    }
    return false;
  }

  private static boolean isMathSymbol(char c) {
    if (c == '(' || c == ')' || c == '-' || c == '+' || c == '/' || c == '*') {
      return true;
    }
    return false;
  }

  private static int getPriority (char c) {
    if (c == '/' || c == '*') {
      return 3;
    } else if (c == '-' || c == '+') {
      return 2;
    } else if (c == '(') {
      return 1;
    } else if (c == ')') {
      return -1;
    } else {
      return 0;
    }
  }
}
