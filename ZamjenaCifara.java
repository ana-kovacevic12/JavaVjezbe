package vjezbanje;

import java.util.Scanner;

public class ZamjenaCifara {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite trocifreni broj: ");
		int broj=sc.nextInt();
		
		if(broj<100 && broj>999) {
			System.out.println("Broj koji ste unijeli nije trocifren.");
		}else {
			int a=(broj/100)%10;
			int b=(broj/10)%10;
			int c=broj%10;
			
			int novibroj=c*100 + b*10 + a;
			System.out.println("Novi broj je : " + novibroj);
		}
		sc.close();
	}

}
