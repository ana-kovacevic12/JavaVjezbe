package vjezbanje;

import java.util.Scanner;

public class Zadatak30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Unesite x koordinatu centra table: ");
		int cx=sc.nextInt();
		
		System.out.println("Unesite y koordinatu centra table: ");
		int cy=sc.nextInt();
		
		System.out.println("Unesite poluprecnik table: ");
		int r=sc.nextInt();
		
		System.out.print("Unesite x koordinatu pogotka strelice: ");
		int x=sc.nextInt();
		
		System.out.print("Unesite y koordinatu pogotka strelice: ");
		int y=sc.nextInt();
		
		double udaljenost =Math.sqrt(Math.pow(x -cx, 2) + Math.pow(y-cy, 2));
		
		if(udaljenost <=r) {
			System.out.println("Strelica je pogodila pikado tablu!");
		}else {
			System.out.println("Strelica je promasila tablu!");
			
		sc.close();
		}
		

	}

}
