package projet_java2;

import java.util.*;

public class Adherent {
	private String prenom;
	private String nom;
	private String adresse;
	private HashMap<Exemplaire, Pret> emprunts;

	public Adherent(String prenom, String nom, String adresse) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.emprunts = new HashMap<Exemplaire, Pret>();
	}

	
	public HashMap<Exemplaire, Pret> getEmprunts() {
		return emprunts;
	}


	public void setEmprunts(HashMap<Exemplaire, Pret> emprunts) {
		this.emprunts = emprunts;
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
		Exemplaire exemplaire = oeuvre.emprunter(this);
		emprunts.put(exemplaire, new Pret(Pret.date_now()));
		return exemplaire;
	}
	
	public void ramener(Exemplaire exemplaire) {
		emprunts.remove(exemplaire);
	}
	
	public void toString_hashmap() {
		Exemplaire clef = null;
		//Pret valeur = null;
		Iterator<Exemplaire> i = emprunts.keySet().iterator();
		System.out.println("--------------------------------------------");
		while (i.hasNext())
		{
		    clef = i.next();
		  //  valeur = emprunts.get(clef);
		    System.out.println(clef);
		}
	}

	@Override
	public String toString() {
		return "Adherent : [prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + "]";
	}
	
	

}
