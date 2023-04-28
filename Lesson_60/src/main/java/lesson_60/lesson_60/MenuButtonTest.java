package lesson_60.lesson_60;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.BlendMode;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenuButtonTest extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    MenuButton button1 = new MenuButton("Edit");
    button1.setLayoutX(50);
    button1.setLayoutY(50);
    button1.setBlendMode(BlendMode.HARD_LIGHT);
    button1.setCursor(Cursor.CLOSED_HAND);
    button1.setPrefSize(100, 50);

    MenuItem menuItemCut = new MenuItem("Cut");
    menuItemCut.setOnAction(event -> System.out.println("CUT"));
    menuItemCut.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));

    MenuItem menuItemCopy = new MenuItem("Copy");
    menuItemCopy.setOnAction(event -> System.out.println("Copy".toUpperCase()));
    menuItemCopy.setAccelerator(KeyCombination.keyCombination("Ctrl+C"));

    MenuItem menuItemPaste = new MenuItem("Paste");
    menuItemPaste.setOnAction(event -> System.out.println("Paste".toUpperCase()));
    menuItemPaste.setAccelerator(KeyCombination.keyCombination("Ctrl+V"));

    button1.getItems().addAll(menuItemCut, menuItemCopy, menuItemPaste);

    Group root = new Group();
    Scene scene = new Scene(root, 400, 400, Color.LIGHTSTEELBLUE);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Button Menu Test");

    root.getChildren().add(button1);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
