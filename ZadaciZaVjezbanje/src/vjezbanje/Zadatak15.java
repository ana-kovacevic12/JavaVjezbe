package vjezbanje;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double cijena=sc.nextDouble();
		double popustProcenat=sc.nextDouble();
		
		double konacno=cijena*(1-popustProcenat/100.0);
		
		System.out.printf("%.2f%n", konacno);
		sc.close();

	}

}
