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
    public Mammifere(String type, int id, String nom, boolean sexe, int poids, float taille, int age, int gestation) {
        super(type, id, nom, sexe, poids, taille, age, 0, false, false, true);
        this.gestation = gestation;
    }

    public Animal mettreBas() {
        if (!sexe) {

        }
        // TODO implement here
        return null;
    }
}