package vjezbanje;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double km=sc.nextDouble();
		double cijena=1.0 +0.5*km;
		
		System.out.printf("%.2f%n",cijena);
		sc.close();

	}

}
