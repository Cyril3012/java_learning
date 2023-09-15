package LearnException;
/*
 * Arithmetic exception runs first and the ArrayIndex out of bound exception
 * dont give Exception e in start it will block the exception below and rise compile-time error
 */

public class MultipleException {

	public static void main(String[] args) {

		try

		{

			int a[] = new int[5];
			a[6] = 30 / 1;
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		System.out.println("rest of the code");
	}
}