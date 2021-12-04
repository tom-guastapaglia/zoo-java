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
    public Ovipare(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante, int incubation) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante);
        this.incubation = incubation;
    }

    public Oeuf Pondre() {
        // TODO implement here
        return null;
    }

}