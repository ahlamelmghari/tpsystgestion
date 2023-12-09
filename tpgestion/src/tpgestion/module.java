package tpgestion;

import java.util.Scanner;

public class module{

    public static void main(String[] args) {
        // Déclaration d'un scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Initialisation du maximum
        int max = Integer.MIN_VALUE;
        int positionMax = 0;

        // Boucle de saisie des 20 nombres
        for (int i = 0; i < 20; i++) {
            // Demande à l'utilisateur de saisir un nombre
            System.out.println("Veuillez saisir un nombre :");
            int nombre = scanner.nextInt();
            System.out.println("");

            // Mise à jour du maximum
            if (nombre > max) {
                max = nombre;
                positionMax = i;
            }
        }

        // Affichage du maximum
        System.out.println("Le maximum des 20 nombres saisis est " + max + ", saisi à la position " + positionMax);
    }
}
	


