package Animaux.ovipares;

import Animaux.Marin;
import Animaux.Volant;

public class Pingouin extends Ovipare implements Marin, Volant {

    /**
     * Default constructor
     */
    public Pingouin(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Pingouin", id, nom, sexe, poids, taille, age,67);
    }

    @Override
    public void emettreSon() {
        System.out.println("CloupCloupCloup");
    }

    @Override
    public boolean nager() {
        return true;
    }

    @Override
    public boolean voler() {
        return true;
    }
}