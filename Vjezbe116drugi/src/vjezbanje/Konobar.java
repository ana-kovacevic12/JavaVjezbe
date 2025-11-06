package vjezbanje;

public class Konobar extends Zaposleni {
	
	public Konobar(int iD, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, int prekovremeniSati) {
		super(iD, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.prekovremeniSati = prekovremeniSati;
	}

	private int prekovremeniSati;

	
	// Getter i setter za prekovremene sate
	public int getPrekovremeniSati() {
		return prekovremeniSati;
	}

	public void setPrekovremeniSati(int prekovremeniSati) {
		this.prekovremeniSati = prekovremeniSati;
	}

	// Metoda za obracun plate
	public double obracunPlate() {
		double osnovnaPlata = getUkupanBrojSati() * getPlataPoSatu() * 4;
		double prekovremenaPlata = prekovremeniSati * getPlataPoSatu() * 1.2 * 4;
		return osnovnaPlata + prekovremenaPlata;
	}

	@Override
	public double izracunajPlatu() {
		// TODO Auto-generated method stub
		return 0;
	}

}

