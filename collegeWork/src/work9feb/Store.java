package work9feb;

import java.util.Scanner;

public class Store {
	static int num1, num2;

	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");

		if (sc.hasNextInt()) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();

		}
		sc.close();
	}

}
