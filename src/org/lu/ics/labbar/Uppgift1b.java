package org.lu.ics.labbar;


import java.util.Scanner;

public class Uppgift1b {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		String namn; 
				
		System.out.print("Ange ditt namn:");
		namn = stdIn.nextLine();
		
		stdIn.close();
		
		Scanner readInt = new Scanner(System.in);
		
		int timlön;
		int arbetadeTimmar;
		
		System.out.print("Ange din timlön:");
		timlön = readInt.nextInt();
		
		System.out.print("Ange antal arbetade timmar:");
		arbetadeTimmar = readInt.nextInt();
		
		readInt.close();
		
		System.out.println(namn.toUpperCase() + "du tjänade" )

		
		
		
	}

}
