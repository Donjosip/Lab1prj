package org.lu.ics.labbar;


import java.util.Scanner;

public class Uppgift1a {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		String ord1; 
		
		String ord2;
		
		
		
		
		System.out.print("Skriv ett ord:");
		ord1 = stdIn.nextLine();
		
		System.out.print("Skriv ytterligare ett ord:");
		ord2 = stdIn.nextLine();
		
		
		
		
		System.out.println(ord1 + " " + ord2);
		
		
		
				stdIn.close();
		
				String ordTotal = ord1 + " " + ord2; 
		System.out.println(ordTotal.length()); // ger mängden chars i strängarna
		
		
		
	}

}
