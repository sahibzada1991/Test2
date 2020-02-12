package inheritance;

//Parent class
class E {

	int a;

	void display() {

		System.out.println(a);
	}
}

// child class

class J extends E {

	int b;
	

	void print() {

		System.out.println(b);
	}

}

public class InheritanceDemo1 {

	public static void main(String[] args) {

		E obj = new E();

		obj.a = 100;
		obj.display();

		J obj1 = new J();

		obj1.b = 200;
		obj1.a = 100;

		obj1.display();
		obj1.print();

	}

}
