package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppgift2a { // Final commit

	public static void main(String[] args) {
		
	int tal1;
	int tal2;
	
	Scanner scan = new Scanner (System.in);
	
	System.out.print("Skriv in det f�rsta talet:");
	tal1 = scan.nextInt();
	
	System.out.print("Skriv in det andra talet:");
	tal2 = scan.nextInt();
	scan.close();
	
	if (tal1 > tal2) {
		System.out.println(tal1 + " �r st�rre �n " + tal2 );
	} else if (tal1 < tal2) {
		System.out.println(tal2 + " �r st�rre �n " + tal1);
	
	} else {
		System.out.println("Talen �r lika");
	}
	}

}
