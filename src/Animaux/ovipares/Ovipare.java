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
    public Ovipare(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante, int enceinte, int incubation) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante, enceinte);
        this.incubation = incubation;
    }

    public Oeuf Pondre() {
        if (!this.sexe) {
            if(this.enceinte == this.incubation) {
                new Oeuf(this.incubation, 34);
            }
        }
        return null;
    }

}