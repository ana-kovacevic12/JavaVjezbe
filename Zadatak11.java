package vjezbanje;

import java.time.LocalDate;
import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int N=sc.nextInt();
		int godina=LocalDate.now().getYear();
		
		System.out.println(godina-N);
		sc.close();
	}

}
