package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Herbe extends ObjetPlateau {

	@Override
	public char afficher() {
		return '-';
	}
	
	@Override
	public boolean estVide() {
		return false;
	}
	
	/**
	 * @return true car l'Herbe est marchable
	 */
	@Override
	public boolean estMarchable() {
		return true;
	}
	
	/**
	 * @return false car l'herbe est non-poussable
	 */
	@Override
	public boolean estPoussable() {
		return false;
	}
	
	/**
	 * return false car l'herbe est non-glissante
	 */
	@Override
	public boolean estGlissant() {
		return false;
	}

}
