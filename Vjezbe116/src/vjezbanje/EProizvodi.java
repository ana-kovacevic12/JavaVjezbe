package vjezbanje;

public class EProizvodi {
	private String opis_proizvoda;
	private String sifre_proizvoda;
	private int uvozna_cijena_proizvoda;
	
	

//konstruktor
public EProizvodi(String opis_proizvoda, String sifra, int uvozna_cijena_proizvoda) {
	super();
	this.opis_proizvoda = opis_proizvoda;
	this.sifre_proizvoda = sifra;
	this.uvozna_cijena_proizvoda = uvozna_cijena_proizvoda;}


//geteri i seteri
public String getOpis_proizvoda() {
	return opis_proizvoda;
}



public void setOpis_proizvoda(String opis_proizvoda) {
	this.opis_proizvoda = opis_proizvoda;
}



public String getSifre_proizvoda() {
	return sifre_proizvoda;
}



public void setSifre_proizvoda(String sifre_proizvoda) {
	this.sifre_proizvoda = sifre_proizvoda;
	
} 



public double getUvozna_cijena_proizvoda() {
	return uvozna_cijena_proizvoda;
}



public void setUvozna_cijena_proizvoda(int uvozna_cijena_proizvoda) {
	this.uvozna_cijena_proizvoda = uvozna_cijena_proizvoda;}


//metode za obracun maloprodajne cijene

public double obracun_maloprodajne_cijene (String sifreProizvoda,int velicinaEkrana) {
	double maloprodajnaCijena=uvozna_cijena_proizvoda*1.05;
	
switch(sifreProizvoda.toLowerCase()) {
	
	
	case "RA":
		maloprodajnaCijena*=1.05;
		break;
	case"TE":
		if (velicinaEkrana>6) {
			maloprodajnaCijena*=1.03;
		}
		break;
	case"TV":
		if(velicinaEkrana>65) {
			maloprodajnaCijena*=1.10;
		}
		break;
}
return maloprodajnaCijena;
}
		


//metod za stampanje cijene
public static void stampaOdredjenuVrstuProizvoda(EProizvodi[] proizvodi,String sifraProizvoda) {
	System.out.println("Vrsta proivoda : " + sifraProizvoda);
	for(EProizvodi proizvod :proizvodi) {
		if(proizvod.getOpis_proizvoda().toLowerCase().contains(sifraProizvoda.toLowerCase())) {
			System.out.println("Sifra proizvoda : " +proizvod.getSifre_proizvoda() + ", opis proizvoda : " + proizvod.getOpis_proizvoda() + ",uvozna cijena: " +proizvod.getUvozna_cijena_proizvoda());
		}
	} {
		
	}
}}

