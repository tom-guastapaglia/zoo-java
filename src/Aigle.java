
import java.util.*;

/**
 * 
 */
public class Aigle extends Ovipare {

    /**
     * Default constructor
     */
    public Aigle(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante);
    }

    public void son() {
        emettreSon("Criiaaahhcriiaaahh");
    }

}

