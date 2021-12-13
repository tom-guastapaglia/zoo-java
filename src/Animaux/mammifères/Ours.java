package Animaux.mammifères;

import Animaux.mammifères.Mammifere;

/**
 * 
 */
public class Ours extends Mammifere {

    /**
     * Default constructor
     */
    public Ours(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Ours", id, nom, sexe, poids, taille, age, 200);
    }

    @Override
    public void emmetreSon() {
        System.out.println("GrisGrisGris");
    }
}