package oops;

public class Constructor {

	int sId;
	String sname;
	char grade;

	Constructor(int id, String name, char g)

	{

		sId = id;
		sname = name;
		grade = g;
	}

	void display() {
		System.out.println(sId + " " + sname + " " + grade);
	}

}
