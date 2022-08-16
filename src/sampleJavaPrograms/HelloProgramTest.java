package sampleJavaPrograms;

public class HelloProgramTest {
	
	String str = "Welcome to Automation testing"; // instance variable
	
	static String str1= "Welcome to java Programming language";  // static variable

	public static void main(String[] args) {
		
		int a = 10; // local varibale
		
		System.out.println("Hello Welcome to Selenium Java Testing");
		
		System.out.println(str1);
		
		HelloProgramTest h= new HelloProgramTest();  // created reference object for class 
		
		//and call the non static variables and methods into static method
		
		System.out.println(h.str);
		
		h.test();

	}
	
	public void test() {
		
		System.out.println(str);
		
	}

}
