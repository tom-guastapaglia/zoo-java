package Animaux.ovipares;

import Animaux.Marin;

/**
 * 
 */
public class Requin extends Ovipare implements Marin {

    /**
     * Default constructor
     */
    public Requin(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("requin", id, nom, sexe, poids, taille, age,90);
    }

    @Override
    public void emettreSon() {
        System.out.println("FloupFloupFloup");
    }

    @Override
    public boolean nager() {
        return true;
    }
}