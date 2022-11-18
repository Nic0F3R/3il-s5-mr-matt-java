package fr.rodez3il.a2022.mrmatt.sources.objets;

import fr.rodez3il.a2022.mrmatt.sources.Niveau;

public abstract class ObjetPlateau {
	
	private ObjetPlateau nouveau;
	
	/**
	 * Fabrique des objets
	 * @param chr le symbole à produire
	 * @return la classe ObjetPlateau correspondante
	 */
	public ObjetPlateau depuisCaractere(char chr) {
		//nouveau = null;
		switch(chr) {
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
	public boolean estVide() {
		return (this.nouveau == null);
	}
	
	/**
	 * Vérifie si l'ObjetPlateau nouveau est marchable ou non
	 * 
	 * @return true si marchable, sinon false
	 */
	public boolean estMarchable() {
		boolean resultat = false;
		
		if(this.nouveau instanceof Herbe) {
			resultat = true;
		} else if(this.nouveau instanceof Joueur) {
			resultat = false;
		} else if(this.nouveau instanceof Mur) {
			resultat = false;
		} else if(this.nouveau instanceof Pomme) {
			resultat = true;
		} else if(this.nouveau instanceof Rocher) {
			resultat = false;
		} else if(this.nouveau instanceof Vide) {
			resultat = true;
		} else {
			resultat = false;
		}
		
		return resultat;
	}
	
	/**
	 * Vérifie si l'ObjetPlateau nouveau est poussable ou non
	 * 
	 * @return true si poussable, sinon false
	 */
	public boolean estPoussable() {
		boolean resultat = false;
		
		if(this.nouveau instanceof Herbe) {
			resultat = false;
		} else if(this.nouveau instanceof Joueur) {
			resultat = false;
		} else if(this.nouveau instanceof Mur) {
			resultat = false;
		} else if(this.nouveau instanceof Pomme) {
			resultat = false;
		} else if(this.nouveau instanceof Rocher) {
			resultat = true;
		} else if(this.nouveau instanceof Vide) {
			resultat = false;
		} else {
			resultat = false;
		}
		
		return resultat;
	}
	
	/**
	 * Vérifie si l'ObjetPlateau nouveau est glissant ou non
	 * 
	 * @return true si glissant, sinon false
	 */
	public boolean estGlissant() {
		boolean resultat = false;
		
		if(this.nouveau instanceof Herbe) {
			resultat = false;
		} else if(this.nouveau instanceof Joueur) {
			resultat = false;
		} else if(this.nouveau instanceof Mur) {
			resultat = false;
		} else if(this.nouveau instanceof Pomme) {
			resultat = false;
		} else if(this.nouveau instanceof Rocher) {
			resultat = true;
		} else if(this.nouveau instanceof Vide) {
			resultat = false;
		} else {
			resultat = false;
		}
		
		return resultat;
	}
	
	/*
	public void visiterPlateauCalculEtatSuivant(Niniveau, int x, int y) {
		
	}
	*/
	
 }
