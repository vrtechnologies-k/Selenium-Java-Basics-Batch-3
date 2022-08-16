package sampleJavaPrograms;

public class ProgramFlowTest {

	public static void main(String[] args) {
		
		
		//if 
		
		int n = 99;
		
		if (n%2==0) {
			
			System.out.println("number is even");
		} else {
			
			System.out.println("number is odd");
		}
		
		int a = 100;
		
		if (a>1 && a>110) {
			
			System.out.println("Condtion not statisfied");
			
		} else if (a>=10 && a<90) {
			
			System.out.println("condition not satisfied");
			
		} else if (a>=1 && a<100) {
			
			System.out.println("condtion satisfied");
			
		} else {
			
			System.out.println("deafult message");
		}
		
		// for loop
		
		String s ="Welcome to Automation";
		
		System.out.println(s.length());
		
		for (int i=0; i<s.length(); i++) {
			
			System.out.println(s.charAt(i));
			
			if (s.charAt(i) == 'A') {
				
				System.out.println(s.charAt(i));
				
				break;
			}
		}
		
		while (a<100) {
			
			System.out.println("not satisfied");
		}

	}

}
