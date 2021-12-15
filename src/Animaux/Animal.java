package Animaux;

import java.util.jar.Attributes.Name;

public abstract class Animal {

    protected String type;
    protected int id;
    protected String nom;
    protected boolean sexe;
    protected int poids;
    protected float taille;
    protected int age;
    protected int enceinte;
    protected boolean faim;
    protected boolean sommeil;
    protected boolean sante;


    public Animal(String type, int id, String nom, boolean sexe, int poids, float taille, int age, int enceinte, boolean faim, boolean sommeil, boolean sante) {
        this.type = type;
        this.id = id;
        this.nom = nom;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.enceinte = enceinte;
        this.faim = faim;
        this.sommeil = sommeil;
        this.sante = sante;
    }

    public void afficherCaracteristiques() {
        System.out.println(nom + ": " + "type: " + type + "sexe: " + sexe + ", poids: " + poids + ", taille: " + taille + ", age: " + age + ", enceinte: " + enceinte + ", faim: " + faim + ". sommeil: " + sommeil + ", sante: " + sante);
    }

    /**
     * Rénitialise la faim (l'animal n'aura plus faim)
     */
    public void manger() {
        if (this.faim) {
            this.faim = false;
            System.out.println(nom + " a mangé");
        } else {
            System.out.println(nom + " n'a pas faim");
        }
    }

    /**
     * Rénitialise le sommeil de l'animal (il se reveille)
     */
    public void dormir() {
        if (this.sommeil) {
            this.sommeil = false;
        } else {
            System.out.println("L'animal ne dort pas");
        }
    }

    /**
     * Rénitialise la santé de l'animal
     */
    public void soigner() {
        if (!this.sante) {
            this.sante = true;
        } else {
            System.out.println("L'animal n'est pas malade");
        }
    }

    /**
     * Affiche si l'animal a faim ou non
     */
    public void aFaim() {
        System.out.println(this.faim);
    }

    /**
     * Affiche si l'animal a sommeil ou non
     */
    public void aSommeil() {
        System.out.println(this.sommeil);
    }

    /**
     * Affiche si l'animal est blessé ou non
     */
    public void estBlesse() {
        System.out.println(this.sante);
    }

    public abstract void emmetreSon();

    public String getName() {
        return nom;
    }

    public void modifierEtat() {
        this.faim = true;
        this.sommeil = true;
        this.sante = false;
    }
}