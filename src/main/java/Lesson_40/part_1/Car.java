package Lesson_40.part_1;

public class Car {

  Frame frame;
  Engine engine;
  Vehicle vehicle;

  public Car() {
  }

  public Car(Frame frame, Engine engine, Vehicle vehicle) {
    this.frame = frame;
    this.engine = engine;
    this.vehicle = vehicle;
  }

  public Frame getFrame() {
    return frame;
  }

  public void setFrame(Frame frame) {
    this.frame = frame;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }
  
}
