package vjezbanje;

public class Test {

	public static void main(String[] args) {
		Automobil automobil1=new Automobil("Golf",2010,3000,"Plava",4,"Dizel");
		Kamion kamion1=new Kamion("Mercedes",2013,8000,"Crvena",17.8,true);
		Kombi kombi1=new Kombi("Opel",2008,2700,"Bijela",5);
		
		System.out.println("Automobil");
		automobil1.ispisiPodatke();
		
		
		System.out.println("Kamion");
		kamion1.ispisiPodatke();
		
		System.out.println("Kombi");
		kombi1.ispisiPodatke();

	}

}
