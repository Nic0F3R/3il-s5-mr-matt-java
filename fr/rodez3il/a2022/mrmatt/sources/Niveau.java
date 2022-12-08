package fr.rodez3il.a2022.mrmatt.sources;

import fr.rodez3il.a2022.mrmatt.sources.objets.*;

public class Niveau {
	
	// Les objets sur le plateau du niveau
	private ObjetPlateau[][] plateau;
	// Position du joueur
	private int joueurX;
	private int joueurY;
	
	private int nbPommes; // le nombre de pommes de la carte
	private int compteurPommes; // le nombre de pommes que le joueur a mangé
	
  // Autres attributs que vous jugerez nécessaires...
  
	/**
	 * Constructeur public : crée un niveau depuis un fichier.
	 * 
	 * @param chemin : le chemin du fichier
	 * 
	 * @author Nicolas Ferraye
	 * @version le 04/12/2022
	 */
	public Niveau(String chemin) {
		chargerNiveau(chemin);
		this.compteurPommes = 0;
	}
	
	/**
	 * Permet de charger un niveau (initialisation de la patrice du plateau) à partir d'un fichier
	 * 
	 * @param fichier
	 * 
	 * @author Nicolas Ferrayé
	 * @version le 05/12/2022
	 */
	private void chargerNiveau(String fichier) {

		String strNiveau = Utils.lireFichier(fichier); // récupère la map et la dimention du tableau
		
		String tabNiveauLignes[] = strNiveau.split("\n");
		
		int dimXmap = Integer.valueOf(tabNiveauLignes[0]);
		int dimYmap = Integer.valueOf(tabNiveauLignes[1]);
		
		plateau = new ObjetPlateau[dimXmap][dimYmap];
		
		for(int i = 0 ; i < dimXmap ; i++) {
			for(int j = 0 ; j < dimYmap ; j++) {
				
				if(tabNiveauLignes[j+2].charAt(i) == '+') {
					this.nbPommes++; // calcul du nombre de pommes dans le niveau chargé
				}
				
				ObjetPlateau element = ObjetPlateau.depuisCaractere(tabNiveauLignes[j+2].charAt(i));
				
				plateau[i][j] = element; // initialisation du plateau
				
			}
		}

	}
	
	/**
	 * Permet de vérifier si un déplacement vers le point [x + deltaX, y + deltaY] est possible ou impossible
	 * 
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
	 * Permet d'échanger l'objet en position [sourceX, sourceY] avec l'objet en position [destinationX, destinationY]
	 * 
	 * @params sourceX
	 * @params sourceY
	 * @params destinationX
	 * @params destinationY
	 */
	private void echanger(int sourceX, int sourceY, int destinationX, int destinationY) {
		ObjetPlateau objet1 = plateau[sourceX][sourceY];
		ObjetPlateau objet2 = plateau[destinationX][destinationY];
		
		plateau[destinationX][destinationY] = objet1;
		plateau[sourceX][sourceY] = objet2;
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
				plateauStr = plateauStr + this.plateau[i][j].afficher();
			}
			
			plateauStr = plateauStr + "\n";
			
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

	/**
	 * Permet de déplacer le joueur en fonction d'une Commande c
	 * @param c la Commande saisie par le joueur
	 * 
	 * @author Nicolas Ferraye
	 * @version le 04/12/2022
	 */
	public boolean jouer(Commande c) {
		
		switch(c) {
		
	        case HAUT:
	            deplacer((this.joueurX - 1), this.joueurY);
	            break;
	            
	        case BAS:
	            deplacer((this.joueurX + 1), this.joueurY);
	            break;
	            
	        case DROITE:
	            deplacer(this.joueurX, (this.joueurY + 1));
	            break;
	            
	        case GAUCHE:
	            deplacer(this.joueurX, (this.joueurY - 1));
	            break;
	            
	        case ANNULER:
	            break;
	            
	        case QUITTER:
	            break;
	            
	        case ERREUR:
	            break;
	            
		}
		
		return true;
		
	}

	/**
	 * Affiche l'état final (gagné ou perdu) une fois le jeu terminé.
	 */
	public void afficherEtatFinal() {
		
		if(this.compteurPommes >= this.nbPommes) {
			System.out.println("Vous avez gagné !");
		}
		
		//TODO : faire de même pour partie perdue
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
