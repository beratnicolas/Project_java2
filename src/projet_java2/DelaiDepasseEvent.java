package projet_java2;

public class DelaiDepasseEvent extends EventObject {
	private Exemplaire exemplaireConflict;
	private Adherent adherentConflict;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DelaiDepasseEvent(Exemplaire exemplaireConflict, Adherent adherentConflict) {
		this.adherentConflict = adherentConflict;
		this.exemplaireConflict = exemplaireConflict;
	}

	public Exemplaire getExemplaireConflict() {
		return exemplaireConflict;
	}

	public void setExemplaireConflict(Exemplaire exemplaireConflict) {
		this.exemplaireConflict = exemplaireConflict;
	}

	public Adherent getAdherentConflict() {
		return adherentConflict;
	}

	public void setAdherentConflict(Adherent adherentConflict) {
		this.adherentConflict = adherentConflict;
	}

	@Override
	public String toString() {
		return " Litige : exemplaireConflict=" + exemplaireConflict + ", adherentConflict=" + adherentConflict;
	}
	
	

}
