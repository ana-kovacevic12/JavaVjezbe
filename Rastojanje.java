package vjezbanje;

import java.util.Scanner;

public class Rastojanje {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite rastojanje u centrimetrima: ");
		
		int rastojanje=sc.nextInt();
		int metri=rastojanje/100;
		
		System.out.println("Rastojanje u metrima je:" + metri);
		
		sc.close();

	}

}
