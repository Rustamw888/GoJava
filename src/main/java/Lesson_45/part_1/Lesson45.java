package Lesson_45.part_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Lesson45 {

  public static void main(String[] args) {

    Car car1 = new Car("Audi", 2015, "Red");
    Car car2 = new Car("Audi", 2016, "Green");
    Car car3 = new Car("Vaz", 2020, "Black");

//    Map<Car, String> cars = new TreeMap<>();
//    cars.put(car1, "1");
//    cars.put(car2, "2");
//    System.out.println(cars);

//    ArrayList<Car> cars = new ArrayList<>();
//    cars.add(car2);
//    cars.add(car1);
//    cars.sort(Car::compareTo);
//    cars.forEach(n -> System.out.println(n.getColorAuto()));

//    ArrayList<Car> cars = new ArrayList<>();
//    CarColorComparator carComparator = new CarColorComparator();
//    cars.add(car1);
//    cars.add(car2);
//    cars.add(car3);
//    cars.forEach(n -> System.out.println(n.toString()));
//    cars.sort(carComparator);
//    cars.forEach(n -> System.out.println(n.toString()));

    ArrayList<Car> cars = new ArrayList<>();
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);
    cars.forEach(n -> System.out.println(n.toString()));
    System.out.println("--------------------------------------------");
    cars.sort(new CarModelComparator());
    cars.forEach(n -> System.out.println(n.toString()));
    System.out.println("--------------------------------------------");
    cars.sort(new CarModelComparator().thenComparing(new CarColorComparator()));
    cars.forEach(n -> System.out.println(n.toString()));
    System.out.println("--------------------------------------------");
    cars.sort(new CarModelComparator().thenComparing(new CarColorComparator()).thenComparing(Car::compareTo));
    cars.forEach(n -> System.out.println(n.toString()));

  }
}

class CarColorComparator implements Comparator<Car> {

  @Override
  public int compare(Car o1, Car o2) {
    return o1.getColorAuto().compareTo(o2.getColorAuto());
  }
}

class CarModelComparator implements Comparator<Car> {

  @Override
  public int compare(Car o1, Car o2) {
    return o1.getModelAuto().compareTo(o2.getModelAuto());
  }
}

class Car implements Comparable {

  private String modelAuto;
  private int productionYear;
  private String colorAuto;

  public Car(String modelAuto, int productionYear, String colorAuto) {
    this.modelAuto = modelAuto;
    this.productionYear = productionYear;
    this.colorAuto = colorAuto;
  }

  public String getModelAuto() {
    return this.modelAuto;
  }

  public int getProductionYear() {
    return this.productionYear;
  }

  public String getColorAuto() {
    return this.colorAuto;
  }

  @Override
  public String toString() {
    return "Car{" +
        "modelAuto='" + modelAuto + '\'' +
        ", productionYear=" + productionYear +
        ", colorAuto='" + colorAuto + '\'' +
        '}';
  }

  @Override
  public int compareTo(Object o) {
//    if (this.getProductionYear() == ((Car) o).getProductionYear()) {
//      return 0;
//    } else if (this.getProductionYear() > ((Car) o).getProductionYear()) {
//      return 1;
//    } else {
//      return -1;
//    }
    return this.getProductionYear() - ((Car) o).getProductionYear();
  }
}
