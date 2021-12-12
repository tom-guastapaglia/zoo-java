package Animaux.ovipares;

import Animaux.Animal;
import Animaux.Oeuf;

/**
 * 
 */
public abstract class Ovipare extends Animal {

    private final int incubation;

    /**
     * Default constructor
     */
    public Ovipare(String type, int id, String nom, boolean sexe, int poids, float taille, int age, int incubation) {
        super(type, id, nom, sexe, poids, taille, age, 0, false, false, true);
        this.incubation = incubation;
    }

    public Oeuf Pondre() {
        // TODO implement here
        return null;
    }

}