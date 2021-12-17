package Animaux.mammifères;

/**
 * Class Ours
 */
public class Ours extends Mammifere {

    /**
     * Default constructor
     */
    public Ours(int id, String nom, boolean sexe, int poids, float taille, int age) {
        super("Ours", id, nom, sexe, poids, taille, age, 200);
    }

    /**
     * Emet le son de l'Ours
     */
    @Override
    public void emettreSon() {
        System.out.println("GrisGrisGris");
    }

}