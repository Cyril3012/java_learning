package LearnException;

//Finalize method calls when the garbage collector take the object  closing files,
//releasing network connections, or freeing native resources.

class Demo {
	public void add(int a, int b) {
		System.out.println(a + b);

	}

	protected void finalize() {
		System.out.println("Called the finalize() method");
	}

}

public class LearnFinalize {

	public static void main(String[] args) {
		Demo obj = new Demo();
		// LearnFinalize obj = new LearnFinalize();
		// printing the hashcode
		System.out.println("Hashcode is: " + obj.hashCode());
		obj.add(5, 5);
		obj = null;
		// calling the garbage collector using gc()
		System.gc();

		System.out.println("End of the garbage collection");
	}

	// defining the finalize method

}
