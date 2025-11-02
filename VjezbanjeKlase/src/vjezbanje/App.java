package vjezbanje;

public class App {

	public static void main(String[] args) {
		BankovniRacun racun = new BankovniRacun("Ana Anić",40); 

        Transakcija t1 = new Transakcija(1, "uplata", "Uplata stipendije"); 
        Transakcija t2 = new Transakcija(40, "isplata", "Kupovina knjige"); 
        
        if (t1.jeUplata())
            racun.uplati(t1.getIznos());
        else
            racun.isplati(t1.getIznos());

        // ako je transakcija uplata, pozivamo uplatu,ako ne isplata je
        if (t2.jeUplata())
            racun.uplati(t2.getIznos());
        else
            racun.isplati(t2.getIznos());

        racun.ispisi(); 
    }

	}


