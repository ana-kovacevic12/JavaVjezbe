package vjezbanje;

import java.util.Scanner;

public class TreciZadatak1 {
	private static boolean jeSamoglasnik(char c)
	{
		c=Character.toLowerCase(c);
		return c=='a' || c=='i' ||c=='e'|c=='o'||c=='u';	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String tekst=sc.nextLine();
		int broj_samoglasnika=0;
		int broj_slova=0;
		
		for(int i=0;i<tekst.length();i++) {
			char c=tekst.charAt(i);
			
			if(Character.isLetter(c)) {
				broj_slova ++;
				if(jeSamoglasnik(c)) {
					broj_samoglasnika ++;
					
				}
			}
		}
		System.out.println("Broj samoglasnika je:" + broj_samoglasnika);
		System.out.println("Broj suglasnika je:" + (broj_slova-broj_samoglasnika));
		
		sc.close();
	}
	

}
