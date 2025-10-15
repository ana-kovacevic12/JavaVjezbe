package com.udg.edu;
import java.util.Scanner;
public class DrugiZadatak {

	public static void main(String[] args) {
		int x;
		float f;
		Scanner sc=new Scanner (System.in);
		System.out.print("Unesi x: ");
		x=sc.nextInt();
		
		if (x<1)
			f=x*x;
		else
			if(x>= 1 && x<5)
				f=2-x;
			else
				f=(float)(x*x*x-1)/5;
		System.out.printf("f(%d)=%.2f",x,f);
		sc.close();
		

	}

}
