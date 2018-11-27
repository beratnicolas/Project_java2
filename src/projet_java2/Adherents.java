package projet_java2;

import java.util.ArrayList;

public class Adherents implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Adherent> listAdh;
	
	public Adherents() {}
	
	public ArrayList<Adherent> getListAdh() {
		return listAdh;
	}

	public void setListAdh(ArrayList<Adherent> listAdh) {
		this.listAdh = listAdh;
	}

	public void sauvegarder() {
		
	}
	
	public void restaurer() {
		
	}
	
	public Adherent getAdherent(String nom, String prenom, String adresse) {
		for (Adherent adh : listAdh) {
			if(adh.getNom() == nom && adh.getPrenom() == prenom && adh.getAdresse() == adresse) {
				return adh;
			}
		}
		return null;
	}
	
	public void addAdherent(Adherent adherent) {
		this.listAdh.add(adherent);
	}
	
	public void addDelaiRestitutionDepasseListener(DelaiRestitutionDepasseListener l) {
		l.exemplaireNonRestitue(l.getEvt());
	}

	@Override
	public void run() {
		
	}
}
