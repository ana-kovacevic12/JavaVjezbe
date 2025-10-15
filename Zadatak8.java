package vjezbanje;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double P=sc.nextDouble();
		double r=Math.sqrt(P/Math.PI);
		
		double duzina_trake=2*r*Math.PI;
		
		System.out.printf("Potrebna duzina trake za ivicu stoljnjaka je %2.f%n",duzina_trake);
		
		sc.close();
	}

}
