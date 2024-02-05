public class Mammal extends Animal {
  String furColor;
  int legs;

  void giveBirth()
  {
    System.out.println("Giving Birth");
  }

  void produceMilk()
  {
    System.out.println("Producing Milk");
  }

  void swim()
  {
    System.out.println("Swimming");
  }

  // method over ridng
  @Override
  void makeSound()
  {
    System.out.println("Mammal making sound");
  }
}
