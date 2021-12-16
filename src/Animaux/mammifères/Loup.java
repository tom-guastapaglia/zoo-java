package Animaux.mammifères;

import Animaux.Vagabond;
import Animaux.mammifères.Mammifere;

/**
 * 
 */
public class Loup extends Mammifere implements Vagabond {

    public enum catégorieAge {
        jeune,
        adulte,
        vieux
    };
    private int force;
    // TODO: facteur de domination à définir
    public enum rang {
        élevé,
        moyen,
        bas
    };
    private int niveau; // de 1 à 3
    private boolean impetuosite;
    private String meute;

    /**
     * Default constructor
     */
    public Loup(int id, String nom, boolean sexe, int poids, float taille, int age, catégorieAge categorieAge, int force, rang rang, int niveau, boolean impetuosite, String meute) {
        super("Loup", id, nom, sexe, poids, taille, age, 62);
        catégorieAge catégorieAge = categorieAge;
        this.force = force;
        rang Rang = rang;
        this.niveau = niveau;
        this.impetuosite = impetuosite;
        this.meute = meute;
    }

    @Override
    public void emettreSon() {
        System.out.println("AhouAhouhou");
    }

    public void entendreSon() {
        if (sommeil == false && sante == true) {
            System.out.println("Son entendu");
        }
    }

    public void separerMeute() {
        // TODO: implements here
    }

    public void vieillir() {
        // TODO: implements here
    }

    @Override
    public boolean vagabonder() {
        return true;
    }
}