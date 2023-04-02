package Lesson_40.part_1;

public class CarReno {

  FrameReno frameReno;
  EngineReno engineReno;
  VehicleReno vehicleReno;

  public CarReno() {
  }

  public CarReno(FrameReno frameReno, EngineReno engineReno, VehicleReno vehicleReno) {
    this.frameReno = frameReno;
    this.engineReno = engineReno;
    this.vehicleReno = vehicleReno;
  }

  public FrameReno getFrameReno() {
    return frameReno;
  }

  public void setFrameReno(FrameReno frameReno) {
    this.frameReno = frameReno;
  }

  public EngineReno getEngineReno() {
    return engineReno;
  }

  public void setEngineReno(EngineReno engineReno) {
    this.engineReno = engineReno;
  }

  public VehicleReno getVehicleReno() {
    return vehicleReno;
  }

  public void setVehicleReno(VehicleReno vehicleReno) {
    this.vehicleReno = vehicleReno;
  }
}
