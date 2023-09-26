package controlStatements;
import java.util.Scanner;


public class CalculateAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		// using if, else if and else condition
		if (age<18){
			System.out.println("less than 18");
		}

		else if (age==18){
			System.out.println("is 18");
		}

		else{
			System.out.println("greater than 18");
		}

	}

}
