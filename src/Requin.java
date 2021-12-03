
import java.util.*;

/**
 * 
 */
public class Requin extends Ovipare {

    /**
     * Default constructor
     */
    public Requin(String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante) {
        this.nom = nom;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.faim = faim;
        this.sommeil = sommeil;
        this.sante = sante;
    }

    public void son() {
        emettreSon("grifgrifgrif");
    }
}