package vjezbanje;

import java.util.Scanner; 
public class Zadatak19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=Math.abs(sc.nextInt());
		int a=(n/1000)%10;
		int b=(n/100)%10;
		int c=(n/10)%10;
		int d=n%10;
		
		int rezultat=(int)Math.pow(a+d, 2) - ((int)Math.pow(b,2)-(int)Math.pow(c, 2));
		
		System.out.println(rezultat);
		sc.close();

	}

}
