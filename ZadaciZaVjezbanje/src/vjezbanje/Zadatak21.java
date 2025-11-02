package vjezbanje;

import java.util.Scanner;

public class Zadatak21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Carobni stapic je generisao broj: ");
		int broj =sc.nextInt();
		
		if(broj % 2==0) {
			System.out.println("Portal se otvara!");
		}else {
			System.out.println("Portal se ne otvara!");
			
		sc.close();
		}
	}

}
