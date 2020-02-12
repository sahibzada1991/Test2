package overriding;

class bank{
	
	double rateOfInterest() {
		
		return 0;
	}
}

class citi extends bank{
	
	double rateOfInterest() {
		
		return 10.5;
	}
}

class bofo extends bank{
	
	double rateOfInterest() {
		
		return 5.5;
	}
	
}

class cp1 extends bank{
	
	double rateOfInterest() {
		
		return 22.5;
	}
}


public class OverridingDemo1 {

	public static void main(String[] args) {
	
		
		citi ci = new citi();
		System.out.println(ci.rateOfInterest());
		
		bofo bo = new bofo();
		System.out.println(bo.rateOfInterest());
		
		cp1 cp = new cp1();
		System.out.println(cp.rateOfInterest());
		
		

	}

}
