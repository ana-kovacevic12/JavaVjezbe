package vjezbanje;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double x1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y1=sc.nextDouble();
		double y2=sc.nextDouble();		
				
		double sirina=Math.abs(x2-x1);
		double visina=Math.abs(y2-y1);
		
		double P=visina*sirina;
		double O=2*(visina*sirina);
		
		System.out.printf("Povrsina je %.2f,a obim je %.2f%n",P,O);
		sc.close();
		

	}

}
