package vjezbanje;

import java.util.Scanner;

public class Zadatak36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite vrijednost a: ");
		int a=sc.nextInt();
		
		System.out.print("Unesite vrijednost b: ");
		int b=sc.nextInt();
		
		int djelilac=sc.nextInt();
		int suma=0;
		int brojElemenata=0;
		for (int i=a +1;i<b;i++) {
			if(i%djelilac ==0) {
				suma+=i;
				brojElemenata++;
				
			}
		}
		System.out.println("Suma elemenata djeljivih sa " + djelilac + "je: " +suma);
		System.out.println("Broj elemenata djeljivih sa " + djelilac + "je: " + brojElemenata);
		
		sc.close();
		

	}

}
