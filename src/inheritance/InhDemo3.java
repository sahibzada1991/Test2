package inheritance;

class parent{
	
	int a;
	void display() {
		
		System.out.println(a);
	}
}

class child1 extends parent{
	
	int x;
	void print() {
		
		System.out.println(x);
	}
}

class child2 extends parent{
	
	int y;
	void show() {
		
		System.out.println(y);
	}
	
}

public class InhDemo3 {

	public static void main(String[] args) {
		
		child1 c1 = new child1();
		
		c1.a = 100;
		c1.x = 200;
		c1.display();
		c1.print();
		
		child2 c2 = new child2();
		
		c2.a = 10;
		c2.y = 20;
		
		c2.display();
		c2.show();
		
		

	}

}
