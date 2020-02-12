package overloading;

public class MethodOverloading {
	
	//method overloading is feature that allow a class to have more than one method have the same name

	void add (int a, int b ) {
		
		System.out.println(a+b);
	}
	
	void add (int a, double b ) {
		System.out.println(a+b);
	}
	
	void add (double a, double b ) {
		System.out.println(a+b);
		
	}
	void add (int a, int b, int c ) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo =  new MethodOverloading();
		
		mo.add(10, 20);
		mo.add(10, 20.0);
		mo.add(1.0, 20);
		mo.add(10, 20, 1);
	}
}
