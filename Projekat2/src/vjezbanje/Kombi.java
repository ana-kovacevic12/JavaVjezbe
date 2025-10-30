package vjezbanje;

public class Kombi extends Vozilo {
	private int kapacitetPutnika;

	//kreiranje konstruktora
	public Kombi(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja,
			int kapacitetPutnika) {
			
			//pozivanje konstruktora superklase
			super(proizvodjac, godinaProizvodnje, kubikaza, boja);
			this.kapacitetPutnika = kapacitetPutnika;
		}
	
	
		
		//geteri i seteri za klasu kombi
		
	//prikaz
		@Override
	public String toString() {
		return "Kombi [" + super.toString() + "kapacitetPutnika=" + kapacitetPutnika + "]";
	}

		public void ispisiPodatke() {
	        System.out.println("Kombi: " + super.toString() + "kapacitetPutnika=" + kapacitetPutnika + ")");}


		public int getKapacitetPutnika() {
			return kapacitetPutnika;
		
}

		public void setKapacitetPutnika(int kapacitetPutnika) {
			this.kapacitetPutnika = kapacitetPutnika;}
//racunanje cijene
			@Override
			public double izracunajCijenuRegistracije() {
				double cijena = super.izracunajCijenuRegistracije();
    
				if(kapacitetPutnika>8) {
					cijena=cijena+30;
				}
    
				return cijena;
			}}
				
