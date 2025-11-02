package vjezbanje;

import java.util.Scanner;

public class KvadratZbira {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite cetvorocifreni broj: ");
		int broj=sc.nextInt();
		
		if(broj<1000 && broj>9999) {
			System.out.println("Broj koji ste unijeli nije cetvorocifreni broj.");
		}else {
			int a=(broj/1000);
			int b=(broj/100)%10;
			int c=(broj/10)%10;
			int d=broj%10;
			
			int zbircifara=a+b+c+d;
			int kvadratzbira=zbircifara*zbircifara;
			
			System.out.println("Kvadrat zbira cifara ovog broja iznosi " + kvadratzbira);
		}
		sc.close();
		
		
		

	}

}
