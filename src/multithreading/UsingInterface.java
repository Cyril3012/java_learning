
package multithreading;

//using interface for multithreading to overcome multilevel inheritance

class Hi implements Runnable
{
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("Hi");
			try{Thread.sleep(1000);} catch(Exception e) {}
		}
		
	}
}

class Hello implements Runnable
{
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("Hello");
			try{Thread.sleep(1000);} catch(Exception e) {}
		}
		
	}
}

public class UsingInterface {

	public static void main(String[] args) {
		Runnable obj1  = new Hi();
		Runnable obj2 = new Hello();
// creating a object for the thread and passing the object of the Runnable class into it,
// Since the thread object calls the run method in it not the run method in interface 
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		try{Thread.sleep(10);} catch(Exception e) {}
		t2.start();

	}

}
