package Animaux;

import Animaux.ovipares.*;

import java.util.Random;

public class Oeuf {

    private String type;
    private double taille;
    private int incubation;
    private int tempsCouvert;

    /**
     * Default constructor
     */
    public Oeuf(String type, double taille, int incubation, int tempsCouvert) {
        this.type = type;
        this.taille = taille;
        this.incubation = incubation;
        this.tempsCouvert = tempsCouvert;
    }

    public Animal eclore() {
        if (tempsCouvert == incubation) {
            Random sexe = new Random();
            switch (this.type) {
                case "Aigle":
                    if (sexe.nextBoolean()) {
                        return new Aigle(17, "Titouan", true, 1, 1, 0);
                    } else {
                        return new Aigle(17, "Caro", false, 1, 1, 0);
                    }
                case "Pingouin":
                    if (sexe.nextBoolean()) {
                        return new Pingouin(17, "Jean", true, 1, 1, 0);
                    } else {
                        return new Pingouin(17, "Christine", false, 1, 1, 0);
                    }
                case "PoissonRouge":
                    if (sexe.nextBoolean()) {
                        return new PoissonRouge(17, "Bastien", true, 1, 1, 0);
                    } else {
                        return new PoissonRouge(17, "Sandrine", false, 1, 1, 0);
                    }
                case "Requin":
                    if (sexe.nextBoolean()) {
                        return new Requin(17, "Quentin", true, 56, 1, 0);
                    } else {
                        return new Requin(17, "Amelie", false, 67, 1, 0);
                    }
            }
        }
        return null;
    }

}