package Animaux.mammifères;

import Animaux.mammifères.Mammifere;

/**
 * 
 */
public class Loup extends Mammifere {

    /**
     * Default constructor
     */
    public Loup(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Loup", id, nom, sexe, poids, taille, age, 62);
    }

    @Override
    public void emmetreSon() {
        System.out.println("AhouAhouhou");
    }
}