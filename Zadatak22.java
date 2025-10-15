package vjezbanje;

import java.util.Scanner;

public class Zadatak22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Petar je ubrao: ");
		int p=sc.nextInt();
		
		System.out.print("Milos je ubrao: ");
		int m=sc.nextInt();
		
		if (p>m) {
			System.out.println("Pobjednik je Petar");
		}else {
			System.out.println("Pobjednik je Milos");
		
		sc.close();
		}

	}

}
