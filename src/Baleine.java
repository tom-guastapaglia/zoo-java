/**
 * 
 */
public class Baleine extends Ovipare {

    /**
     * Default constructor
     */
    public Baleine(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante);
    }

    public void son() {
        emettreSon("humhumhumhum");
    }
}