
import java.util.*;

/**
 * 
 */
public class Ours extends Mammifere {

    /**
     * Default constructor
     */
    public Ours(String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante) {
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
        emettreSon("Grugrugragra");
    }
}