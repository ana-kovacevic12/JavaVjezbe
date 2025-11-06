package vjezbanje;

public class Telefoni extends Racunari {
	private int velicina_Ekrana;
	private String operativni_sistem;
	
	
	public Telefoni(String opis_proizvoda, String sifre_proizvoda, int uvozna_cijena_proizvoda, String procesor,
			int memorija, int velicina_Ekrana, String operativni_sistem) {
		super(opis_proizvoda, sifre_proizvoda, uvozna_cijena_proizvoda, procesor, memorija);
		this.velicina_Ekrana = velicina_Ekrana;
		this.operativni_sistem = operativni_sistem;
	}



	public int getVelicina_Ekrana() {
		return velicina_Ekrana;
	}


	public void setVelicina_Ekrana(int velicina_Ekrana) {
		this.velicina_Ekrana = velicina_Ekrana;
	}


	public String getOperativni_sistem() {
		return operativni_sistem;
	}


	public void setOperativni_sistem(String operativni_sistem) {
		this.operativni_sistem = operativni_sistem;
	}}
	
	
