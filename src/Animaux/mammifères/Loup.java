package Animaux.mammifères;

import Animaux.Vagabond;
import Animaux.mammifères.Mammifere;

/**
 * 
 */
public class Loup extends Mammifere implements Vagabond {

    /**
     * Default constructor
     */
    public Loup(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Loup", id, nom, sexe, poids, taille, age, 62);
    }

    @Override
    public void emettreSon() {
        System.out.println("AhouAhouhou");
    }

    @Override
    public boolean vagabonder() {
        return true;
    }
}