package projet_java2;

import java.util.*;


public class Oeuvre {
	private String titre;
	private String auteur;
	private int nbex;
	public ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
	
	
	public Oeuvre(String titre, String auteur, int nbex){
		this.titre = titre;
		this.auteur = auteur;
		this.nbex = nbex;
		int numero = 1;
		for(int i = 0; i < nbex; i++) {
			exemplaires.add(new Exemplaire(numero));
			numero += 1;
		}
	}

	
	public int getNbex() {
		return nbex;
	}


	public void setNbex(int nbex) {
		this.nbex = nbex;
	}


	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
	public Exemplaire emprunter(Adherent adherent) {
		if (this.nbex <= 0) {
			System.out.println("boucle 1 null");
			return null;
		}
		for (Exemplaire ex : exemplaires) {
			System.out.println("boucle pas if");
			if (ex.isDispo()) {
				System.out.println("boucle if");
				ex.setDispo(false);
				return ex;
			}
		}
		System.out.println("boucle 2 null");
		return null;
	}


	@Override
	public String toString() {
		return "Oeuvre [titre=" + titre + ", auteur=" + auteur + ", nbex=" + nbex + "]";
	}

	


}
