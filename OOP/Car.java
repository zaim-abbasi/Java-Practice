public class Car {
  public String model;
  public String make;
  public int year;
  public String color;

  Car()
  {
    model = make = color = "";
    year = 0;
  }

  Car(String model, String make, int year, String color)
  {
    this.model = model;
    this.make = make;
    this.year = year;
    this.color = color;
  }

  void display()
  {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Color: " + color);
  }
}
