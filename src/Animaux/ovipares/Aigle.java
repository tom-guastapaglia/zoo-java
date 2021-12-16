package Animaux.ovipares;

/**
 * 
 */
public class Aigle extends Ovipare {

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
}

