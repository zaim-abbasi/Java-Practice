import java.util.Scanner;
// BASIC CALCULATOR APP
public class calculator {
  public static void main(String[] args) {
    // basic calculator in java
    int num1, num2;
    int result = 0;
    char operator;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    num2 = scanner.nextInt();

    System.out.println("Enter Operator: ");
    System.out.println("+ - * /");
    operator = scanner.next().charAt(0);
    
    
    if (operator == '+') {
      // plus operation
      result = num1 + num2;
    }
    else if (operator == '-') {
      // minus operation
      result = num1 - num2;
    }
    else if (operator == '*') {
      // multiply operator
      result = num1 * num2;
    }
    else if (operator == '/') {
      // divide operator
      result = num1 / num2;
    }
    else
    System.out.println("Invalid operator");

    System.out.println("Result is " + result);

  }
}
