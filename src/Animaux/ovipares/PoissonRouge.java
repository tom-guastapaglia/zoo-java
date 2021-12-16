package Animaux.ovipares;

import Animaux.Marin;

/**
 * 
 */
public class PoissonRouge extends Ovipare implements Marin {

    /**
     * Default constructor
     */
    public PoissonRouge(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Poisson rouge", id, nom, sexe, poids, taille, age, 5);
    }

    @Override
    public void emettreSon() {
        System.out.println("GlopGlopGlop");
    }

    @Override
    public boolean nager() {
        return true;
    }
}