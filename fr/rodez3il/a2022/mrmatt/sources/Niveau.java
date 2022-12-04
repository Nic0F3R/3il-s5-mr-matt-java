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
	 * 
	 * @author Nicolas Ferraye
	 * @version le 04/12/2022
	 */
	public Niveau(String chemin) {
		chargerNiveau(chemin);
	}
	
	private void chargerNiveau(String ficher) {
		//TODO
	}
	
	/**
	 * Permet de vérifier si un déplacement vers le point [x + deltaX, y + deltaY] est possible ou impossible
	 * @param deltaX l'abscisse
	 * @param deltaY l'ordonnée
	 * 
	 * @author Nicolas Ferraye
	 * @version le 04/12/2022
	 * 
	 * @return true si le déplacement du joueur est possible, false si impossible
	 */
	private boolean deplacementPossible(int deltaX, int deltaY) {
		
		int nouveauX = this.joueurX + deltaX;
		int nouveauY = this.joueurY + deltaY;
		
		boolean resultat = false;
		
		// Vérifie que nouveauX et nouveauY sont inclus dans le plateau de dimention du plateau
		if((deltaX == 1 || deltaX == -1) && (deltaY == 1 || deltaY == -1) && nouveauX >= 0 && nouveauX <= this.plateau.length && nouveauY >= 0 && nouveauY <= this.plateau[0].length && this.plateau[nouveauX][nouveauY].estMarchable()) {
			resultat = true;
		} else {
			resultat = false;
		}
		
		return resultat;
		
	}
	
	/**
	 * Permet de déplacer le joueur vers le point [x + deltaX, y + deltaY]
	 * 
	 * @param deltaX
	 * @param deltaY
	 * 
	 * @author Nicolas Ferraye
	 * @version le 04/12/2022
	 */
	public void deplacer(int deltaX, int deltaY) {
		
		int nouveauX = this.joueurX + deltaX;
		int nouveauY = this.joueurY + deltaY;
		
		if(deplacementPossible(nouveauX, nouveauY)) {
			this.joueurX = nouveauX;
			this.joueurY = nouveauY;
		}
		
	}

	/**
	 * Javadoc à réaliser...
	 */
	private void echanger(int sourceX, int sourceY, int destinationX, int destinationY) {
    // ........
	}

	/**
	 * Produit une sortie du niveau sur la sortie standard
	 * Affichage du plateau
	 * 
	 * @author Nicolas Ferraye
	 * @version le 04/12/2022
	 */
	public void afficher() {
		
		String plateauStr = "";
		
		for(int i = 0 ; i < this.plateau.length ; i++) {
			
			for(int j = 0 ; j < this.plateau[0].length ; j++) {
				plateauStr = plateauStr + this.plateau[i][j];
			}
			
		}
		
		System.out.println(plateauStr);
		
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
