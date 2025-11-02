package vjezbanje;

import java.util.Scanner;

public class Zadatak32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj n: ");
		int n =sc.nextInt();
		
		int zbirParnih = 0;
		long proizvodNeparnih =1;
		for (int i=1;i<=n;i++) {
			if(i % 2==0) {
				zbirParnih+=i;
			}else {
				proizvodNeparnih *=i;
				
			}
		}
		System.out.println("Zbir parnih brojeva od 1 do" + n + "je:"+ zbirParnih);
		System.out.println("Proizvod neparnih brojeva od 1 do" + n + "je: " +proizvodNeparnih);
		
		sc.close();
	}

}
