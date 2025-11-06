package vjezbanje;

public class TV extends EProizvodi {
	private int velicina_ekrana;


public TV(String opis_proizvoda,String sifra, int uvozna_cijena_proizvoda, int velicina_ekrana) {
	super(opis_proizvoda, sifra, uvozna_cijena_proizvoda);
	this.velicina_ekrana = velicina_ekrana;}
	
	

public int getVelicina_ekrana() {
	return velicina_ekrana;
}

public void setVelicina_ekrana(int velicina_ekrana) {
	this.velicina_ekrana = velicina_ekrana;
}}