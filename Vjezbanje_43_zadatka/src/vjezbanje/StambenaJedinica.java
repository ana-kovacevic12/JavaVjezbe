package vjezbanje;

import java.util.Scanner;

public class StambenaJedinica {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite cetvorocifreni broj: ");
		int broj=sc.nextInt();
		
		if(broj<1000 && broj>9999) {
			System.out.println("Broj koji ste unijeli nije cetvorocifren.");
		}else {
			int sprat=broj%10;
			System.out.println("Stambena jedinica se nalazi na " + sprat + " spratu.");
			
		}
		sc.close();	
		
	}

}
