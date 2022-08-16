package sampleJavaPrograms;

public class HandleNumbers {

	public static void main(String[] args) {
		
		
		int a = 100;
		
		System.out.println(a);
		
		// Convert integer to String
		String str = String.valueOf(a);
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		String b = "200";
		
		System.out.println(b);
		
		int n= Integer.parseInt(b);
		
		System.out.println(n);
		
		String str1 = "Welcome to Selenium Java Automation Testing";
		
		// Testing Automation Java Selenium to Welcome
		//emocleW ot muineleS avaJ noitamotuA gnitseT
		
		int stelen = str1.length();
		
		System.out.println(stelen);
		
		for (int i=0; i<stelen; i++) {
			
			char ch = str1.charAt(i);
			
			System.out.println(ch);
		
		}
		
		String reversestr = "";
		
		//Welcome to Selenium Java Automation Testing
		//emocleW ot muineleS avaJ noitamotuA gnitseT
		
		for (int j=0; j<stelen; j++) {
			
			reversestr = str1.charAt(j) + reversestr;  // W eW leW cleW ocleW mocleW emocleW
			
		}
		System.out.println(reversestr);
		
		
		String[] strsplit = str1.split(" ");
		
		String reverseword ="";
		
		for (int k=0; k<strsplit.length; k++) {
			
			reverseword = strsplit[k] +" "+ reverseword;  
		}
		//Welcome to Selenium Java Automation Testing
		//Testing Automation Java Selenium to Welcome 
		System.out.println(reverseword);
		
		String reverseword1 ="";
		
		for (int k=0; k<strsplit.length; k++) {
			
			StringBuilder s = new StringBuilder(strsplit[k]);
			
			reverseword1 = reverseword1 + " " +s.reverse(); // emocleW  emocleW ot
			
		}
		
		System.out.println(reverseword1);
		
		int x = 100;
		
		int y = 200;
		
		x = x + y; // 300
		
		y= x-y; // 300-200 // 100
		
		x= x-y;// 300-100 // 200
		
		
		
		System.out.println("x value is after swapping:" +x);
		System.out.println("y value is after swapping:" +y);
		
		
		
		
		//System.out.println(strsplit[0]);
		//System.out.println(strsplit[1]);
		//System.out.println(strsplit[2]);
		//System.out.println(strsplit[3]);
		//System.out.println(strsplit[4]);
		//System.out.println(strsplit[5]);
		
		
		int d = 100;
		int e =200;
	}

}
