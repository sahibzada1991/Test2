package jumping_statements;

public class JUmpingStatementDemo2 {

	public static void main(String[] args) {
		
		for (int a = 1; a <=10; a++) {
			
			if (a == 3 || a == 5 || a== 7 || a == 9) {
				
				continue;
			}
			
			System.out.println(a);
			
		}

	}

}
