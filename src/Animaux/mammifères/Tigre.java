package Animaux.mammifères;

import Animaux.mammifères.Mammifere;

/**
 * 
 */
public class Tigre extends Mammifere {

    /**
     * Default constructor
     */
    public Tigre(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante, int enceinte, int gestation) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante, enceinte, gestation);
    }

    @Override
    public void emmetreSon() {
        System.out.println("GriiGriiGrii");
    }
}