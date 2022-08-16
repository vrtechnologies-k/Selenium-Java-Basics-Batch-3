package sampleJavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class HandleArrays {

	public static void main(String[] args) {
		
		
		// Array is a collection of elements, it is a fixed size
		// it will allow only similar data types
		
		// two types of arrays
		
		//single
		//multi dimentional
		
		int a[] = new int[5];
		
		int b[] = {10,20,45,100,15};
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 50;
		a[3] = 60;
		a[4] = 70;
		
		System.out.println(b[2]);
		
		for (int i = 0; i<a.length; i++) {
		
		System.out.println(a[0]);
		
		}
		
		String x[] = new String[5];
		
		x[0] = "venkat";
		x[1] = "Saleem";
		x[2] = "Sravani";
		x[3] = "Madhavi";
		x[4]= "Chandra";
		
		System.out.println(x.length);
		
		for (int j=0; j<x.length; j++) {
			
			System.out.println(x[j]);
		}
		
		//int d[][] = new int[2][5];
		
		//int[][] arr = { { 1, 2 }, { 3, 4 } };
		
		int arr[][] = {{10,20,30,40,50}, {50,100,60,80,200}};
		
		int y = 0;
		
		System.out.println(arr.length);
		
		for (int k= 0; k<arr.length; k++) {
			
			System.out.println(arr[k].length);
			
			for (int l=0; l<arr[k].length; l++) {
				
				System.out.println(arr[k][l]);
			}
			
		}
		
		/// ArrayList
		
		// Syntax
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("venkat");
		str.add("saleem");
		str.add("100");
		str.add("100");
		str.add("venkat");
		str.add("saleem");
		
		for (int i=0; i<str.size(); i++) {
			
			System.out.println(str.get(i));
		}
		
		/*
		 * ArrayList<ArrayList<Integer>> str1 = new ArrayList<>(3);
		 * 
		 * for (int j=0; j<str1.size(); j++) {
		 * 
		 * str1.add(new ArrayList<>()); }
		 * 
		 * System.out.println(str1.get(0).get(0));
		 */
		
		//Java ArrayList class can contain duplicate elements.
		//Java ArrayList class maintains insertion order.
		
		ArrayList<String> al= new ArrayList<String>();
		ArrayList<Integer> al1= new ArrayList<Integer>();
		
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		
		System.out.println(al);
		
		al1.add(10);
		al1.add(50);
		al1.add(100);
		al1.add(500);
		al1.add(1000);
		
		for (String fruit:al) {
			System.out.println(fruit);
		}
		
		// Creating a 2D ArrayList of Integer type
        ArrayList<ArrayList<Integer> > arraylist
            = new ArrayList<ArrayList<Integer> >();
        //{10,20},{50,100}
        
        // One space allocated for R0
        arraylist.add(new ArrayList<Integer>());
 
        // Adding 3 to R0 created above x(R0, C0)
        arraylist.get(0).add(0, 3);
 
        // Creating R1 and adding values
        // Note: Another way for adding values in 2D
        // collections
        arraylist.add(
            new ArrayList<Integer>(Arrays.asList(3, 4, 6)));
 
        // Adding 366 to x(R1, C0)
        arraylist.get(1).add(0, 366);
 
        // Adding 576 to x(R1, C4)
        arraylist.get(1).add(4, 576);
 
        // Now, adding values to R2
        arraylist.add(2, new ArrayList<>(Arrays.asList(3, 84)));
 
        // Adding values to R3
        arraylist.add(new ArrayList<Integer>(
            Arrays.asList(83, 6684, 776)));
 
        // Adding values to R4
        arraylist.add(new ArrayList<>(Arrays.asList(8)));
 
        // Appending values to R4
        arraylist.get(4).addAll(Arrays.asList(9, 10, 11));
 
        // Appending values to R1, but start appending from
        // C3
        arraylist.get(1).addAll(3, Arrays.asList(22, 1000));
        
        System.out.println(arraylist);
 		
	}

}
