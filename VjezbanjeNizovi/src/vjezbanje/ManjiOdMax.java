package vjezbanje;

import java.util.Scanner;

public class ManjiOdMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza: ");
		int brojEl=sc.nextInt();
		int[] niz=new int[brojEl];
		
		System.out.println("Unesite elemente niza(moraju biti cijeli brojevi): ");
		for(int i=0;i<brojEl;i++)
			niz[i]=sc.nextInt();
		
		System.out.print("Unesite max vrijednost: ");
		int max=sc.nextInt();
		
		int brojac=0;
		for(int x:niz)
			if(x<max)
				brojac++;
		
		System.out.println("broj elemenata niza manjih od vrijednosti max :" +max+ " je: "+brojac);
		
		sc.close();

	}

}
