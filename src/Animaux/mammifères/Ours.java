package Animaux.mammifères;

import Animaux.mammifères.Mammifere;

/**
 * 
 */
public class Ours extends Mammifere {

    /**
     * Default constructor
     */
    public Ours(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante, int gestation) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante, gestation);
    }

    @Override
    public void emmetreSon() {
        System.out.println("GraaGraaGraa");
    }
}