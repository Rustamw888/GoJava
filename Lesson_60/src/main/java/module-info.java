module lesson_60.lesson_60 {
  requires javafx.controls;
  requires javafx.fxml;

  opens lesson_60.lesson_60 to javafx.fxml;
  exports lesson_60.lesson_60;
}