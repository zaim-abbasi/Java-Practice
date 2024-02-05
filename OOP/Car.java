public class Car {
  public String make;
  public String model;
  public String color;

  Car() {
    model = make = color = "";
  }

  Car(String make, String model, String color) {
    this.model = model;
    this.make = make;
    this.color = color;
  }

  void display() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Color: " + color);
  }
}


