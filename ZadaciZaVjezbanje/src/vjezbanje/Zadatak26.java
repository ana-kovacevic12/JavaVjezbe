package vjezbanje;

import java.util.Scanner;

public class Zadatak26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite duzinu prve stranice: ");
		int a=sc.nextInt();
		
		System.out.print("Unesite duzinu druge stranice: ");
		int b=sc.nextInt();
		
		System.out.print("Unesite duzinu trece stranice: ");
		int c=sc.nextInt();
		
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("Moze se napraviti basta.");
		}else {
			System.out.println("Ne moze se napraviti basta.");
			
		sc.close();
		}
	}

}
