import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// int num = 5;
		// System.out.println("Number is " + num);

		// boolean flag = false;
		// if(flag == false)
		// {
		// System.out.println("False");
		// }

		// float a = 3.4f;

		// double b = 6.6;

		// String x = "Water", y = "Kool-Aid";
		// String temp;

		// temp = x;
		// x = y;
		// y = temp;

		// System.out.println("X: " + x);
		// System.out.println("Y: " + y);
		// // User Inputs
		// Scanner scanner = new Scanner(System.in);

		// System.out.print("Enter Name: ");
		// String name = scanner.nextLine();

		// System.out.print("Enter age: ");
		// int age = scanner.nextInt();

		// System.out.print("Enter your City name: ");
		// scanner = null;
		// scanner = new Scanner(System.in);
		// String city = scanner.nextLine();

		// System.out.println("Hello " + name);
		// System.out.println("Your age is " + age);
		// System.out.println("Your city is "+city);
		// double friends = 10;
		// friends = friends / 3;
		// System.out.println(friends);

		// Arrays:
		// String[][] cars;
		// cars = new String[5][5];

		// int [][] num = {
		// {1,2,3},
		// {4,5,6},
		// {7,8,9}
		// };
		// Traversal
		/*
		 * num.length: gives the number of rows
		 * num[i].length: gives the number of columns
		 */
		// for(int i = 0 ; i < num.length;i++)
		// {
		// for(int j = 0; j < num[i].length; j++)
		// {
		// System.out.print(num[i][j] + " ");
		// }
		// }

		// //Wrapper classes
		// Integer num = Integer.valueOf(5);
		// String name = String.valueOf("Zaim");
		// int a = 120;
		// String b = Integer.toString(a);
		// System.out.println(b);

		// Array List
		// ArrayList<String> list = new ArrayList<>(); // creates a string array list

		// list.add("Apple"); // adding elements in list
		// list.add("Banana");
		// list.add("Orange");

		// list.remove("Apple");
		// // list.get(index): element access hota ha
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i));
		// }
		// // for each loop
		// for (String fruits : list) {
		// System.err.println(fruits);
		// }

		// ArrayList<ArrayList<Integer>> twoDlist = new ArrayList<>();

		// ArrayList<Integer> row1 = new ArrayList<>();
		// row1.add(1);
		// row1.add(2);
		// row1.add(3);

		// ArrayList<Integer> row2 = new ArrayList<>();
		// row2.add(1);
		// row2.add(2);
		// row2.add(3);

		// twoDlist.add(row1);
		// twoDlist.add(row2);

		// // accessing element
		// int element_1 = twoDlist.get(0).get(0);
		// System.out.println(element_1);

		// ArrayList<String> studentNames = new ArrayList<>();

		// Methods
		hello();

	}

	static void hello() {
		System.out.println("Hello");
	}

}
