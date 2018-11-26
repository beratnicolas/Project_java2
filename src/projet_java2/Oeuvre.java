package projet_java2;

public class Oeuvre {
	private String titre;
	private String auteur;
	private int numeroExemplaire = getNumero();
	
	public Oeuvre(String titre, String auteur, int numeroExemplaire){
		this.numeroExemplaire = numeroExemplaire;
		this.titre = titre;
		this.auteur = auteur;
	}
	
	

}
