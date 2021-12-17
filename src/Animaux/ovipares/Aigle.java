package Animaux.ovipares;

import Animaux.Volant;

/**
 * Class Aigle
 */
public class Aigle extends Ovipare implements Volant {

    /**
     * Default constructor
     */
    public Aigle(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Aigle", id, nom, sexe, poids, taille, age,43);
    }

    /**
     * Emet le son de l'aigle
     */
    @Override
    public void emettreSon() {
        System.out.println("AigreAigreAigre");
    }

    /**
     * Permet au loup de voler
     * @return boolean
     */
    @Override
    public boolean voler() {
        return true;
    }
}

