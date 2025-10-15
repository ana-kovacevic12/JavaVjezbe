package vjezbanje;

import java.util.Scanner;

public class Zadatak24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int broj = sc.nextInt();
		if (broj >=0) {
			if(broj % 2==0) {
				System.out.println("Broj je pozitivan i paran.");
			}else {
				System.out.println("Broj je pozitivan i neparan.");
				
			}
			
		}else {
			if(broj %2==0) {
				System.out.println("Broj je negativan i paran.");
			}else {
				System.out.println("Broj je negativan i neparan.");
		
		sc.close();
			}
		}

	}

}
