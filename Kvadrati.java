package vjezbanje;

import java.util.Scanner;

public class Kvadrati {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=543;
		int b=130;		
		int stranica_kvadrata=65;
		
		int povrsina_pravougaonika=a*b;
		int povrsina_kvadrata=stranica_kvadrata*stranica_kvadrata;
		
		int broj_kvadrata=(povrsina_pravougaonika/povrsina_kvadrata);
		
		System.out.println("Moguce je izrezati " + broj_kvadrata + " kvadrata.");
		
		sc.close();
		
		
		
		
		

	}

}
