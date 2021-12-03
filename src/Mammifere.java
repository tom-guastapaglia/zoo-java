
import java.util.*;

/**
 * 
 */
public class Mammifere extends Animal {

    /**
     * Default constructor
     */
    public Mammifere(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante) {
        super(id, nom, sexe, poids, taille, age, faim, sommeil, sante);
    }

    /**
     * 
     */
    private int gestation;

    /**
     * @return
     */
    public Animal Accoucher() {
        // TODO implement here
        return null;
    }

}