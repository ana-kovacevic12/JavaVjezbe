package vjezbanje;

import java.util.Scanner;

public class TriBroja {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Unesite prvi broj: ");
		int prvi_broj=sc.nextInt();
		
		System.out.print("Unesite drugi broj: ");
		int drugi_broj=sc.nextInt();
		
		System.out.print("Unesite treci broj: ");
		int treci_broj=sc.nextInt();
		
		int min=prvi_broj;
		int max=prvi_broj;
		
		if(drugi_broj<min) {
			min=drugi_broj;
		}if (treci_broj<min) {
			min=treci_broj;
		
		} if(drugi_broj>max) {
			max=drugi_broj;
		}if(treci_broj >max) {
			max=treci_broj;
		}
		
		System.out.println("Najmanji broj je : " + min);
		System.out.println("Najveci broj je : " + max);
		
		sc.close();
		}
		
		
		
		
		

	}


