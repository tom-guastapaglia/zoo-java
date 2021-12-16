package Animaux.mammifères;

import Animaux.Marin;

/**
 * 
 */
public class Baleine extends Mammifere implements Marin {

    /**
     * Default constructor
     */
    public Baleine(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Baleine", id, nom, sexe, poids, taille, age, 420);
    }

    @Override
    public void emettreSon() {
        System.out.println("GloupGloupGloup");
    }

    @Override
    public boolean nager() {
        return true;
    }
}