package Lesson_18.part_2;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Izdatel {

  private int temp;
  private int pressure;
  private ArrayList<Nabludatel> nabludatels = new ArrayList<>();

  public Izdatel(int temp, int pressure) {
    this.temp = temp;
    this.pressure = pressure;
  }

  public void addNabludatel(Nabludatel nabludatel) {
    nabludatels.add(nabludatel);
  }

  public void removeNabludatel(Nabludatel nabludatel) {
    nabludatels.remove(nabludatel);
  }

  public void updateInfo() {
    for (Nabludatel nabludatel : nabludatels) {
      nabludatel.update(temp, pressure);
    }
  }

}
