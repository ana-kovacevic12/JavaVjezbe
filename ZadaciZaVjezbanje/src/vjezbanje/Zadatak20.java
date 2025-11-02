package vjezbanje;

import java.util.Scanner;

public class Zadatak20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System .in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		
		double p1=sc.nextDouble();
		double p2=sc.nextDouble();
		
		int n1=N-K;
		double ukupno =p1*n1+ p2*K;
		double prosjek=ukupno /N;
		
		System.out.printf("%.2f%n",prosjek);
		sc.close();

	}

}
