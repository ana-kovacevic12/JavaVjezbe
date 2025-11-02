package vjezbanje;

import java.util.Scanner;

public class PozitivniBrojevi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj elemanata niza: ");
		int brojEl=sc.nextInt();
		
		int[]niz =new int[brojEl];
		int brojac=0;
		
		System.out.println("Unesite koji su elementi niza: ");
		
		for(int i=0;i<brojEl;i++) {
			niz[i]=sc.nextInt();
			if(niz[i]>0)
				brojac++;
		}
		
		System.out.println("broj pozitivnih cijelih brojeva u nizu je: "+ brojac);
		
		sc.close();
	}

}
