package vjezbanje;

import java.util.Scanner;

public class Zadatak16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double pocetna=sc.nextDouble();
		
		
		double poslijePovecanja=pocetna*1.10;
		double konacna=poslijePovecanja* 0.90;
		
		System.out.printf("%.2f%n", konacna);
		sc.close();

	}

}
