package fr.rodez3il.a2022.mrmatt.sources.objets;

public class Joueur extends ObjetPlateau {

	@Override
	public char afficher() {
		return 'H';
	}
	
	@Override
	public boolean estVide() {
		return false;
	}
	
	/**
	 * @return false car un Joueur est non marchable
	 */
	@Override
	public boolean estMarchable() {
		return false;
	}
	
	/**
	 * @return false car le joueur est non-poussable
	 */
	@Override
	public boolean estPoussable() {
		return false;
	}
	
	/**
	 * return false car le joueur est non-glissant
	 */
	@Override
	public boolean estGlissant() {
		return false;
	}

}
