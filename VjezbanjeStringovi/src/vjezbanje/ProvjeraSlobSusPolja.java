package vjezbanje;

import java.util.Scanner;

public class ProvjeraSlobSusPolja {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String s = sc.next(); 
        int pozicija= sc.nextInt(); 

       
        if (pozicija < 0 || pozicija >= s.length()) {
            System.out.println("Neispravna pozicija");
            return;
        }

        boolean slobodno = false;

        if (pozicija == 0) {
            slobodno = (s.charAt(1) == '0');
        } else if (pozicija == s.length() - 1) {
            slobodno = (s.charAt(s.length() - 2) == '0');
        } else {
            slobodno = (s.charAt(pozicija - 1) == '0') || (s.charAt(pozicija + 1) == '0');
        }

        System.out.println(slobodno ? 1 : 0);
        
        sc.close();

	}

}
