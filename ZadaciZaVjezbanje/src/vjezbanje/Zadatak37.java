package vjezbanje;

import java.util.Scanner;

public class Zadatak37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj pcela: ");
		int n=sc.nextInt();
		
		System.out.println("Unesite koordinate pcela(x,y): ");
		
		for (int i=1;i<=n;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			if(y==2*x*x-5) {
				System.out.println("Pcela"+ i + "se nalazi na zici: ("+ x +" , " + y + ")");
				
		sc.close();
			}
		}

	}

}
