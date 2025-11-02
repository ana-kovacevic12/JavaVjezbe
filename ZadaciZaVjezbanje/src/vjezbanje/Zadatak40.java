package vjezbanje;

import java.util.Scanner;

public class Zadatak40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj automobila: ");
		int N = sc.nextInt();
		
		int ukupnaZarada = 0;
		
		for (int i = 1; i <= N; i++) {
			System.out.print("Unesite broj sati za auto " + i + ": ");
			
		int sati = sc.nextInt();
		int cijena;
		
		if (sati <= 5) {
			cijena = sati * 2;
		}else {
			cijena = 5 * 2 + (sati - 5) * 1;
		}
			ukupnaZarada += cijena;
		}
			System.out.println("Ukupna zarada parkinga je: " + ukupnaZarada + " €");
			
		sc.close();
		}
		
	}


