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
public class Izdatel implements IIzdatel {

  private int temp;
  private int pressure;
  private ArrayList<INabludatel> nabludatels = new ArrayList<>();

  public Izdatel(int temp, int pressure) {
    this.temp = temp;
    this.pressure = pressure;
  }

  public void addNabludatel(INabludatel nabludatel) {
    nabludatels.add(nabludatel);
    updateInfo();
  }

  public void removeNabludatel(INabludatel nabludatel) {
    nabludatels.remove(nabludatel);
  }

  public void updateInfo() {
    for (INabludatel nabludatel : nabludatels) {
      nabludatel.update(temp, pressure);
    }
  }

}
