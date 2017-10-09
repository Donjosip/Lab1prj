package org.lu.ics.labbar;


import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		String name; 
		
		String efternamn;
		
		
		System.out.print("Förnamn:");
		name = stdIn.nextLine();
		
		System.out.print("Efternamn:");
		efternamn = stdIn.nextLine();
		
		
		
		System.out.println();
		System.out.println(efternamn + name);
		
				stdIn.close();
		
		
	}

}
