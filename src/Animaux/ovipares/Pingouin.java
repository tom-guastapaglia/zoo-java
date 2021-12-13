package Animaux.ovipares;

/**
 * 
 */
public class Pingouin extends Ovipare {

    /**
     * Default constructor
     */
    public Pingouin(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Pingouin", id, nom, sexe, poids, taille, age,67);
    }

    @Override
    public void emmetreSon() {
        System.out.println("CloupClougCloup");
    }
}