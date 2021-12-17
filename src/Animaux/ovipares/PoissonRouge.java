package Animaux.ovipares;

import Animaux.Marin;

/**
 * CLass PoissonRouge
 */
public class PoissonRouge extends Ovipare implements Marin {

    /**
     * Default constructor
     */
    public PoissonRouge(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Poisson rouge", id, nom, sexe, poids, taille, age, 5);
    }

    /**
     * Emet le son du poisson rouge
     */
    @Override
    public void emettreSon() {
        System.out.println("GlopGlopGlop");
    }

    /**
     * Permet au pingouin de nager
     * @return boolean
     */
    @Override
    public boolean nager() {
        return true;
    }
}