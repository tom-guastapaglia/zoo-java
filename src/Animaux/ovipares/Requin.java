package Animaux.ovipares;

/**
 * 
 */
public class Requin extends Ovipare {

    /**
     * Default constructor
     */
    public Requin(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante, int enceinte, int incubation) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante, enceinte, incubation);
    }

    @Override
    public void emmetreSon() {
        System.out.println("GruusGruusGruus");
    }
}