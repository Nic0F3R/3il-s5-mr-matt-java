package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Rocher extends ObjetPlateau {

	@Override
	public char afficher() {
		return '*';
	}
	
	@Override
	public boolean estVide() {
		return false;
	}
	
	/**
	 * @return false car le Rocher n'est pas marchable
	 */
	@Override
	public boolean estMarchable() {
		return false;
	}
	
	/**
	 * @return true car les Rochers sont poussables
	 */
	@Override
	public boolean estPoussable() {
		return true;
	}
	
	/**
	 * return true car le rocher est glissant
	 */
	@Override
	public boolean estGlissant() {
		return true;
	}

}
