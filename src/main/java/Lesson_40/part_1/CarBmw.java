package Lesson_40.part_1;

public class CarBmw {

  FrameBmw frameBmw;
  EngineBmw engineBmw;
  VehicleBmw vehicleBmw;

  public CarBmw() {
  }

  public CarBmw(FrameBmw frameBmw, EngineBmw engineBmw, VehicleBmw vehicleBmw) {
    this.frameBmw = frameBmw;
    this.engineBmw = engineBmw;
    this.vehicleBmw = vehicleBmw;
  }

  public FrameBmw getFrameBmw() {
    return frameBmw;
  }

  public void setFrameBmw(FrameBmw frameBmw) {
    this.frameBmw = frameBmw;
  }

  public EngineBmw getEngineBmw() {
    return engineBmw;
  }

  public void setEngineBmw(EngineBmw engineBmw) {
    this.engineBmw = engineBmw;
  }

  public VehicleBmw getVehicleBmw() {
    return vehicleBmw;
  }

  public void setVehicleBmw(VehicleBmw vehicleBmw) {
    this.vehicleBmw = vehicleBmw;
  }
}
