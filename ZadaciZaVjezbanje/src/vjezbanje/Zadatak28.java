package vjezbanje;

import java.util.Scanner;

public class Zadatak28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Unesite poene iz matematike za prvog takmicara: ");
		int m1=sc.nextInt();
		
		System.out.print("Unesite poene iz programiranja za prvog takmicara: ");
		int p1=sc.nextInt();
		
		System.out.print("Unesite poene iz matematike za drugog takmicara: ");
		int m2=sc.nextInt();
		
		System.out.print("Unesite poene iz programiranja za drugog takmicara: ");
		int p2=sc.nextInt();
		
		
		int ukupno1=m1+p1;
		int ukupno2=m2+p2;
		
		if(ukupno1>ukupno2 || (ukupno1 == ukupno2 && p1>p2)) {
			System.out.print("Prvi takmicar je pobjednik!");
		}else {
			System.out.print("Drugi takmicar je pobjednik!");
		}
		sc.close();
		
		

	}

}
