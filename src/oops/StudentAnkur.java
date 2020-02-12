package oops;

public class StudentAnkur {

	int sId;
	String sName;
	char grade;

	void getValues(int id, String name, char g) {
		
		

		sId = id;
		sName = name;
		grade = g;

	}
	
	void display() {
		
		System.out.println(sId + " "+ sName+ " "+ grade);
	}
	
	

}
