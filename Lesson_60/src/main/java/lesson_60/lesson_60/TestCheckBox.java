package lesson_60.lesson_60;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TestCheckBox extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Hello CheckBox");
    Group root = new Group();

    CheckBox java = new CheckBox("Java");
    java.setStyle("-fx-font: bold italic 12pt Arial;-fx-text-fill: red: -fx-border-color: green");
    java.setLayoutX(20);
    java.setLayoutY(20);
    java.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        show(java);
      }
    });

    java.selectedProperty().addListener(new ChangeListener<Boolean>() {
      @Override
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        System.out.println("Hello");
      }
    });

    CheckBox javaScript = new CheckBox("JS");
    javaScript.setLayoutX(20);
    javaScript.setLayoutY(50);
    javaScript.setOnMouseClicked(event ->  {
      show(javaScript);
      System.out.println(event);
    });

    CheckBox kotlin = new CheckBox("Kotlin");
    kotlin.setLayoutX(20);
    kotlin.setLayoutY(70);
    kotlin.setOnAction(event -> {
      if (javaScript.selectedProperty().getValue() == true) {
        javaScript.setBlendMode(BlendMode.HARD_LIGHT);
        Rectangle clip = new Rectangle(0, 15, 15, 20);
//        javaScript.setClip(clip);
        javaScript.setCursor(Cursor.CROSSHAIR);
        DropShadow effect = new DropShadow();
        effect.setOffsetX(5);
        effect.setOffsetY(10);
        javaScript.setEffect(effect);
        javaScript.setScaleX(2);
      }
    });

    root.getChildren().add(java);
    root.getChildren().add(javaScript);
    root.getChildren().add(kotlin);

    Scene scene = new Scene(root, 500, 500);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }

  private void show(CheckBox ch) {
    if (ch.isSelected()) {
      ch.setStyle("-fx-font: bold italic 10pt Helvetica");
    }
    ch.setStyle("-fx-font: bold italic 12pt Arial;-fx-text-fill: red: -fx-border-color: green");
  }
}
