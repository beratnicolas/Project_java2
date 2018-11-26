package projet_java2;

public class Opéra extends Oeuvre {

	public Opéra(String titre, String auteur, int numeroExemplaire) {
		super(titre, auteur, numeroExemplaire);
	}
	
	@Override
	public String toString() {
		return "Opéra : [Titre=" + getTitre() + ", Auteur=" + getAuteur() + ", NumeroExemplaire="
				+ getNumeroExemplaire() + "]";
	}
}
