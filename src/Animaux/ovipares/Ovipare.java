package Animaux.ovipares;

import Animaux.*;

import java.awt.desktop.OpenURIEvent;

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
        if (!sexe && enceinte != 0) {
            double taille = 0;
            switch (this.type){
                case "Aigle":
                    taille = 2.3;
                case "Pingouin":
                    taille = 7.6;
                case "PoissonRouge":
                    taille = 0.5;
                case "Requin":
                    taille = 15;
            }
            return new Oeuf(this.type, taille, this.incubation, 0);
        }
        return null;
    }
}
