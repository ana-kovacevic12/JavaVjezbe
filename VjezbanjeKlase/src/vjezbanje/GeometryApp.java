package vjezbanje;

public class GeometryApp {

	public static void main(String[] args) {
		Pravougaonik p1 = new Pravougaonik(0, 1, 8,4);
		Pravougaonik p2 = new Pravougaonik(3, 2, 6, 7);
		
		Tacka t1= new Tacka(2, 3);
		
		t1.ispisi();      
        p1.ispisi();     

        
        boolean sadrzi = p1.sadrzi(t1.getX(), t1.getY());
        System.out.println("Prvi pravougaonik sadrži tačku? " + (sadrzi ? "DA" : "NE"));

        //preklapanja pravougaonika
        boolean preklapajuSe =
            p1.getX() < p2.getX() + p2.getWidth() &&        
            p1.getX() + p1.getWidth() > p2.getX() &&       
            p1.getY() < p2.getY() + p2.getHeight() &&     
            p1.getY() + p1.getHeight() > p2.getY();       

        System.out.println("Pravougaonici se preklapaju: " + (preklapajuSe ? "DA" : "NE"));
    }


	}

