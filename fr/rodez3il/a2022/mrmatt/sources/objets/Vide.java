package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Vide extends ObjetPlateau {

	@Override
	public char afficher() {
		return ' ';
	}
	
	@Override
	public boolean estVide() {
		return true;
	}
	
	/**
	 * @return true car le vide est marchable
	 */
	@Override
	public boolean estMarchable() {
		return true;
	}
	
	/**
	 * @return false car le vide est non-poussable
	 */
	@Override
	public boolean estPoussable() {
		return false;
	}
	
	/**
	 * return false car le vide est non-glissant
	 */
	@Override
	public boolean estGlissant() {
		return false;
	}

}
