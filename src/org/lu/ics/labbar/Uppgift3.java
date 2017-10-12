package org.lu.ics.labbar;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) { // First commit
		
		Scanner scan = new Scanner (System.in);
		int tal;
		double[] list = new double[5];
		double sum = 0;
		double averageValue = 0;
		double biggestValue = 0;
		
		System.out.println("Ange fem tal: ");
		
		for (int i = 0; i < 5; i ++) {
			System.out.print("Ange tal " + (i + 1) + ":");
			tal = scan.nextInt();
			list[i] = tal;
		}
		
		for (double element : list) {
			sum += element;
			averageValue = sum / list.length;
		}
		System.out.println("Summan är: " + sum +"\n" + "Medelvärdet är: " + averageValue);
	}

}
