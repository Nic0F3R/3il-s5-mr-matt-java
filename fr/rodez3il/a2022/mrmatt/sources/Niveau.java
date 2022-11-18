package fr.rodez3il.a2022.mrmatt.sources;

import fr.rodez3il.a2022.mrmatt.sources.objets.*;

public class Niveau {
	
	// Les objets sur le plateau du niveau
	private ObjetPlateau[][] plateau;
	// Position du joueur
	private int joueurX;
	private int joueurY;
	
  // Autres attributs que vous jugerez nécessaires...
  
	/**
	 * Constructeur public : crée un niveau depuis un fichier.
	 * @param chemin .....
	 * @author .............
	 */
	public Niveau(String chemin) {
		//this();
		chargerNiveau(chemin);
	}
	
	private void chargerNiveau(String ficher) {
		//TODO
	}

	/**
	 * Javadoc à réaliser...
	 */
	private void echanger(int sourceX, int sourceY, int destinationX, int destinationY) {
    // ........
	}

	/**
	 * Produit une sortie du niveau sur la sortie standard.
	 * ................
	 */
	public void afficher() {
    // TODO
	}

  // TODO : patron visiteur du Rocher...
	public void etatSuivantVisiteur(Rocher r, int x, int y) {
    
	}

	/**
	 * Calcule l'état suivant du niveau.
	 * ........
	 * @author 
	 */
	public void etatSuivant() {
    // TODO
	}


  // Illustrez les Javadocs manquantes lorsque vous coderez ces méthodes !
  
	public boolean enCours() {
		
		/**
		 * @todo : rédiger la fonction
		 */
		
		return false;
	}

  // Joue la commande C passée en paramètres
	public boolean jouer(Commande c) {
		/**
		 * @todo : rédiger la fonction
		 */
		
		return false;
	}

	/**
	 * Affiche l'état final (gagné ou perdu) une fois le jeu terminé.
	 */
	public void afficherEtatFinal() {
	}

	/**
	 */
	public boolean estIntermediaire() {
		/**
		 * @todo : rédiger la fonction
		 */
		
		return false;
	}

  // Code pour empêcher la compilation

}
