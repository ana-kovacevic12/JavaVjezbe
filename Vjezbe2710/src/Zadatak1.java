import javax.swing.JOptionPane;

public class Zadatak1 {
	
	public static void main(String[] args) {
		String ime=JOptionPane.showInputDialog("Unesite ime :");
		String prezime=JOptionPane.showInputDialog("Unesite prezime :");
		String godiste=JOptionPane.showInputDialog("Unesite godiste:");
		
		int godinaRodjenja=Integer.parseInt(godiste);
		
		String confirmintoMessage="Pregled podataka:\n\n"+
									"Ime: "+ime+"\n"+
									"Prezime: "+prezime+"\n"+
									"Godina rodjenja: "+godinaRodjenja+ "\n"+
									"Da li su uneseni podaci tacni?";
		int dugme=JOptionPane.showConfirmDialog(null,
												confirmintoMessage,
												"Pregled i potvrda unosa",
												JOptionPane.YES_NO_OPTION);
								
		if(dugme==JOptionPane.YES_OPTION) {
			String email=ime +"." + prezime + godinaRodjenja + "@kompanija.me";
			JOptionPane.showConfirmDialog(null,
										"Vasa email adresa je : "+email,
										"Email",
										JOptionPane.INFORMATION_MESSAGE);
			
		}else {
			JOptionPane.showConfirmDialog(null,
											"Korisnik je otkazao pravljenje mejla","Email",
											JOptionPane.INFORMATION_MESSAGE);
		
		
		}
	}

}