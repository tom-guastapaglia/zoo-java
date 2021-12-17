package Enclos;

import java.io.IOException;

/**
 * Class Aquarium
 */
public class Aquarium extends Enclos {

    private int profondeur;
    private int salinite;

    /**
     * Defaut constructor
     * @param id
     * @param nom
     * @param superficie
     * @param animauxMax
     * @param degreProprete
     * @param profondeur
     * @param salinite
     */
    public Aquarium(int id, String nom, int superficie, int animauxMax, int degreProprete, int profondeur,
            int salinite) {
        super(id, nom, superficie, animauxMax, degreProprete);
        this.profondeur = profondeur;
        this.salinite = salinite;
    }

    /**
     * Affiche les caractéristiques de l'aquarium
     */
    @Override
    public void afficherCaracteristiques() {
        System.out.println(nom + ": " + "superficie: " + superficie + ", animaux max: " + animauxMax + ", nbr animaux: "
                + nbrAnimaux + ", degre propreté: " + degreProprete + ", profondeur: " + profondeur + ", salinité: "
                + salinite);
    }

    /**
     * Permet d'entretenir l'aquarium
     * @throws IOException
     * @throws InterruptedException
     */
    @Override
    public void entretenir() throws IOException, InterruptedException {
        System.out.println("Sortie de tous les animaux présents dans l'aquarium");
        System.out.println("Nettoyage de l'aquarium en cours");
        String anim = "|/-\\";
        for (int x = 0; x < 100; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x + " %";
            System.out.write(data.getBytes());
            Thread.sleep(100);
        }
        degreProprete = 1;
        clearConsole();
        System.out.println("\nEntrée des animaux dans leur enclos tout propre");

        System.out.println(nom + " propre, salinté: " + salinite + ", profondeur: " + profondeur);
    }
}