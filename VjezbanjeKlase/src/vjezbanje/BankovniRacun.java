package vjezbanje;

public class BankovniRacun {
	private String imeVlasnika;
	private double stanje;
	
	//konstruktor
	public BankovniRacun(String imeVlasnika, double stanje) {
		super();
		this.imeVlasnika = imeVlasnika;
		this.stanje = stanje;
	}

	//geteri i seteri
	public String getImeVlasnika() {
		return imeVlasnika;
	}

	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}

	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}
	
	
	//metod uplati
	public void uplati(double iznos) {
		if (iznos > 0) {
			stanje+=iznos;
	        System.out.println("Uplata uspješna! Uplaćeno: " + iznos + "€");
	    } else {
	        System.out.println("Greška: iznos uplate mora biti pozitivan!");}
	    }
	
	//metod isplati
	public void isplati(double iznos) {
		if(iznos>stanje)
    		System.out.println("Nedovoljno sredstava! Trenutno stanje: " + stanje + "€");
		else if(iznos<stanje){
			stanje-=iznos;
			System.out.println("Isplata uspješna! Isplaceno: " + iznos + "€");}}
 	
	
	//metod ispisa podataka
	public void ispisi() {
	        System.out.println("Vlasnik: " + imeVlasnika + " | Trenutno stanje: " + String.format("%.2f", stanje) + "€");
	}
		
	}

