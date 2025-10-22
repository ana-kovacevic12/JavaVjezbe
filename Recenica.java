package vjezbanje;

import java.util.Scanner;

public class Recenica {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite recenicu: ");
		String tekst=sc.nextLine();
		String [] rijeci=tekst.split(" ");
		
		System.out.println("Broj rijeci ovog teksta je : " + rijeci.length);
		
		sc.close();

	}

}
