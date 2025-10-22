package vjezbanje;

import java.util.Scanner;

public class PovrsinaEkrana {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double dijagonala=50;
		int a=16;
		int b=19;
		
		double k=Math.sqrt((dijagonala*dijagonala)/(a*a +b*b));
		
		double sirina=a*k;
		double duzina=b*k;
		
		double povrsina_pravougaonika=sirina*duzina;
		
		System.out.printf("Povrsina ekrana monitora je %.2f%n",povrsina_pravougaonika);
		
		sc.close();
		
		

	}

}
