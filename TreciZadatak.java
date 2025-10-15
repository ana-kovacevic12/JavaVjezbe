package com.udg.edu;
import java.util.Scanner;

public class TreciZadatak {
	public static void main(String[] args) {
		int N, i;
		long p = 1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesi N: ");
		N = sc.nextInt();

		for (i = 1; i <= N; i++)
			p *= i;

		System.out.printf("%d! = %d%n", N, p);
		sc.close();
	}
}
	



