YAHTZEE GAME : 


Les fonctions :
'lancerDes()'
Cette fonction lance cinq dés et renvoie un tableau qui représente le résultat.

'afficherDes(int[] des)'
Cette fonction prend un tableau qui représente le résultat d'un lancer et les affiche dans la console.

'selectionnerDesARelancer()'
Cette fonction invite l'utilisateur à sélectionner les dés qu'il souhaite relancer
et renvoie un tableau qui représente les indices des dés à relancer.

'compterOccurrences(int[] des)'
Cette fonction prend un tableau qui représente un lancer,
et renvoie un tableau représentant le nombre d'occurrences de chaque nombre.

'estYahtzee(int[] des)'
Cette fonction prend un tableau qui représente un lancer,
et renvoie true s'il s'agit d'un Yahtzee (cinq d'une sorte), et un false sinon.

'calculerScore(int[] des, String combinaison)'
Cette fonction prend un tableau qui représente un lancer, 
et une chaîne représentant une combinaison à marquer (par exemple, "full house" ou "Yahtzee").
Il renvoie le score de cette combinaison en fonction du jet.

  NB : Pour le moment, il ne prend en charge que les combinaisons "Yahtzee" et "Petite suite", 
       avec "Yahtzee" marquant 50 points et "Petite suite" marquant 40 points.
       Toutes les autres combinaisons renvoient un score de 0.