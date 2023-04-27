package lesson_60.lesson_60;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TestButton extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Hello Button");

    Group root = new Group();
    Scene scene = new Scene(root, 500, 500);

    Button button1 = new Button();
    button1.setLayoutX(20);
    button1.setLayoutY(20);
    button1.setText("Hello Button 1");
    button1.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        System.out.println("Hello Button 1");
      }
    });

    Button button2 = new Button();
    button2.setLayoutX(40);
    button2.setLayoutY(60);
    button2.setText("Hello Button 2");
    button2.setStyle("-fx-font: bolt italic 12pt Arial; -fx-text-fill: red; -fx-background-color: green");
    button2.setPrefSize(200, 30);
    button2.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        button1.setBlendMode(BlendMode.DARKEN);
        Circle circle = new Circle(75, 53, 80);
        button1.setClip(circle);
        button1.setCursor(Cursor.CLOSED_HAND);
        DropShadow effect = new DropShadow();
        effect.setOffsetX(10);
        effect.setOffsetY(10);
        button1.setEffect(effect);
        button1.setOpacity(0.5);
        button1.setRotate(10);
        button1.setPrefSize(80, 80);
        button1.setTranslateZ(-10);
      }
    });

    root.getChildren().add(button1);
    root.getChildren().add(button2);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }

}
