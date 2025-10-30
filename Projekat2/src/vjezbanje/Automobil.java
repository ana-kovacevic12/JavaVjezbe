package vjezbanje;

public class  Automobil extends Vozilo {
	private int brojVrata;
	private String tipMotora;
	
	
	public Automobil(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja, int brojVrata,String tipMotora) {
		//pozivanje konstruktora superklase
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.brojVrata = brojVrata;
		this.tipMotora = tipMotora;
	}
	

	
	//prikaz
	@Override
	public String toString() {
		return "Automobil [" + super.toString() + "brojVrata=" + brojVrata + ", tipMotora =" + tipMotora + "]";
	}


	public void ispisiPodatke() {
        System.out.println("Automobil: " + super.toString() + ", broj vrata=" + brojVrata + ", tipMotora=" + tipMotora);}

	//geteri i seteri i za klasu vozilo
	public int getBrojVrata() {
		return brojVrata;
	}


	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}


	public String getTipMotora() {
		return tipMotora;
	}


	public void setTipMotora(String tipMotora) {
		this.tipMotora = tipMotora;
	}
	
	
	//nadogradjivanje metode za racunanje cijene
	@Override
    public double izracunajCijenuRegistracije() {
        double cijena = super.izracunajCijenuRegistracije();
        
        if(tipMotora.equalsIgnoreCase("dizel")) {
        	cijena=cijena+20;
        }
        
        return cijena;
	
}

}


