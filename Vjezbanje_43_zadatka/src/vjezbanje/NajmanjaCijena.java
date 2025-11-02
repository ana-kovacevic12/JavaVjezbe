package vjezbanje;

import java.util.Scanner;

public class NajmanjaCijena {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite cijenu prvog proizvoda: ");
		double a=sc.nextDouble();
		
		System.out.print("Unesite cijenu drugog proizvoda: ");
		double b=sc.nextDouble();

		System.out.print("Unesite cijenu treceg proizvoda: ");
		double c=sc.nextDouble();
		
		double zbirAB=a+b;
		double zbirBC=b+c;
		double zbirCA=c+a;
		
		if(zbirAB<= zbirBC && zbirAB<=zbirCA) {
			System.out.println("Najjeftiniji par je prvi i drugi proizvod.");
		}else {
			if(zbirCA<= zbirAB && zbirCA<=zbirBC) {
				System.out.println("Najjeftiniji par je prvi i treci proizvod.");	
		}else {
			System.out.println("Najjeftiniji par je treci i drugi proizvod.");
			
		}
		sc.close();
		
		}
			
			
		}
		
	}
	


