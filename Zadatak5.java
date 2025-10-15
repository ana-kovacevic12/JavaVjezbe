package vjezbanje;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sirina_mm=sc.nextDouble();
		double visina_mm=sc.nextDouble();
		
		double povrsina_cm2=(sirina_mm*visina_mm)/100.0;
		System.out.printf("Povrsina lista u cm kvadratnim je %.2f%n", povrsina_cm2);
		
		sc.close();
				
		
		

	}

}
