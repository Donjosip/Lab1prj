package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner (System.in);
		double tal;
		double[] list = new double[5];
		double sum = 0;
		double averageValue = 0;
		double highestValue = Double.NEGATIVE_INFINITY; // initierar högsta värde med infinity för att tillåta negativa tal
		
		System.out.println("Ange fem tal: ");
		
		for (int i = 0; i < 5; i ++) {		// låter användaren mata in tal + räknar ut högsta värdet
			System.out.print("Ange tal " + (i + 1) + ":");
			tal = scan.nextInt();
			list[i] = tal;
			
			
				
				if (tal > highestValue) {
				highestValue = tal; // Nytt högsta värde
				}
				
		}
		
		for (double element : list) {		// definierar summa och medelvärde
			sum += element;
			averageValue = sum / list.length;
			
		}	
		System.out.println("Summan är: " + sum +"\n" + "Medelvärdet är: " + averageValue +"\n" + "Största talet är: " + highestValue ); 
		
		scan.close();
	}

}
