package Animaux.mammifères;

import Animaux.mammifères.Mammifere;

/**
 * 
 */
public class Loup extends Mammifere {

    /**
     * Default constructor
     */
    public Loup(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante, int gestation) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante, gestation);
    }

    @Override
    public void emmetreSon() {
        System.out.println("AhouAhouhou");
    }
}