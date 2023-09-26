package controlStatements;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// triangle pattern using class and method

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int i, j, k = 0;
		for (i = 0; i < num; i++) {

			for (j = num; j > i; j--) {
				System.out.print(" ");
			}

			for (k = 0; k < i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		/*----second half using while loop----------*/
		for (i = 0; i < num; i++) {

			for (j = num; j > i; j--) {
				System.out.print(" ");
			}

			for (k = 0; k < i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
