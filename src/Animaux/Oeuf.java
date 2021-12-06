package Animaux;

import Animaux.Animal;
import Animaux.ovipares.Aigle;

/**
 * 
 */
public class Oeuf {

    private int incubation;
    private int tempsEcoule;
    private int taille;
    /**
     * Default constructor
     */
    public Oeuf(int incubation, int taille) {
        this.incubation = incubation;
        this.taille = taille;
        this.tempsEcoule = 0;
    }


    /**
     * @return
     */
    public Animal eclore() {
        if (this.tempsEcoule == this.incubation) {
            return new Aigle(17, "Fred", true, 2, 1, 0, false, false, false,0, this.incubation);
        }
        return null;
    }

}