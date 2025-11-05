package vjezbanje;

import java.util.Scanner;

public class ProsjecnaTemp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();

        if (line.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] djelovi = line.split("\\s+");
        int sum = 0;

        for (String p : djelovi) {
            sum += Integer.parseInt(p);
        }

        int avg = sum / djelovi.length; 
        System.out.println(avg);
        
        sc.close();
	}

}
