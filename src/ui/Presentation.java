package ui;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {

	public static void main(String[] args) {
		/**
		 * Injcetion des d�pendances par
		 * instanciation statique
		 */
		DaoImpl dao=new DaoImpl();
		MetierImpl metier=new MetierImpl();
		metier.setDao(dao);
		System.out.println("Res=>"+metier.calcul());
	}

}
