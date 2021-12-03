
import java.util.*;

/**
 * 
 */
public class Ours extends Mammifere {

    /**
     * Default constructor
     */
    public Ours(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante);
    }

    public void son() {
        emettreSon("Grugrugragra");
    }
}