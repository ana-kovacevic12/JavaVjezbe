package vjezbanje;

import java.util.Scanner;

public class ParniNegativni {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = sc.nextInt();

        int[] niz = new int[n];
        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < n; i++) {
            niz[i] = sc.nextInt();
        }

        
        for (int x : niz) {
            if (x < 0 && x % 2 == 0) {
            	System.out.println("Parni negativni elementi su:");
        	}else{
        		System.out.println("nema parnih negatvnih elemenata");
        	}
        }
        sc.close();
	}

}
