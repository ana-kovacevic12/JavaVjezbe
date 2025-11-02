package vjezbanje;

import java.util.Scanner;

public class PetocifreniBroj {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite petocifreni broj: ");
		int broj=sc.nextInt();
		
		if(broj<10000 && broj>99999) {
			System.out.println("Broj koji ste unijeli nije petocifen.");
		}else {
			int a=(broj/100)%10;
			int b=(broj%10);
			
			int zbir=a*10 +b;
			
			System.out.println("Stambena zgrada se nalazi na spratu broj " + zbir);
		}
		sc.close();
	}

}
