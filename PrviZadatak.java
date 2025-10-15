package com.udg.edu;
import java.util.Scanner;
public class PrviZadatak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,N1;
		System.out.print("Unesi N: ");
		N=sc.nextInt();
		N1=N;
		if(N<0)
			N=-N;
		System.out.printf("|%d|= %d.",N1, N);
		sc.close();
		
			
		
	}

}
