package this_keywords;

public class ThisKeywordDemo1 {
	
	
	//Keyword this is a reference variable in java that refers to current object.
	
	int a, b; //instance variable 
	
	void getvalues(int a, int b) {
		
	this.a = a;
	 this.b = b;
			  //method variable
	}
	
	void printvalues() {
		
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		
		ThisKeywordDemo1 th = new ThisKeywordDemo1();
		
		th.getvalues(10, 200);
		th.printvalues();
		

	}

}
