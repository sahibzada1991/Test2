package oops;

public class ConstructorDemo {
	
	//Default constructor
	
	
	int x;
	int y;
	
	ConstructorDemo (){
		
		x = 10;
		y = 20;
		
	}
	
	void display() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		ConstructorDemo cm1 = new ConstructorDemo();
		
		cm1.display();
		

	}

}
