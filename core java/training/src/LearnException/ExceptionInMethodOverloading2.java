package LearnException;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

class Parent1 {
	void msg() throws Exception {
		System.out.println("parent method");
	}
}

class Child1 extends Parent1 {
	void msg() {
		System.out.println("in child");
	}
}

class ExceptionInMethodOverloading2 extends Child1 {

	// method to check the age
	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {

			// throw an object of user defined exception
			throw new InvalidAgeException("age is not valid to vote");
		} else {
			System.out.println("welcome to vote");
		}
	}

	void msg() throws ArithmeticException {
		System.out.println(" inner child method");
	}

	public static void main(String args[]) {
		Parent1 p = new ExceptionInMethodOverloading2();

		try {
			p.msg();
		} catch (Exception e) {
		}
		{
			try {
				// calling the method
				validate(13);
			} catch (InvalidAgeException ex) {
				System.out.println("Caught the exception");

				// printing the message from InvalidAgeException object
				System.out.println("Exception occured: " + ex);
			}

			System.out.println("rest of the code...");
		}
	}
}