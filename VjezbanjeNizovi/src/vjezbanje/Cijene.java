package vjezbanje;

import java.util.Scanner;

public class Cijene {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj proizvoda u marketu: ");
		int brojPr=sc.nextInt();
		
		int[]stare=new int[brojPr];
		int[]nove=new int[brojPr];
		
		System.out.println("Unesite stare cijene: ");
		for(int i=0;i<brojPr;i++)
			stare[i]=sc.nextInt();
		
		System.out.println("Unesite nove cijene: ");
		for(int i=0;i<brojPr;i++)
			nove[i]=sc.nextInt();
		
		int razlika=0;
		for(int i=0;i<brojPr;i++)
			razlika+=stare[i]-nove[i];
		
		System.out.println("zarada ce biti manja za " + razlika);
		
		sc.close();

	}

}
