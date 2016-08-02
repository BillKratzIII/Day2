package helloclass;

import java.util.Scanner;

public class HiClass {

	public static void main(String[] args) {
		//Example on how to use the scanner
		
		String programUser = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Who am I talking to?");
		programUser = sc.nextLine();
		System.out.println("Hi " + programUser);
		sc.close();
		
		//introduction to arrays
		float[] aBunchOfFloats = new float[5];
		int[] aBunchOfInts = {189,50,93,21,5};
		int aNumber = aBunchOfInts[2];
		System.out.println(aNumber);
		for (int i = 0; i < aBunchOfInts.length; i++) {
			System.out.println(aBunchOfInts[i]);
		}
		
		//introduction to methods
	}
	
	
}
