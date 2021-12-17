package Animaux.ovipares;

import Animaux.Marin;
import Animaux.Volant;

/**
 * Class Pingouin
 */
public class Pingouin extends Ovipare implements Marin, Volant {

    /**
     * Default constructor
     */
    public Pingouin(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Pingouin", id, nom, sexe, poids, taille, age,67);
    }

    /**
     * Emet le son du pingouin
     */
    @Override
    public void emettreSon() {
        System.out.println("CloupCloupCloup");
    }

    /**
     * Permet au pingouin de nager
     * @return boolean
     */
    @Override
    public boolean nager() {
        return true;
    }

    /**
     * Permet au pingouin de voler
     * @return boolean
     */
    @Override
    public boolean voler() {
        return true;
    }
}