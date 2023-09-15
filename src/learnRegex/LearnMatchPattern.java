
package learnRegex;

import java.util.regex.Pattern;

class LearnMatchPattern {
	public static void main(String args[]) {
		var num = 0;

		System.out.println(((Object) num).getClass().getSimpleName());
		System.out.println(Pattern.matches("[amn]", "abcd"));// false (not a or m or n)
		System.out.println(Pattern.matches("[amn]", "a"));// true (among a or m or n)
		System.out.println(Pattern.matches("[a]", "amna"));// false (m and a comes more than once)
	}
}
