package Animaux.mammifères;

import Animaux.Vagabond;

public class Tigre extends Mammifere implements Vagabond {

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

    @Override
    public boolean vagabonder() {
        return true;
    }
}