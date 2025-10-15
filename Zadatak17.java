package vjezbanje;

import java.util.Scanner;

public class Zadatak17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		n=Math.abs(n);
		
		int a=n/100;
		int b=(n/10)%10;
		int c=n%10;
		
		System.out.println(a+b+c);
		sc.close();

	}

}
