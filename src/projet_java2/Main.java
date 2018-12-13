package projet_java2;

public class Main {
	public static void main( String [] args ){
        try{
	         Adherent adherent1 = new Adherent( "Albert", "Durant", "2 allee tataouine" ) ;
            @SuppressWarnings("unused")
			Adherent adherent2 = new Adherent( "Joseph", "Beauve", "14 rue de la grange" ) ;
            
            String titre = "BestOfLouisMariano" ;
            String auteur = "Louis Mariano" ;
            int nombreExemplaire = 3 ;
            Varietee varietee1 = new Varietee( titre, auteur, nombreExemplaire ) ;
            Varietee varietee2 = new Varietee( titre, "Luigi", nombreExemplaire ) ;
            
          //  System.out.println( "Adherent 1 avant emprunt = "  + adherent1.toString_hashmap() ) ;
            adherent1.toString_hashmap();
            Exemplaire exemplaire = adherent1.emprunter( varietee1 ) ;
            System.out.println(exemplaire);
            Exemplaire exemplaire2 = adherent1.emprunter( varietee2 ) ;
            System.out.println(exemplaire2);
            adherent1.toString_hashmap();
           // System.out.println( "Adherent 1 apres emprunt = " + adherent1.getEmprunts() ) ;

	         adherent1.ramener( exemplaire ) ;
       //  System.out.println( "Adherent 1 apres restitution = " + adherent1.getEmprunts() ) ;
	         adherent1.toString_hashmap();

        } catch( Exception e ){
            e.printStackTrace() ;
        }        
 }
}
