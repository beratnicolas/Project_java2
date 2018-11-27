package projet_java2;

import java.util.ArrayList;

public class Adherents {
	private ArrayList<Adherent> listAdh = new ArrayList<Adherent>();
	
	public Adherents(ArrayList<Adherent> listAdh) {
		this.listAdh = listAdh;
	}
	
	public void sauvegarder() {
		
	}
	
	public void restaurer() {
		
	}
	
//	public Adherent getAdherent(String nom, String adresse) {
		
//	}
	
	public void addAdherent(Adherent adherent) {
		this.listAdh.add(adherent);
	}
	
	public void addDelaiRestitutionDepasseListener(DelaiRestitutionDepasseListener l) {
		
	}
}
