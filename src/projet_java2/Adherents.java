package projet_java2;

import java.util.ArrayList;
import java.io.*;

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

	public void sauvegarder() throws Exception {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sauvegarde.txt"));
		out.writeObject(this.listAdh);
		out.close();
	}
	
	public void restaurer() throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("sauvegarde.txt"));
		@SuppressWarnings("unchecked")
		ArrayList<Adherent> adhs = (ArrayList<Adherent>) in.readObject();
		System.out.println(adhs);
		in.close();
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
