public class Hero extends Person {
  String power;


  Hero(String name, int age, String power) {

    super(name, age);
    // this.name = name;
    // this.age = age;
    this.power = power;
  }

  public void display()
  {
    System.out.println("Displaying Hero: ");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Super Power: " + power);
  }
}