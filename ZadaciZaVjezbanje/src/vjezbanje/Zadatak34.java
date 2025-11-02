package vjezbanje;

import java.util.Scanner;

public class Zadatak34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Unesite broj domacinstava: ");
		
		int N=sc.nextInt();
		int ukupnaPotrosnja=0;
		int zbirVecihOd500=0;
		
		for(int i=1;i<=N;i++) {
			System.out.print("Unesite potrosnju za domacinstvo " + i + "(kWh): ");
			
			int potrosnja=sc.nextInt();
			ukupnaPotrosnja+=potrosnja;
			
			if(potrosnja>500) {
				zbirVecihOd500+=potrosnja;
			
			}
		}
		System.out.println("Ukupna potrosnja svih domacinstava:" + ukupnaPotrosnja +"kWh");
		System.out.println("Zbir potrosnja domacinstava preko 500 kWh: " + zbirVecihOd500 +"kWh");
		
		sc.close();
	}

}
