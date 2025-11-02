package vjezbanje;

public class Automobil {
	private String marka;
	private String model;
	private  int godiste;
	private int  brzina;
	
	//konstruktor
	public Automobil(String marka, String model, int godiste, int brzina) {
		super();
		this.marka = marka;
		this.model = model;
		this.godiste = godiste;
		this.brzina = brzina;
	}

	
	//geteri i seteri
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		this.brzina = brzina;
		
		if (brzina >= 0 && brzina <= 200) {
            this.brzina = brzina;
        } else {
            System.out.println("Greška: brzina mora biti između 0 i 200 km/h!");
        }
	}
	
	//metod ubrzaj
	public void ubrzaj(int vrijednost) {
        brzina += vrijednost;
        if (brzina > 200) {
            brzina = 200;
            System.out.println("Brzina ne može preći 200 km/h — postavljena na 200.");}
        }
		
        
    //metod uspori
    public void uspori(int vrijednost) {
    	brzina-=vrijednost;
    	if(brzina<0) {
    		brzina=0;
    		System.out.println("brzina ne smije pasti ispod 0km/h-postavljena je na 0.");}
    	  }
    	  
    //metod ispisi
    public void ispisi() {
    	System.out.println("Marka automobila: " + marka +" ,model: " + model + ",godiste: " + godiste + ",brzina: " + brzina );}
    	  
    	  
    	  
		
	}
	
	

