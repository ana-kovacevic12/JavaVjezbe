package vjezbanje;

public class Transakcija {
	private double iznos;
	private String tipTransakcije;
	private String opis;
	
	
	public Transakcija(double iznos, String tipTransakcije, String opis) {
		super();
		this.iznos = iznos;
		this.tipTransakcije = tipTransakcije;
		this.opis = opis;
	}


	public double getIznos() {
		return iznos;
	}


	public void setIznos(double iznos) {
		this.iznos = iznos;
		
		if(iznos<0) {
			System.out.println("iznos mora biti veci od nule");
		}
		
		
	}


	public String getTipTransakcije() {
		return tipTransakcije;
	}


	public void setTipTransakcije(String tipTransakcije) {
		this.tipTransakcije = tipTransakcije;
	}


	public String getOpis() {
		return opis;
	}


	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	//metoda jeUplata
	public boolean jeUplata() {
        return tipTransakcije.equalsIgnoreCase("uplata");}
}
	

