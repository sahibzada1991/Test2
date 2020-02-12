package inheritance;

class A{
	
	int a ;
	void display() {
		
		System.out.println(a);
	}
}

class B extends A {
	
	int b;
	void print() {
		
		System.out.println(b);
	}
}

class C extends B{
	
	int c;
	void show() {
		System.out.println(c);
	}
}



public class InhDemo2 {

	public static void main(String[] args) {
		
		
		
		C obj3 = new C();
		
		obj3.a = 100;
		obj3.b = 200;
		obj3.c = 300;
		
		obj3.show();
		obj3.display();
		obj3.print();
		
		
		

	}

}
