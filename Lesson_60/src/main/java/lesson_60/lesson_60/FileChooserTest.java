package lesson_60.lesson_60;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import java.io.File;

public class FileChooserTest extends Application {

  FileChooser fileChooser = new FileChooser();

  @Override
  public void start(Stage primaryStage) throws Exception {
    Group root = new Group();
    Scene scene = new Scene(root, 500, 500, Color.BISQUE);

    Button button = new Button("Open File");
    button.setLayoutX(200);
    button.setLayoutY(200);
    root.getChildren().add(button);

    button.setOnAction(event -> {
      fileChooser.setInitialDirectory(new File("C:\\ProjectsJob\\GoJava\\Lesson_60\\src\\main\\java\\lesson_60\\lesson_60"));
      fileChooser.setTitle("Select file");

      FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Select a .java", "*.java");
      fileChooser.getExtensionFilters().add(filter);
      File file = fileChooser.showOpenDialog(primaryStage);

      String filePath = file.toURI().toString();
      System.out.println(filePath);
    });

    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
