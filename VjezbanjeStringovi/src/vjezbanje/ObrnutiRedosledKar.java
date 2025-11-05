package vjezbanje;

import java.util.Scanner;

public class ObrnutiRedosledKar {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	        String line = sc.nextLine();
	        String[] rijeci = line.split(" ");
	        
	        StringBuilder rezultat = new StringBuilder();

	        for (int i = 0; i < rijeci.length; i++) {
	            String w = rijeci[i];
	            
	            StringBuilder rev = new StringBuilder(w).reverse();
	            rezultat.append(rev);
	            
	            if (i < rijeci.length - 1)
	                rezultat.append(" ");
	        }

	        System.out.println(rezultat.toString());
	        sc.close();
	}

}
