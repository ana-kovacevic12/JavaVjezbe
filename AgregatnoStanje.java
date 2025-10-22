package vjezbanje;

import java.util.Scanner;

public class AgregatnoStanje {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		double x=sc.nextDouble();
		
		if(x>0 && x<100) {
			System.out.print("Tecno.");
		}else {
			if(x<=0) {
				System.out.println("Cvrsta.");
		}else {
			System.out.println("Gasovito.");
		
		sc.close();
			}
		}

	}

}
