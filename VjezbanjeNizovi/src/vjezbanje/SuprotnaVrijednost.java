package vjezbanje;

import java.util.Scanner;

public class SuprotnaVrijednost {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza: ");
		int brojEl=sc.nextInt();
		int[] niz=new int[brojEl];
		
		System.out.println("Unesite elemente niza: ");
		for(int i=0;i<brojEl;i++)
			niz[i]=sc.nextInt();
		
		int brojac=0;
		for(int i=0;i<brojEl;i++) {
			for(int j=i+1;j<brojEl;j++) {
				if(niz[i]==-niz[j])
					brojac++;
			}
		}
		
		System.out.println("broj parova sa suprotnim vrijednostima je :" + brojac);
		
		sc.close();
	}

}
