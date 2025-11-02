package vjezbanje;

import java.util.Scanner;

public class Zadatak35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Unesite pocetak segmenta: ");
		int start =sc.nextInt();
		
		System.out.print("Unesite kraj segmenta: ");
		int kraj=sc.nextInt();
		
		int suma=0;
		for(int i=start;i<=kraj;i++) {
			if(i%2 ==0 && i % 4 !=0) {
				suma +=i * i;
				
			}
		}
		System.out.println("Suma kvadrata brojeva djeljivih sa 2,ali ne sa 4 u segmentu je: " +suma);
		
		sc.close();
		

	}

}
