package Animaux.ovipares;

/**
 * 
 */
public class Pingouin extends Ovipare {

    /**
     * Default constructor
     */
    public Pingouin(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante, int incubation) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante, incubation);
    }

    @Override
    public void emmetreSon() {
        System.out.println("CloupClougCloup");
    }
}