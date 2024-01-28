import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class gui {
  public static void main(String[] args) {
    // String name = JOptionPane.showInputDialog("Enter your name: ");

    // JOptionPane.showMessageDialog(null, "Hello " + name);

    // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));

    // JOptionPane.showMessageDialog(null, "Your age is " + age);

    // double x = 3.14;
    // double y = -10;

    // double maxNum = Math.max(x, y);
    // double minNum = Math.min(x, y);
    // System.out.println("Larger is " + maxNum);
    // System.out.println("Smaller is " + minNum);

    // // hypontenuse
    // float base, prep, hyp;
    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter base of triangle: ");
    // base = scanner.nextFloat();

    // System.out.print("Enter perpendicular of triangle: ");
    // prep = scanner.nextFloat();

    // hyp = (float) Math.sqrt((base * base) + (prep * prep));

    // System.out.println("Hypontenuse is " + hyp);

    // Random random = new Random();

    // int rand1 = random.nextInt();

    // // limits of random number
    // int rand = random.nextInt(1, 6);
    // // rand = random.nextInt(6);

    // boolean z = random.nextBoolean();
    // System.out.println(z);

    // String day = "";
    // while (true) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter day: ");
    // day = scanner.nextLine();

    // switch (day) {
    // case "Sunday":
    // case "Saturday": {
    // System.out.println("Today is Holiday");
    // break;
    // }
    // case "Monday":
    // case "Tuesday":
    // case "Wednesday":
    // case "Thursday":
    // case "Friday": {
    // System.out.println("Today is Working day");
    // break;
    // }
    // case "end": {
    // // exit program
    // System.exit(0);
    // break;
    // }
    // default: {
    // System.out.println("Invalid day entered!");
    // }

    // }

    // }

    // Arrays
    String[] cars = new String[5];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < cars.length; i++) {
      System.out.print("Enter car: ");
      cars[i] = scanner.nextLine();

      scanner = null;
      scanner = new Scanner(System.in);
    }

    System.out.println("Your cars are :");
    for (int i = 0; i < 5; i++) {
      System.out.print(cars[i] + " ");
    }

  }

}
