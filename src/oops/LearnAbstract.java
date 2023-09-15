package oops;

abstract class Bank{    
protected abstract int getRateOfInterest();    

public void display() {
	System.out.println("Hi,bhuvi");
}

}  



class SBI extends Bank{    
public int getRateOfInterest(){return 7;}    
}    
class PNB extends Bank{    
public int getRateOfInterest(){return 8;}    
}    

abstract class IND extends Bank{
	
}
    class LearnAbstract{    
public static void main(String args[]){    
Bank b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
}}    