
public class Sportverein {
	public static void main(String[] args) {
		Teilnehmer t1 = new Teilnehmer("Peter", "Dortmund");
		Teilnehmer t2 = new Teilnehmer("Hans", "Schalke");
		Teilnehmer t3 = new Teilnehmer("Gustav", "M�nchen");
		Teilnehmer t4 = new Teilnehmer("Wolfgang", "Gladbach");
		Teilnehmer t5 = new Teilnehmer("Manni", "Bielefeld");
		
		Kurs kurs1 = new Kurs("Fussball");
		kurs1.teilnehmerHinzuf�gen(t1);
		kurs1.teilnehmerHinzuf�gen(t2);
		kurs1.teilnehmerHinzuf�gen(t3);
		kurs1.teilnehmerHinzuf�gen(t4);
		kurs1.teilnehmerHinzuf�gen(t5);
		
		kurs1.suchTeilnehmerName("Hans");
		kurs1.l�scheTeilnehmer();
		
		Teilnehmer t7 = new Teilnehmer("G���nther", "Hinter der Br�cke rechts");
		kurs1.suchTeilnehmerName("Gustav");
		kurs1.ver�ndereTeilnehmer(t7);
		Teilnehmer t8 = kurs1.suchTeilnehmerName("Manni");
		
		System.out.println(t7.toString());
		System.out.println(t8.toString());
	}

}
