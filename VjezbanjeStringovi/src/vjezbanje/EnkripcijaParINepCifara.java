package vjezbanje;

import java.util.Scanner;

public class EnkripcijaParINepCifara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String s = sc.next().trim(); // unos, npr. 15023
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int d = ch - '0'; // pretvori karakter u cifru
            out.append((d % 2 == 0) ? '0' : '1');
        }

        System.out.println(out.toString());
        sc.close();

	}

}
