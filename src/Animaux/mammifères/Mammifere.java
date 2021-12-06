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
    public Mammifere(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante, int enceinte, int gestation) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante, enceinte);
        this.gestation = gestation;
    }

    public Animal mettreBas() {
        if (!this.sexe) {
            if(this.enceinte == this.gestation) {
                new Loup(18,"Greg", true, 12, 1, 1, false, false, true, 0,62);
            }
        }
        return null;
    }

}