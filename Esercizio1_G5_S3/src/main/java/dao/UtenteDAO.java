package dao;

import entities.Utente;
import utils.JpaUtil;

public class UtenteDAO extends JpaUtil {

	public void saveUtente(Utente u) {
		
		try {
			
			t.begin();
			em.persist(u);
			t.commit();
			
			System.out.println( "Utente inserito correttamente" );
		} catch(Exception e) {
			System.out.println( "ERRORE durante l'inserimento dell'utente!!" );
		}
		
	}
	
}
