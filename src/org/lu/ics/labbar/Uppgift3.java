package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner (System.in);
		double tal;
		double[] list = new double[5];
		double sum = 0;
		double averageValue = 0;
		double highestValue = Double.NEGATIVE_INFINITY; // initierar h�gsta v�rde med infinity f�r att till�ta negativa tal
		
		System.out.println("Ange fem tal: ");
		
		for (int i = 0; i < 5; i ++) {		// l�ter anv�ndaren mata in tal + r�knar ut h�gsta v�rdet
			System.out.print("Ange tal " + (i + 1) + ":");
			tal = scan.nextInt();
			list[i] = tal;
			
			
				
				if (tal > highestValue) {
				highestValue = tal; // Nytt h�gsta v�rde
				}
				
		}
		
		for (double element : list) {		// definierar summa och medelv�rde
			sum += element;
			averageValue = sum / list.length;
			
		}	
		System.out.println("Summan �r: " + sum +"\n" + "Medelv�rdet �r: " + averageValue +"\n" + "St�rsta talet �r: " + highestValue ); 
		
		scan.close();
	}

}
