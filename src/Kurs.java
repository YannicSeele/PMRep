
public class Kurs {
	private String name;
	private DoubleLinkedList alleMitglieder;
	
	public Kurs(String name) {
		this.name = name;
		alleMitglieder = new DoubleLinkedList();
	}

	public void teilnehmerHinzuf�gen(Teilnehmer t) {
		alleMitglieder.addElement(t);
	}
	
	public String getName() {
		return this.name;
	}
	
	public Teilnehmer suchTeilnehmerName(String name) {
		alleMitglieder.goToFirst();
		Teilnehmer t = (Teilnehmer) alleMitglieder.getObject();
		while(t.getName() != null) {
			if(t.getName().equals(name)) {
				return t;
			}
			try {
				alleMitglieder.goToNext();
			}
			catch(NullPointerException npe) {
				return null;
			}
			t = (Teilnehmer) alleMitglieder.getObject();
		}
		return null;
	}
	
	public void ver�ndereTeilnehmer(Teilnehmer neuerTeilnehmer) {
		alleMitglieder.modifyObject(neuerTeilnehmer);
	}
	
	public void l�scheTeilnehmer() {
		alleMitglieder.removeObject();
	}
}
