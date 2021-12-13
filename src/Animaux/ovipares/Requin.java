package Animaux.ovipares;

/**
 * 
 */
public class Requin extends Ovipare {

    /**
     * Default constructor
     */
    public Requin(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("requin", id, nom, sexe, poids, taille, age,90);
    }

    @Override
    public void emmetreSon() {
        System.out.println("FloupFloupFloup");
    }
}