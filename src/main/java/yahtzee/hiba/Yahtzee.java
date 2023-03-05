package yahtzee.hiba;

import java.util.Arrays;
import java.util.Scanner;

public class Yahtzee {

	// Fonction pour lancer les dés et retourner le résultat
	public static int[] lancerDes() {
	    int[] des = new int[5];
	    for (int i = 0; i < 5; i++) {
	        des[i] = (int) (Math.random() * 6) + 1;
	    }
	    return des;
	}

	// Fonction pour afficher les dés
	public static void afficherDes(int[] des) {
	    System.out.println("Vos dés sont :");
	    for (int i = 0; i < 5; i++) {
	        System.out.println("   " + (i+1) + ": " + des[i]);
	    }
	}

	// Fonction pour sélectionner les dés à relancer
	public static int[] selectionnerDesARelancer() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Quels dés voulez-vous relancer ? Entrez les numéros séparés par des virgules (ex: 1,3,5) ou appuyez sur Entrée pour garder tous les dés: ");
	    String reponse = scanner.nextLine();
	    if (reponse.equals("")) {
	        return new int[0];
	    } else {
	        String[] nums = reponse.split(",");
	        int[] desARelancer = new int[nums.length];
	        for (int i = 0; i < nums.length; i++) {
	            desARelancer[i] = Integer.parseInt(nums[i]);
	        }
	        return desARelancer;
	    }
	}

	// Fonction pour compter les occurrences de chaque numéro
	public static int[] compterOccurrences(int[] des) {
	    int[] occurrences = new int[6];
	    for (int i = 0; i < 5; i++) {
	        occurrences[des[i]-1]++;
	    }
	    return occurrences;
	}

	// Fonction pour vérifier si une combinaison de dés est un Yahtzee
	public static boolean estYahtzee(int[] des) {
	    int premierDes = des[0];
	    for (int i = 1; i < 5; i++) {
	        if (des[i] != premierDes) {
	            return false;
	        }
	    }
	    return true;
	}
	
	// Fonction pour calculer le score pour une combinaison de dés donnée
	public static int calculerScore(int[] des, String combinaison) {
	    int[] occurrences = compterOccurrences(des);
	    if (combinaison.equals("Yahtzee")) {
	        if (estYahtzee(des)) {
	            return 50;
	        } else {
	            return 0;
	        }
	    } else if (combinaison.equals("Petite suite")) {
	            return 30;
	        } else {
	            return 0;
	        }
    	} else if (combinaison.equals("Petite suite")) {
    		return 40;
    	} else {
    		return 0;
    	}
	    
