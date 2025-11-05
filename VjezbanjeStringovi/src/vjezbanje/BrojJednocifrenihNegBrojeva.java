package vjezbanje;

import java.util.Scanner;

public class BrojJednocifrenihNegBrojeva {

		private static boolean isDigit(char c) {
	        return c >= '0' && c <= '9';
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine().trim();
	        int racunanje = 0;

	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == '-' && i + 1 < s.length() && isDigit(s.charAt(i + 1))) {
	                if (i + 2 >= s.length() || !isDigit(s.charAt(i + 2))) {
	                    racunanje++;
	               
	            }
	        }

	        System.out.println(racunanje);
	        sc.close();
	}

}}
