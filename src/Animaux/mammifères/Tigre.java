package Animaux.mammifères;

import Animaux.mammifères.Mammifere;

/**
 * 
 */
public class Tigre extends Mammifere {

    /**
     * Default constructor
     */
    public Tigre(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Tigre", id, nom, sexe, poids, taille, age,100);
    }

    @Override
    public void emettreSon() {
        System.out.println("GrouGrouGrou");
    }
}