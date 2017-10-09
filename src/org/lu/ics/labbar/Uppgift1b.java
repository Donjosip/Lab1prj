package org.lu.ics.labbar;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Uppgift1b { // Final commit

	public static void main(String[] args) {
		int totalPay;
		int hourlyPay;
		int hoursWorked;
		String name; 
		
		Scanner scan = new Scanner (System.in);		
		
		System.out.print ("Ange ditt namn:");
		name = scan.nextLine();
		
		System.out.print ("Ange din timlön:");
		hourlyPay = scan.nextInt();
		
		System.out.print ("Ange antal arbetade timmar:");
		hoursWorked = scan.nextInt();
		
		scan.close();
		
		
		name = name.toUpperCase();
		
		DecimalFormat df = new DecimalFormat ("0.00");
		
		totalPay = hourlyPay * hoursWorked;
		
		System.out.println(name + " du tjänade " + df.format (totalPay) + " förra veckan." );
		
	
	}

}
