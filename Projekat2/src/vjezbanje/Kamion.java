package vjezbanje;

public class Kamion extends Vozilo {
	private double kapacitetTereta;
	private boolean prikolica;
	
	//konstruktor za klasu kamion
	public Kamion(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja,
			double kapacitetTereta, boolean prikolica) {
		
		//pozivanje konstruktora superklase
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.kapacitetTereta = kapacitetTereta;
		this.prikolica = prikolica;
	}
	
	
	//geteri i seteri za klasu kamion
	
	//prikaz
	@Override
	public String toString() {
		return "Kamion [" + super.toString() + " , kapacitetTereta=" + kapacitetTereta + ", prikolica=" + prikolica + "]";
	}
	
	public void ispisiPodatke() {
        System.out.println("Kamion: " + super.toString() +  kapacitetTereta + ", prikolica=" + prikolica + ")");}


	public double getKapacitetTereta() {
		return kapacitetTereta;
	}

	public void setKapacitetTereta(double kapacitetTereta) {
		this.kapacitetTereta = kapacitetTereta;
	}

	public boolean isPrikolica() {
		return prikolica;
	}

	public void setPrikolica(boolean prikolica) {
		this.prikolica = prikolica;
	}


//nasledjivanje klase za racunanje cijene
@Override
public double izracunajCijenuRegistracije() {
	double cijena = super.izracunajCijenuRegistracije();

	if(prikolica=true) {
		cijena=cijena+20;
	}

	return cijena;
}}
