package vjezbanje;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		double rezultat=(a+b)/2;
		
		System.out.print(rezultat);
		sc.close();
	}

}
