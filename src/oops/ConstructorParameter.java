package oops;

public class ConstructorParameter {
	
	int x;
	int y;
	
	ConstructorParameter (int a, int b){
		
		x = a;
		y = b;
	}
	
	void display() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		ConstructorParameter cp = new ConstructorParameter(40, 20);
		
		cp.display();
		

	}

}
