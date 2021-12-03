
import java.util.*;

/**
 * 
 */
public class Tigre extends Mammifere {

    /**
     * Default constructor
     */
    public Tigre(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante);
    }

    public void son() {
        emettreSon("greugreugreu");
    }
}