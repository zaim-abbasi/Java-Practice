public class Main {
  public static void main(String[] args) {
    // Car myCar = new Car("X", "Tesla",2021, "Blue");

    // Car carArr[] = new Car[4];

    // Car car1 = new Car("A", "Honda", 2021, "White");
    // Car car2 = new Car("X", "Tesla", 2018, "Blue");

    // carArr[0] = car1;
    // carArr[1] = car2;

    // Car[] cars = { car1, car2 };

    // carArr[0].display();
    // System.out.println("");
    // carArr[1].display();

    // Garage garage = new Garage();
    // Car car = new Car("Honda", "City", "Black");

    // garage.park(car);

    // static: single copy of a variable in every object of a class, used inside pre-defined function calling
    Friend friend1 = new Friend("Spongebob");
    Friend friend2 = new Friend("Patric");

    System.out.println(Friend.numberofFriends);
    Friend.FriendsCounter();

  }
}