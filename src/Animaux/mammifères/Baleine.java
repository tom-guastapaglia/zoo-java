package Animaux.mammifères;

import Animaux.Animal;
import Animaux.mammifères.Mammifere;

/**
 * 
 */
public class Baleine extends Mammifere {

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
}