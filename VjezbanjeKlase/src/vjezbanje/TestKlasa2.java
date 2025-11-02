package vjezbanje;

public class TestKlasa2 {

	public static void main(String[] args) {
		BankovniRacun racun = new BankovniRacun("Marko Marković", 150.0);

        racun.ispisi();

        racun.uplati(50.0);
        racun.ispisi();

        racun.isplati(80.0);
        racun.ispisi();

        racun.isplati(200.0);

	}

}
