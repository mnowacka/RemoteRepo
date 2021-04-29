package application;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	private static final int TABLE_LENGTH = 3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[TABLE_LENGTH];

		for (int i = 0; i < numbers.length; i++) {

			System.out.println("Type a number >");
			numbers[i] = scanner.nextInt();

		}

		scanner.close();

		System.out.print("Your numbers are: ");
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i]);
//
//			if (i < numbers.length - 1) {
//
//				System.out.print(", ");
//
//			}
//	}
//
//		// int sum = numbers[0] + numbers[1] + numbers[2];
//		int sum = 0;
//
//		for (int i = 0; i < numbers.length; i++) {
//
//			sum = numbers[i] + sum;
//
//		}

		Arrays.stream(numbers).forEach(number -> {
			System.out.println(number);
		});// streamforeach
		
		int sum = 0;// z wykorzystaniem pêtli for each
		for (int number : numbers) {
			sum = number + sum;
		}
		
		System.out.println("Nowa zmiana");

		System.out.printf("\nTotal of your numbers is " + sum + ".");
		
		System.out.println("Zmiana w repo");
		
		System.out.println("Zmiana na NewBrach");
		
	

	}

}
