package vjezbanje;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String rijec=sc.nextLine();
		
		boolean nadjeno=false;
		
		
		for(int i=0;i<rijec.length()-1;i++) {
			if(rijec.charAt(i)==rijec.charAt(i+1)) {
				System.out.println("Nasli smo dva ista slova i to je : " + rijec.charAt(i) + " i to na poziciji " + (i+1));
				nadjeno=true;		
				
			}
		}
		if(!nadjeno) {
			System.out.println("Nema povezanih slova");
		
		sc.close();
		}
	}

}
