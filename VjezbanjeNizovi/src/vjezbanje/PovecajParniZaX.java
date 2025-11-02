package vjezbanje;

import java.util.Arrays;
import java.util.Scanner;

public class PovecajParniZaX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza: ");
		int brojEl=sc.nextInt();
		int[] niz=new int[brojEl];
		
		System.out.println("Unesite elemente niza: ");
		for(int i=0;i<brojEl;i++)
			niz[i]=sc.nextInt();
		
		System.out.print("Unesite parametar x: ");
		int x=sc.nextInt();
		
		for(int i=0;i<brojEl;i++) {
			if(niz[i]%2==0)
				niz[i]+=x;
		
		System.out.println("Novi niz je: " +Arrays.toString(niz));
		
		sc.close();	
		}

	}

}
