package hfjava.code.ch05;

import java.util.Scanner;

public class GameHelper {
	private static Scanner scanner = new Scanner(System.in);

	public int getUserInput(String prompt) {
		System.out.print(prompt + ": ");
		int input = scanner.nextInt();
		scanner.nextLine();
		return input;
	}
}
