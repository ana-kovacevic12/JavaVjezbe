package vjezbanje;

import java.util.Scanner;

public class DvocifreniBroj {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite dvocifreni broj: ");
		int broj=sc.nextInt();
		
		if (broj<10 && broj>99) {
			System.out.println("Broj koji ste unijeli niije dvocifreni broj.");
		}else {
			int a=(broj/10)%10;
			int b=broj%10;
				if (a>b) {
					int razlika=a-b;
					System.out.println("razlika je : "+razlika);
				}else {
					if(a<b) {
						int zbir=a+b;
						System.out.println("zbir je : "+zbir);
				}else {
					if (a==b) {
						int proizvod=a*b;
						System.out.println("proizvod je : " + proizvod);
				}
			sc.close();
				}
				
					
				}
		}
	}

}
