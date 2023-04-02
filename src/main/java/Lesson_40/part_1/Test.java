package Lesson_40.part_1;

public class Test {

  public static void main(String[] args) {

//    FrameReno frameReno = new FrameReno();
//    EngineReno engineReno = new EngineReno();
//    VehicleReno vehicleReno = new VehicleReno();
//
//    FrameBmw frameBmw = new FrameBmw();
//    EngineBmw engineBmw = new EngineBmw();
//    VehicleBmw vehicleBmw = new VehicleBmw();
//
//    CarBmw carBmw = new CarBmw(frameBmw, engineBmw, vehicleBmw);
//    CarReno carReno = new CarReno(frameReno, engineReno, vehicleReno);

    Frame frameReno = new FrameReno();
    Engine engineReno = new EngineReno();
    Vehicle vehicleReno = new VehicleReno();

    Frame frameBmw = new FrameBmw();
    Engine engineBmw = new EngineBmw();
    Vehicle vehicleBmw = new VehicleBmw();

    Car carBmw = new Car(frameBmw, engineBmw, vehicleBmw);
    Car carReno = new Car(frameReno, engineBmw, vehicleReno);
  }
}
