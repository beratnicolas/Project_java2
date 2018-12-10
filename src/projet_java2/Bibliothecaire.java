package projet_java2;

public class Bibliothecaire implements DelaiRestitutionDepasseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DelaiDepasseEvent evt;
	
	public Bibliothecaire() {}

	@Override
	public void exemplaireNonRestitue(DelaiDepasseEvent evt) {
		evt.toString();
	}

	public DelaiDepasseEvent getEvt() {
		return evt;
	}

	public void setEvt(DelaiDepasseEvent evt) {
		this.evt = evt;
	}

}
