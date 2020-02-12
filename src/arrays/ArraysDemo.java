package arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//Array is collection of elements of the same data type
		//2 types of arrays
		//1: Single dimensional
		//2: two/ multi dimensional
		// Single Dimensional arrays
		
		//1: Declare an array
		//2:Insert values in to arrays
		//3:Find size of an arrays
		//4: Read values from an arrays
		
		//1: Declare an array
		int a []= new int [5]; //declared arrays with size 5, starting index is 0, last index is 9
		
		//Insert values in to arrays
		a [0] = 100;
		a [1] = 200;
		a [2] = 300;
		a [3] = 400;
		a [4] = 500;
		
		//3:Find size of an arrays
		System.out.println("length of an array : "+a.length);// print length size of  arrays
		
		//4: Read values from an arrays
		//System.out.println(a [2]);

		for (int i = 0; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
	}

}
