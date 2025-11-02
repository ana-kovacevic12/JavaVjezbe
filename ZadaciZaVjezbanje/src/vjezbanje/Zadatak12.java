package vjezbanje;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		
		double d=Math.hypot(x2-x1, y2-y1);
		
		System.out.printf("%.6f%n",d);
		sc.close();
	}

}
