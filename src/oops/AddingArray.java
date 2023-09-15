package oops;

import java.util.Arrays;

/*creating the class to do array addition for single dimensional and multidimensional array 
using overloading method*/

class Add{
	//single dimensional array
	static int addingArray(int[] arr1){
		int sumArr1=0;
		for(int i:arr1) {
			
			sumArr1+=i;
		}
		return sumArr1;
	}
	//multidimensional array
	static void addingArray(int[][] arr) {
		int sum =0;
		for (int i =0; i<arr.length; i++) {
			 sum =0;
			for (int j=0; j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		   System.out.println("The sum of " + (i +1) +"st row is " + sum); 
		}
		
	}
}

public class AddingArray {
	public static void main(String arg[]) {
		int arr1[] = {4,6,8};
		int arr[][]= {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
		
		Add a = new Add();// class object creation
		System.out.println("The sum of array is " + a.addingArray(arr1));//calling the static array function
		 a.addingArray(arr);//calling the multidimensional array
// getting 	
		
		
		
		
	
	
	}
}
