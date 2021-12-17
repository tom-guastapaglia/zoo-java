package Animaux.mammifères;

import Animaux.Vagabond;

/**
 * Class Loup
 */
public class Loup extends Mammifere implements Vagabond {

    /**
     * Default constructor
     */
    public Loup(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Loup", id, nom, sexe, poids, taille, age, 62);
    }

    /**
     * Emet le son du loup
     */
    @Override
    public void emettreSon() {
        System.out.println("AhouAhouhou");
    }

    /**
     * Permet au loup de vagabonder
     * @return boolean
     */
    @Override
    public boolean vagabonder() {
        return true;
    }
}