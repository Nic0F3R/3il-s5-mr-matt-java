# Projet Mr Matt - 3iL Java

- Nicolas Ferrayé
- Le 08/12/2022


# Ce qui a été réalisé

- La classe abstraite ObjetPlateau
- Correction des différentes erreurs de compilations.
- Création de certains attributs dans Niveau.
- Constructeur de Niveau.
- Fonction chargerNiveau() de Niveau permettant l'initialisation du plateau.
- Fonction deplacementPossible() de Niveau permettant de vérifier si un déplacement du joueur est possible vers un point calculé.
- Fonction deplacer() de Niveau permettant de déplacer le joueur vers un point calculé.
- Fonction echanger() de Niveau permettant d'échanger la position de deux ObjetPlateau.
- Fonction afficher() de Niveau permettant d'afficher dans le terminal le plateau.
- La fonction jouer() de Niveau permettant au joueur d'effectuer un déplacement à partir d'une commande.
- Une partie de la fonction afficherEtatFinal() permettant d'afficher si le joueur a gagné ou perdu (la dernière éventualité n'a pas été développée).

# Réponses aux questions

- 2.1.1 : La classe ObjetPlateau est abstraite car elle ne sera jamais instanciée dans le projet. Seul les classes y héritant le seront.

- 2.2.1 : Cette méthode est privée afin de respecter le principe de la POO et d'encapsulation. En effet, la méthode echanger() ne sera utilisée que dans la classe Niveau.

- 2.2.2 : De même que la question précédente, ces deux méthodes sont privées car ne seront utilisées que dans la classe Niveau, et nous devons respecter le principe de la POO.

- 2.3.4 : Pour respecter le principe de la POO et du polymorphisme, on évite d'utiliser un maximum instanceof en Java.

# Retour personnel

J'ai apprécié la réalisation de ce projet, bien que je n'ai pas eu le temps de le finaliser. Certains points m'ont paru difficiles. Tout d'abord, j'ai eu du mal à comprendre les **règles du jeu**, qui ne sont, au premier abord, pas évidentes. Je pense qu'il existe des projets plus simples, en particulier pour ceux qui débutent en Java, tels qu'un Puissance 4. De plus, je trouve que nous avons **manqué de séances dédiées** à ce projet. Personnellement, j'ai préféré consacrer mon temps libre aux révisions des partiels plutôt qu'à la réalisation de ce projet.