package vjezbanje;

import java.util.Scanner;

public class PrestupnaGodina {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite godinu: ");
		int godina=sc.nextInt();
		
		boolean prestupna;
		
		if(godina%400==0) {
			prestupna=true;
		}else {
			if (godina%100==0) {
				prestupna=false;
		}else {
			if(godina%4==0) {
				prestupna=true;
		}else {
				prestupna=false;
		}
		if(prestupna) {
			System.out.println("Prestupna je godina.");
		}else {
			System.out.println("Nije prestupna godina.");
			
		sc.close();
		}
				}
			}
		}

	}


