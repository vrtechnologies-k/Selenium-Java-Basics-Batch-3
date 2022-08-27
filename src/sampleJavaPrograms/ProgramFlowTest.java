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

		int c= 100;

		while (c<=100) {

			System.out.println("while loop");

			c = 110;
		}

		int d = 120;

		do {

			System.out.println("do while loop");

			d++;

		} while (d<130);


		String e = "100";
		
		switch(e) {
			case "50":
				System.out.println("50");
				break;
			case "70":
				System.out.println("70");
				break;
			case "100":
				System.out.println("100");
				break;
			default:
				System.out.println("default");
				break;
		}
			

		if (a>1 && a>110) {

			System.out.println("Condtion not statisfied");

		} else if (a>=10 && a<90) {

			System.out.println("condition not satisfied");

		} else if (a>=1 && a<100) {

			System.out.println("condtion satisfied");

		} else {

			System.out.println("deafult message");
		}




	}

}
