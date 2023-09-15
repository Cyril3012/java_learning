package oops;
/* creating class A,B,C where we assign variable in class A and declare 
   in class B and add in class B*/

class A  //declare private variable and using getter and setter
{
	private int a,b,c;
	public void setA(int a) {
		this.a=a;
	}
	public void setA(int a, int b) {
		this.a=a;
		this.b=b;		
	}
	public void setA(int a, int b,int c) {
		this.a=a;
		this.b=b;	
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	
}

class B extends A   // declareing variable by calling setter function
{

	 
	public void value(int a) {	
	    setA(a);
	}
	
	public void value(int a,int b) {
		setA(a,b);
	}
	
	public void value(int a,int b,int c) {		
		setA(a,b,c);
	   
		
	}
	
	
}

class C extends B  //adding variable by calling getter function
{
	B objB = new B();
	public void add(int a) {
		objB.value(a);
		 System.out.println(objB.getA());
	}
	public void add(int a,int b) {
		 objB.value(a,b);
		System.out.println(objB.getA()+objB.getB());
	}
	public void add(int a,int b,int c) {
		objB.value(a,b,c);
		System.out.println(objB.getA()+objB.getB()+objB.getC());
	}
}

public class TaskAccessModifier{
	public static void main(String[] args) {
		
		C obj = new C();
	//	B objB =new B();
		obj.add(77); //calling add function by 1 parameter
		obj.add(10,20); //calling add function by 2 parameter
		obj.add(44,55,66);
	
		
	}
}
