package vjezbanje;

import java.util.Scanner;

public class NajveciZbir {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj elemanata niza: ");
		int brojEl=sc.nextInt();
		
		int[]niz =new int[brojEl];
				
		System.out.println("Unesite koji su elementi niza: ");
		
		for(int i=0;i<brojEl;i++) {
			niz[i]=sc.nextInt();
		
		int max=niz[0];
		int maxZbir=0;
		
		for(int broj:niz) {
			int zbir=0,temp=Math.abs(broj);
			
			while(temp>0) {
				zbir+=temp%10;
				temp/=10;
			}
			
			if(zbir>maxZbir) {
				maxZbir=zbir;
				max=broj;
			}
		}
		
		System.out.println("broj sa najvecim zbirom cifara je: " + max);
		sc.close();
		}
	}
}
	


