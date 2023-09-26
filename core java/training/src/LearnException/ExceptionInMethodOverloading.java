package LearnException;
/*
 *  1--> If the superclass method does not declare an exception, subclass overridden method 
 *  	 cannot declare the checked exception but can declare unchecked exception.
 *  2.-->If the superclass method declares an exception, subclass overridden method can declare the 
 *  	 same subclass exception or no exception but cannot declare parent exception.
 * 
 */

class Parent {
	void msg() {
		System.out.println("parent method");
	}
}

class ExceptionInMethodOverloading extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("child method");
	}

	public static void main(String args[]) {
		Parent p = new ExceptionInMethodOverloading();
		p.msg();
	}
}