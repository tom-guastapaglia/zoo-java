package Animaux.mammifères;

import Animaux.Animal;

import java.util.Random;

/**
 * Class Mammifère
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

    /**
     * Renvoie la durée de gestation
     * @return int
     */
    public int getGestation() {
        return gestation;
    }

    /**
     * Permet à l'animal de mettre bas
     * @return Animal
     */
    public Animal mettreBas() {
        if (!sexe && this.gestation == enceinte) {
            Random sexe = new Random();
            switch (this.type){
                case "Baleine":
                    if (sexe.nextBoolean()) {
                        return new Baleine(17, "Enzo", true, 700, 2, 0);
                    } else {
                        return new Baleine(17, "Sophie", false, 800, 2, 0);
                    }
                case "Loup":
                    if (sexe.nextBoolean()) {
                        return new Loup(17, "Marcel", true, 10, 1, 0);
                    } else {
                        return new Loup(17, "Ina", false, 11, 1, 0);
                    }
                case "Ours":
                    if (sexe.nextBoolean()) {
                        return new Ours(17, "Georges", true, 24, 1, 0);
                    } else {
                        return new Ours(17, "Marie", false, 22, 1, 0);
                    }
                case "Tigre":
                    if (sexe.nextBoolean()) {
                        return new Tigre(17, "Simba", true, 23, 1, 0);
                    } else {
                        return new Tigre(17, "Emilie", false, 25, 1, 0);
                    }
            }
        }
        return null;
    }
}