package Lesson_18.part_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Nabludatel {

  private int temp = 0;
  private int pressure = 0;

  public void update(int temp, int pressure) {
    this.temp = temp;
    this.pressure = pressure;
  }

}
