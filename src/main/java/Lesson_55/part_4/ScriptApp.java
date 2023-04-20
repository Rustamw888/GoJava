package Lesson_55.part_4;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ScriptApp {

  public static void main1(String[] args) {
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("graal.js");

    try {
      engine.eval("print('Hello')");
      engine.eval("x = 2");
      Object x = engine.get("x");
      System.out.printf("x: = %s\n", x);
    } catch (ScriptException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main2(String[] args) {
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("graal.js");

    try {
      engine.eval("print('Hello')");
      engine.eval("x = 2");
      Integer x = Integer.parseInt(engine.get("x").toString());
      System.out.printf("x: = %s\n", x + 100);
    } catch (ScriptException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main3(String[] args) {
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("graal.js");

    try {
      engine.eval(new FileReader("src/main/java/Lesson_55/part_4/script.js"));
    } catch (ScriptException e) {
      throw new RuntimeException(e);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("graal.js");

    try {
      engine.eval(new FileReader("src/main/java/Lesson_55/part_4/script.js"));
      Double y = Double.parseDouble(engine.get("y").toString());
      System.out.printf("y: = %s\n", y + 100);
    } catch (ScriptException e) {
      throw new RuntimeException(e);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
