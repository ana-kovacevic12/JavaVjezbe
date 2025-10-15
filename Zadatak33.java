package vjezbanje;

import java.util.Scanner;

public class Zadatak33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Unesite broj N: ");
		int N=sc.nextInt();
		
		if(N%3==0 && N%5 ==0) {
			System.out.println("FizzBuzz");
		}else if(N % 5 ==0) {
			System.out.println("Fizz");
		}else if(N% 3==0) {
			System.out.println("Buzz");
		}else {
			System.out.println(N);
			
		sc.close();
		}

	}

}
