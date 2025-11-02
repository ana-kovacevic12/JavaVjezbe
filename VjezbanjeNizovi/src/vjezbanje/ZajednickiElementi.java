package vjezbanje;

import java.util.ArrayList;
import java.util.Scanner;

public class ZajednickiElementi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Unesite broj elemanata niza: ");
		int n=sc.nextInt();
		int[] prvi=new int[n];
		
		
        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < n; i++) {
            prvi[i] = sc.nextInt();
        }   
        System.out.print("Unesite broj elemanata niza: ");
        int n1=sc.nextInt();
    	int[] drugi=new int[n1];
    	
    	System.out.println("Unesite elemente niza: ");
        for (int j = 0;  j< n1; j++) {
        	drugi[j] = sc.nextInt();
        }	
        ArrayList<Integer>zajednickiEl=new ArrayList<>();
        for(int x:prvi) {
        	for (int y:drugi) {
        		if(x==y && !zajednickiEl.contains(x))
        			zajednickiEl.add(x);
        	}
        }
    	
        System.out.println("zajednicki elementi su : " +zajednickiEl);
        
        sc.close();
        }
       
}
        
        

	


