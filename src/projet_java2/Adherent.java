package projet_java2;

import java.util.Hashtable;

public class Adherent {
	private String prenom;
	private String nom;
	private String adresse;
	Hashtable<Adherent, Exemplaire> dicoExemplairePret;

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
		Exemplaire exemplaire = new Exemplaire(oeuvre.getTitre(), oeuvre.getAuteur(), 1);
		System.out.println("Adherent" + exemplaire.toString());
		return exemplaire;
	}
	
	public void ramener(Exemplaire exemplaire) {
		int numero = exemplaire.getNumero();
		if (numero > 0) {
			exemplaire.setNumero(numero - 1);
		}
	}

	@Override
	public String toString() {
		return "Adherent : [prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + "]";
	}
	
	

}
