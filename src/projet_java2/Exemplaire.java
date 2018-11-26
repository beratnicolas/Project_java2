package projet_java2;

public class Exemplaire {
	private  int numero;
	private  String titre;
	private  String auteur;
	private  Oeuvre oeuvre = new Oeuvre(titre, auteur, numero);

	public Exemplaire(String titre, String auteur, int numero) {
		titre = oeuvre.getTitre();
		auteur = oeuvre.getAuteur();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void ramener(Exemplaire exemplaire){
		this.numero += 1;
	}
	
}
