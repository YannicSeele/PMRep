
public class Teilnehmer {
	private String name;
	private String adresse;
	
	public Teilnehmer(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getName() {
		return this.name;
	}
	
	public String getAdresse() {
		return this.adresse;
	}
	
	public String toString() {
		return "Name: " + name +"; Adresse: " + adresse;
	}
}
