package vjezbanje;

import java.util.Arrays;
import java.util.Scanner;

public class PlataZaposlenog {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("unesite broj zaposlenih: ");
		int brojZap=sc.nextInt();
		
		if(brojZap<2) {
			System.out.print("niz mora imati najmanje dva elementa: ");
		}
		
		int[]plate=new int[brojZap];
		
		System.out.println("unesite plate: ");
		for(int i=0;i<brojZap;i++)
			plate[i]=sc.nextInt();
		
		Arrays.sort(plate);
		
		System.out.println("Druga najveca plata je "+ plate[plate.length-2]);
		sc.close();

	}

}
