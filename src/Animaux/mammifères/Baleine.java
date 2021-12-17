package Animaux.mammifères;

import Animaux.Marin;

/**
 * Class Baleine
 */
public class Baleine extends Mammifere implements Marin {

    /**
     * Default constructor
     */
    public Baleine(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Baleine", id, nom, sexe, poids, taille, age, 420);
    }

    /**
     * Emet le son de la baleine
     */
    @Override
    public void emettreSon() {
        System.out.println("GloupGloupGloup");
    }

    /**
     * Permet à la baleine de nager
     * @return boolean
     */
    @Override
    public boolean nager() {
        return true;
    }
}