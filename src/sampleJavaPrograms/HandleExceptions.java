package sampleJavaPrograms;

import java.io.File;

import jxl.Workbook;

public class HandleExceptions {

	public static void main(String[] args) throws Exception {
		
		try {
			
		Workbook workbook = Workbook.getWorkbook(new File("D:\\workbook.xls"));
		
		} catch (Exception e) {
			throw new Exception("File not found");
			//e.getMessage();
		} finally {
			
			System.out.println("finally statement");
			
		}
		

	}

}
