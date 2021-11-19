
import java.util.*;

/**
 * 
 */
public class Baleine extends Ovipare {

    List infos = Collection.synchronizedList(new ArrayList());
    String nomBaleine;
    boolean sexeBaleine;
    int poidsBaleine;
    float tailleBaleine;
    int ageBaleine;
    boolean faimBaleine;
    boolean sommeilBaleine;
    boolean santeBaleine;

    /**
     * Default constructor
     */
    public Baleine(String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante) {
        this.nomBaleine = nom;
        this.sexeBaleine = sexe;
        this.poidsBaleine = poids;
        this.tailleBaleine = taille;
        this.ageBaleine = age;
        this.faimBaleine = faim;
        this.sommeilBaleine = sommeil;
        this.santeBaleine = sante;
    }

    public String toString() {
        return "Nom : " + this.nomBaleine +
                " Sexe : " + this.sexeBaleine +
                " Poids : " + this.poidsBaleine +
                " Taille : " + this.tailleBaleine +
                " Age : " + this.ageBaleine;
    }

}