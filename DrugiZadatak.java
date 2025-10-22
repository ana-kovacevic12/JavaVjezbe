package vjezbanje;

import java.util.Scanner;

public class DrugiZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite rijec: ");
		
		String rijec = sc.nextLine().trim();
		String obrnutarijec = new StringBuilder(rijec).reverse().toString();
		
		System.out.print(rijec.equalsIgnoreCase(obrnutarijec));
		
		sc.close();

	}

}
