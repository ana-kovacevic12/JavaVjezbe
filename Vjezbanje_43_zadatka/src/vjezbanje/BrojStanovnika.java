package vjezbanje;

import java.util.Scanner;

public class BrojStanovnika {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj stanovnika prvog grada: ");
		int prvigrad=sc.nextInt();
		
		System.out.print("Unesite broj stanovnika drugog grada: ");
		int drugigrad=sc.nextInt();
		
		System.out.print("Unesite broj stanovnika treceg grada: ");
		int trecigrad=sc.nextInt();
		
		System.out.print("Unesite broj stanovnika cetvrtog grada: ");
		int cetvrtigrad=sc.nextInt();
		
		int prosjek=(prvigrad+drugigrad+trecigrad+cetvrtigrad)/4;
		
		System.out.println("Prosjecan broj stanovnika je" + prosjek);
		
		sc.close();
		
		
	}

}
