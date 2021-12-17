package Animaux.mammifères;

import Animaux.Vagabond;

/**
 * Class Tigre
 */
public class Tigre extends Mammifere implements Vagabond {

    /**
     * Default constructor
     */
    public Tigre(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Tigre", id, nom, sexe, poids, taille, age,100);
    }

    /**
     * Emet le son du tigre
     */
    @Override
    public void emettreSon() {
        System.out.println("GrouGrouGrou");
    }

    /**
     * Permet au tigre de vagabonder
     * @return boolean
     */
    @Override
    public boolean vagabonder() {
        return true;
    }
}