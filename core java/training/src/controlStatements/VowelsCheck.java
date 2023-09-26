package controlStatements;
import java.util.Scanner;

// show all vowels in the given sentence 
//for,switch,label,break,continue are used

public class VowelsCheck {

	public static void main(String[] args) {
		//Getting user input
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		System.out.println(word);
		
		outerLoop: for(int i=0; i<word.length();i++) {
			switch(word.charAt(i)) {
			case 'A':
			case 'a':
				System.out.println(word.charAt(i) + " is vowel");
				continue outerLoop;
			case 'E':
			case 'e':
				System.out.println(word.charAt(i) + " is vowel");
				continue outerLoop;
			case 'I':
			case 'i':
				System.out.println(word.charAt(i) + " is vowel");
				continue  outerLoop;
			case 'O':
			case 'o':
				System.out.println(word.charAt(i) + " is vowel");
				continue  outerLoop;
			case 'U':
			case 'u':
				System.out.println(word.charAt(i) + " is vowel");
				continue outerLoop;
			default:
				continue outerLoop;
			}
		}
		
	}

}
