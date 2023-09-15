package oops;

public class LearnConstructor {
	 void m(LearnConstructor obj){  
		  System.out.println("method is invoked");  
		  }  
		  void p(){  
		  m(this);  
		  }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnConstructor s1 = new LearnConstructor();  
		  s1.p(); 
	}

}
  
