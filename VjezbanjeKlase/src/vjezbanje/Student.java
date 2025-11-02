package vjezbanje;

public class Student {
	private String ime;
	private String prezime;
	private String brojIndeks;
	private int ocjena1;
	private int ocjena2;
	private int ocjena3;
	
	public static String spisak = "";

	//konstruktor
	public Student(String ime, String prezime, String brojIndeks, int ocjena1, int ocjena2, int ocjena3) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeks = brojIndeks;
		this.ocjena1 = ocjena1;
		this.ocjena2 = ocjena2;
		this.ocjena3 = ocjena3;
	}

	
	
	//geteri i seteri
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getBrojIndeks() {
		return brojIndeks;
	}

	public void setBrojIndeks(String brojIndeks) {
		this.brojIndeks = brojIndeks;
	}

	public int getOcjena1() {
		return ocjena1;
	}

	public void setOcjena1(int ocjena1) {
		this.ocjena1 = ocjena1;
	}

	public int getOcjena2() {
		return ocjena2;
	}

	public void setOcjena2(int ocjena2) {
		this.ocjena2 = ocjena2;
	}

	public int getOcjena3() {
		return ocjena3;
	}

	public void setOcjena3(int ocjena3) {
		this.ocjena3 = ocjena3;
	}

	//racunanje prosjeka
	 public double izracunajProsjek() {
	        return (ocjena1 + ocjena2 + ocjena3) / 3.0;
	    }

	 
	 
	 //da li moze da ima kredit
	 public boolean imaPravoNaKredit() {
		 return izracunajProsjek()>9.0;
		 
	 }
	 
	 //dodavanje studenta u spisak
	 public void dodajUSpisak() {
	        String kredit= imaPravoNaKredit() ? "Da" : "Ne";
	        spisak += ime + " " + prezime + " - Kredit: " + kredit + "\n";
	    }
	 
	 //ispisivanje rezultata
	 public void ispisiPodatke() {
		    System.out.println(ime + " " + prezime + " (" + brojIndeks + 
		        ") | Ocjene: " + ocjena1 + ", " + ocjena2 + ", " + ocjena3 + 
		        " | Prosjek: " + String.format("%.2f", izracunajProsjek()) +
		        " | Kredit: " + (imaPravoNaKredit() ? "DA" : "NE"));
		}

	 
	 
	 
	 }

	

