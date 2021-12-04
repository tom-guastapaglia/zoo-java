package Animaux.mammifères;

import Animaux.Animal;

/**
 * 
 */
public abstract class Mammifere extends Animal {

    private int gestation;

    /**
     * Default constructor
     */
    public Mammifere(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante, int gestation) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante);
        this.gestation = gestation;
    }

    public Animal mettreBas() {
        if (sexe == false) {
        }
        // TODO implement here
        return null;
    }

}