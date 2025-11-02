package vjezbanje;

import java.util.Scanner;

public class Zadatak31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite prosjek ucenika: ");
		double prosjek=sc.nextDouble();
		
		if(prosjek == 1.0) {
			System.out.println("Ucenik ima nedovoljan uspjeh.");
		}else if(prosjek >= 4.5) {
			System.out.println("Ucenik ima odlican uspjeh.");
		}else if(prosjek >=3.5) {
			System.out.println("Ucenik ima vrlo dobar uspjeh.");
		}else if(prosjek >= 2.5) {
			System.out.println("Ucenik ima dovoljan uspjeh.");
		}else if(prosjek >=2.0) {
			System.out.println("Ucenik ima dovoljan uspjeh.");
		}else {
			System.out.println("Ucenik ima nedovoljan uspjeh.");
			
		sc.close();
		}
	}

}
