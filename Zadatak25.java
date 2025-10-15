package vjezbanje;

import java.util.Scanner;

public class Zadatak25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite sat (0-23): ");
		int sat=sc.nextInt();
		
		if(sat<6 || (sat >=13 && sat <17) || sat>=22) {
			System.out.println("Radnici ne smiju praviti buku.");
		}else {
			System.out.println("Radnici smiju praviti buku.");
			
		sc.close();
		}

	}

}
