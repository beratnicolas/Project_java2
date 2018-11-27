package projet_java2;

public interface DelaiRestitutionDepasseListener extends EventListener {

	public void exemplaireNonRestitue(DelaiDepasseEvent evt);
	public DelaiDepasseEvent getEvt();
	public void setEvt(DelaiDepasseEvent evt);
	
}
