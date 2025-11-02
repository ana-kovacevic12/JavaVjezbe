package vjezbanje;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int d=sc.nextInt();
		int s=sc.nextInt();
		int r=sc.nextInt();
		
		int D=d+2*r;
		int S=s+2*r;
		
		int duzina=2*(D+S);
		
		System.out.println(duzina);
		sc.close();
		
				

	}

}
