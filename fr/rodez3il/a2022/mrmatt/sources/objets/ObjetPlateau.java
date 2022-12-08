package fr.rodez3il.a2022.mrmatt.sources.objets;

import fr.rodez3il.a2022.mrmatt.sources.Niveau;

public abstract class ObjetPlateau {
	
	/**
	 * Fabrique des objets
	 * 
	 * @param chr un caractère correspondant à un objet héritant d'ObjetPlateau
	 * @return un objet instancié correspondant, héritant d'ObjetPlateau
	 */
	public static ObjetPlateau depuisCaractere(char chr) {
		
		ObjetPlateau nouveau = null;
		
		switch(chr) { // chr 
			case '-':
				nouveau = new Herbe();
				break;
			case '+':
				nouveau = new Pomme();
				break;
			case '*':
				nouveau = new Rocher();
				break;
			case ' ':
				nouveau = new Vide();
				break;
			case '#':
				nouveau = new Mur();
				break;
			case 'H':
				nouveau = new Joueur();
				break;
		}
		
		return nouveau;
	}
	
	/**
	 * Est redéfinie dans Rocher, Vide, Mur, Joueur et Pomme
	 * 
	 * @return la chaîne de caractère correspondant à l'ObjetPlateau nouveau
	 */
	public abstract char afficher();
	
	
	/**
	 * @return true si l'ObjetPlateau nouveau est vide, false si non-vide
	 */
	public abstract boolean estVide();

	
	/**
	 * Vérifie si l'ObjetPlateau nouveau est marchable ou non
	 * 
	 * @return true si marchable, sinon false
	 */
	public abstract boolean estMarchable();
	
	/**
	 * Vérifie si l'ObjetPlateau nouveau est poussable ou non
	 * 
	 * @return true si poussable, sinon false
	 */
	public abstract boolean estPoussable();
	
	/**
	 * Vérifie si l'ObjetPlateau nouveau est glissant ou non
	 * 
	 * @return true si glissant, sinon false
	 */
	public abstract boolean estGlissant();
	
	
	/**
	 * Permet de calculer l'état suivant pour Rocher
	 * 
	 * @param niveau
	 * @param x
	 * @param y
	 */
	public void visiterPlateauCalculEtatSuivant(Niveau niveau, int x, int y) {}
	
}
