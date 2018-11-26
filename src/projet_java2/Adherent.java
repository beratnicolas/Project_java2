package projet_java2;

public class Adherent {
	private String prenom;
	private String nom;
	private String adresse;

	public Adherent(String prenom, String nom, String adresse) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public Exemplaire emprunter(Oeuvre oeuvre) {
		int numero = oeuvre.getNumeroExemplaire() - 1; //exemple for no errors
		Exemplaire exemplaire = new Exemplaire("a", "b", numero); //exemple for no errors
		return exemplaire;
	}
	
	public void ramener(Exemplaire exemplaire) {
		@SuppressWarnings("unused")
		int numero = exemplaire.getNumero();//exemple for no errors
		numero -= 1;
		return;
	}

	@Override
	public String toString() {
		return "Adherent : [prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + "]";
	}
	
	

}
