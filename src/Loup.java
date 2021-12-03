/**
 * 
 */
public class Loup extends Mammifere {

    /**
     * Default constructor
     */
    public Loup(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante) {
        this.id = id;
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
        emettreSon("Hahouhouhou");
    }
}