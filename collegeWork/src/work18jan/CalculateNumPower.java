package work18jan;

import java.util.Scanner;

public class CalculateNumPower {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		System.out.println("Enter a power :");
		Scanner sc = new Scanner(System.in);

		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			int power = sc.nextInt();

			int val = (int) Math.pow(num, power);
			System.out.println("Result : " + val);
		}
		sc.close();
	}
}
