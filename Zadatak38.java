package vjezbanje;

import java.util.Scanner;

public class Zadatak38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Unesite broj: ");
		int n=sc.nextInt();
		
		String brojStr=String.valueOf(n);
		int brojCifara=brojStr.length();
		
		int suma=0;
		int temp=n;
		
		while(temp>0) {
			int cifara=temp%10;
			suma+=Math.pow(cifara, brojCifara);
			temp/=10;
		}
		if(suma==n) {
			System.out.println("Da");
		}else {
			System.out.println("Ne");
			
		sc.close();
		}
	}

}
