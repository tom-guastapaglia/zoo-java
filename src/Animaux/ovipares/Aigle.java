package Animaux.ovipares;

import Animaux.Volant;

public class Aigle extends Ovipare implements Volant {

    /**
     * Default constructor
     */
    public Aigle(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Aigle", id, nom, sexe, poids, taille, age,43);
    }

    @Override
    public void emettreSon() {
        System.out.println("AigreAigreAigre");
    }

    @Override
    public boolean voler() {
        return true;
    }
}

