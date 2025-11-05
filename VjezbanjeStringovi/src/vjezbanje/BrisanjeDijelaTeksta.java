package vjezbanje;

import java.util.Scanner;

public class BrisanjeDijelaTeksta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        System.out.println(s1.equalsIgnoreCase(s2));
        
        sc.close();

	}

}
