package vjezbanje;

import java.util.Scanner;

public class StepenPetlja {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite x: ");
		int x=sc.nextInt();
		
		System.out.print("Unesite stepen(n): ");
		int n=sc.nextInt();
		
		long konacno=1;
		int i=1;
		
		while (i<=Math.abs(n)) {
			konacno*=x;
			i++;
		} 
		if(n<0) {
			System.out.println("Rezultat je : " + (1.0/konacno));
		}else {
			System.out.println("Rezultat je : " + konacno);
		}
		sc.close();
		}
		
		

	}


