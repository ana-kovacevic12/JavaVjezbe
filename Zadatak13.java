package vjezbanje;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		double xG=sc.nextDouble();
		double yG=sc.nextDouble();
		
		double xK=sc.nextDouble();
		double yK=sc.nextDouble();
		
		double xT=xK +2,yT=yK-3;
		double vazdusno=Math.hypot(xG-xT, yG-yT);
		double prekokuce=Math.hypot(xG-xK, yG-yK)+ Math.hypot(xK-xT,yK-yT);
		
		System.out.printf("T(%.2f,%.2f)%n", xT,yT);
		System.out.printf("G->T=%.6f%n",vazdusno);
		System.out.printf("G->K->T =%.6%n", prekokuce);
		
		sc.close();
		
		
	}

}
