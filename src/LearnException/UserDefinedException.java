package LearnException;

//we have a class Exception

class UserException extends Exception {
	public UserException(String str) {
		super(str);
	}
}

public class UserDefinedException {

	public static void main(String[] args) {

		try {
			throw new UserException("Inside the try block");
		} catch (UserException ude) {
			System.out.println("caught error....");
		}

	}

}
