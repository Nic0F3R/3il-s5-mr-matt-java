package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Mur extends ObjetPlateau {

	@Override
	public char afficher() {
		return '#';
	}
	
	@Override
	public boolean estVide() {
		return false;
	}
	
	/**
	 * @return false car l'Herbe est non-marchable
	 */
	@Override
	public boolean estMarchable() {
		return false;
	}
	
	/**
	 * @return false car le mur est non-poussable
	 */
	@Override
	public boolean estPoussable() {
		return false;
	}
	
	/**
	 * return false car le mur est non-glissant
	 */
	@Override
	public boolean estGlissant() {
		return false;
	}

}
