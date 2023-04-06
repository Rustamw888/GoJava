package Lesson_44.part_7;

import java.util.Stack;

public class TestRPM {

  public static void main(String[] args) {
    String[] RPN = {"100", "50", "5", "/", "-"};
    System.out.println(evalAnswer(RPN));
  }

  public static double evalAnswer(String[] token) {

    Stack<Double> stack = new Stack<>();
    double val;

    for (int i = 0; i < token.length; i++) {
      switch (token[i]) {
        case "+":
          stack.push(stack.pop() + stack.pop());
          break;
        case "-":
          val = stack.pop();
          stack.push(stack.pop() - val);
          break;
        case "*":
          stack.push(stack.pop() * stack.pop());
          break;
        case "/":
          val = stack.pop();
          stack.push(stack.pop() / val);
          break;
        default:
          stack.push(Double.parseDouble(token[i]));
      }
    }
    return stack.pop();
  }
}
