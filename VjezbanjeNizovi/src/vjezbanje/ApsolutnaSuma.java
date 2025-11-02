package vjezbanje;

import java.util.Scanner;

public class ApsolutnaSuma {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza: ");
		int brojEl=sc.nextInt();
		int[] niz=new int[brojEl];
		
		System.out.println("Unesite elemente niza: ");
		for(int i=0;i<brojEl;i++)
			niz[i]=sc.nextInt();
		
		int suma=0;
		for(int x:niz) {
			if(x%2==0 && x<0)
				suma+=Math.abs(x);
		}
			
		System.out.println("apsolutna suma svih negativnij parnih elemanata je: " + suma);
		
		sc.close();

	}

}
