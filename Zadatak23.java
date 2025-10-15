package vjezbanje;

import java.util.Scanner;

public class Zadatak23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite procenat prisustva: ");
		int prisustvo=sc.nextInt();
		
		System.out.print("Unesite status seminarskih radova: ");
		int seminarski=sc.nextInt();
		
		if(prisustvo<75 && seminarski == 1) {
			System.out.println("Student moze pristupiti ispitu.");
		}else {
			System.out.println("Student ne moze pristupiti ispitu.");
		
		sc.close();
		}

	}

}
