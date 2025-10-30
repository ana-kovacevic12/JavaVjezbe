package vjezbanje;

public class Vozilo {
	private String proizvodjac;
	private int godinaProizvodnje;
	private double kubikaza;
	private String boja;
	
	//konstruktor
	public Vozilo(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja) {
		super();
		this.proizvodjac = proizvodjac;
		this.godinaProizvodnje = godinaProizvodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;
	}
	
	//prikaz informacija o vozilu
	@Override
	public String toString() {
		return String.format("Vozilo[proizvodjac=%s,godinaProizvodnje=%d,kubikaza=%.1f,boja=%s]", proizvodjac,godinaProizvodnje,kubikaza,boja);
	}

	//geteri i seteri
	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public double getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(double kubikaza) {
		this.kubikaza = kubikaza;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	//racunanje cijene registracije
	public double izracunajCijenuRegistracije() {
		double cijena=100.0;
		
		if(godinaProizvodnje<2010)
			cijena=cijena+30;
		
		if(kubikaza>2000)
			cijena=cijena+50;
		
		return cijena;
	}
	
	

			
		}
		
		
	
			
			
			
	