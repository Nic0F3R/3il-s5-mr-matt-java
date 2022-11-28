package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Pomme extends ObjetPlateau {

	@Override
	public char afficher() {
		return '+';
	}
	
	@Override
	public boolean estVide() {
		return false;
	}
	
	/**
	 * @return true car la Pomme est marchable
	 */
	@Override
	public boolean estMarchable() {
		return true;
	}
	
	/**
	 * @return false car la Pomme est non-poussable
	 */
	@Override
	public boolean estPoussable() {
		return false;
	}
	
	/**
	 * return false car la Pomme est non-glissante
	 */
	@Override
	public boolean estGlissant() {
		return false;
	}

}
