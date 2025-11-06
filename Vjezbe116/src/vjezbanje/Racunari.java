package vjezbanje;

public class Racunari extends EProizvodi {
	private String procesor;
	private double memorija;
	

	public Racunari(String opis_proizvoda, String sifre_proizvoda, int uvozna_cijena_proizvoda, String procesor,
		int memorija) {
	super(opis_proizvoda, sifre_proizvoda, uvozna_cijena_proizvoda);
	this.procesor = procesor;
	this.memorija = memorija;}

	


	public String getProcesor() {
		return procesor;
	}


	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}


	public double getMemorija() {
		return memorija;
	}


	public void setMemorija(int memorija) {
		this.memorija = memorija;
	}}