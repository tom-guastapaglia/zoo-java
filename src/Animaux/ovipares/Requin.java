package Animaux.ovipares;

import Animaux.Marin;

/**
 * Class Requin
 */
public class Requin extends Ovipare implements Marin {

    /**
     * Default constructor
     */
    public Requin(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Requin", id, nom, sexe, poids, taille, age,90);
    }

    /**
     * Emet le son du requin
     */
    @Override
    public void emettreSon() {
        System.out.println("FloupFloupFloup");
    }

    /**
     * Permet au requin de nager
     * @return boolean
     */
    @Override
    public boolean nager() {
        return true;
    }
}