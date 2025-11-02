package vjezbanje;

public class TestKlasa {

	public static void main(String[] args) {
		Student s1 = new Student("Marko", "Marković", "IB24001", 10, 9, 10);
        Student s2 = new Student("Ana", "Anić", "IB24002", 8, 9, 7);
        Student s3 = new Student("Petar", "Petrović", "IB24003", 9, 10, 10);
        Student s4 = new Student("Jelena", "Jelić", "IB24004", 6, 7, 8);
        
        
        s1.ispisiPodatke();
        s2.ispisiPodatke();
        s3.ispisiPodatke();
        s4.ispisiPodatke();

        // Dodajemo studente u statički spisak
        s1.dodajUSpisak();
        s2.dodajUSpisak();
        s3.dodajUSpisak();
        s4.dodajUSpisak();

        // Na kraju programa ispisujemo spisak studenata i da li imaju stipendiju
        System.out.println("📋 Spisak studenata i pravo na stipendiju:");
        System.out.println(Student.spisak);

	}

}
