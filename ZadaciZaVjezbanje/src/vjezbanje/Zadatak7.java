package vjezbanje;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double vrijeme_u_satima=sc.nextDouble();
		
		int litara_vode=(int)Math.floor(vrijeme_u_satima*0.5);
		
		System.out.println(litara_vode);
		
		sc.close();
		
		

	}

}
