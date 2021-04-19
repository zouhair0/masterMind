[FR]

# masterMind
Le projet consiste à implementer un jeu de mastermind en ligne de commande en java :

Règles:
- Quand le jeu commence un code secret de 4 digits est généré, le but du jeu est de trouver le code.
- Le joueur doit être capable de proposer un code à 4 chiffres et le jeu lui affiche des signes pour l'aider.
- Le jeu termine quand le joueur a trouvé la combinaison exacte du code secret.

```
1 - Le jeu retournera un signe + pour un match exact
2 - Le jeu retournera un signe - pour un match partiel
3 - Un match exact est un digit à la bonne valeur et la bonne position
par rapport au code secret
4 - Un match partiel est un digit à la bonne valeur mais à la mauvaise
position par rapport au code secret
5 - Les matchs exacts sont prioritaires par rapport aux matchs partiels
6 - Une fois qu'un digit a été utilisé pour un match, il ne peut plus
être utilisé pour un autre match
```
Exemples:

```
Secret: 1243, Proposition: 1254 Réponse: ++- car deux matchs exacts
(1,2) et un match partiel (4)
Secret: 1234, Proposition: 2002 Réponse: - car comme 2 a été utilisé
pour un match partiel, il ne peut plus etre réutilisé (règle 6)
Secret: 1234, Proposition: 2200 Réponse: + (règle 5)
Secret: 3129, Proposition: 1249 Réponse: +--
Secret: 1234, Proposition: 1234 Réponse: ++++
Secret: 2234, Proposition: 2234 Réponse: ++++
```

## Build Requirements
- JDK 8+ 
- Maven 3+

## Usage
- Importer le projet sur Eclipse / Intellij
- Executer la classe App.java autant que application java
- Lancer mvn clean install pour le build du projet et générer un jar auto-indépendant 
- Vous pouvez lancer le projet à travers une ligne de commande aussi : java -jar masterMind-0.0.1-SNAPSHOT.jar


