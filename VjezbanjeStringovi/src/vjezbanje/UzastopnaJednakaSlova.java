package vjezbanje;

import java.util.Scanner;

public class UzastopnaJednakaSlova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean nadjeno = false;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println("Par: " + s.charAt(i) + s.charAt(i + 1) + " na indeksima " + i + " i " + (i + 1));
                nadjeno = true;
            }
        }
        if (!nadjeno)
            System.out.println("Nema uzastopnih jednakih slova.");
        
        sc.close();

	}

}
