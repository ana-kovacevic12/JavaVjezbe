package vjezbanje;

import java.util.Scanner;

public class Zadatak29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite gornju lijevu x koordinatu prozora: ");
		int wx1=sc.nextInt();
		
		System.out.print("Unesite gornju lijevu y koordinatu prozora: ");
		int wy1=sc.nextInt();
		
		System.out.print("Unesite donju desnu x koordinatu prozora: ");
		int wx2=sc.nextInt();
		
		System.out.print("Unesite donju lijevu y koordinatu prozora: ");
		int wy2=sc.nextInt();
		
		System.out.print("Unesite gornju lijevu x koordinatu zavjese: ");
		int cx1=sc.nextInt();
		
		System.out.print("Unesite gornju lijevu y koordinatu zavjese: ");
		int cy1=sc.nextInt();
		
		System.out.print("Unesite donju desnu x koordinatu zavjese: ");
		int cx2=sc.nextInt();
		
		System.out.print("Unesite donju desnu y koordinatu zavjese: ");
		int cy2=sc.nextInt();
		
		if(cx1 <=wx1 && cy1 <=wy1 && cx2>=wx2 && cy2>=wy2) {
			System.out.println("Zavjesa potpuno prekriva prozor.");
		}else {
			System.out.println("Zavjesa ne prekriva prozor.");
		
		sc.close();
		}
	}

}
