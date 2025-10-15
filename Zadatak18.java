package vjezbanje;

import java.util.Scanner;

public class Zadatak18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=Math.abs(sc.nextInt());
		int a=n/100;
		int b=(n/10)%10;
		int c=n%10;
		
		int kod=(a*b*c) - (a+b+c);
		
		System.out.println(kod);
		sc.close();

	}

}
