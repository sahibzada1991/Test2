package multi_dimantion_arrays;

public class MultiDimantionArraysDemo2 {

	public static void main(String[] args) {
		
		//int a [][] = new int [3][2];
		int a [][] = {{100,200},{300,400},{500,600}};		

		System.out.println("Number of rows" + a.length);
		System.out.println("Number of colums" + a[0].length);
		
		//enhanced for loop
		
		for (int r[]: a){
			
			for (int i:r) {
				System.out.println(i);
			}
			
		}

		//for (int i = 0; i < a[i].length; i++)

		{
			//for (int j = 0; j < a[i].length; j++)

			{
			//	System.out.println(a[i][j]);
	}

		}
	}
}
		
			
		
		