package oops;

/*
 * all methods in interface should be called in any class and that should be inherited.
 * 
 */

interface O {
	void a();

	void b();

	static void c() {
		System.out.println("in static method c");
	}
}

abstract class M implements O {
	public void a() {
		System.out.println("a");
	}
}

class N extends M {
	public void b() {
		System.out.println("b");
	};
}

public class LearnInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O obj = new N();
		obj.a();

	}

}
