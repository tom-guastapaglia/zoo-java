package Animaux;
import java.time.LocalTime;

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
        System.out.println(nom + ": " + "type: " + type + ", sexe: " + sexe + ", poids: " + poids + ", taille: " + taille + ", age: " + age + ", enceinte: " + enceinte + ", faim: " + faim + ". sommeil: " + sommeil + ", sante: " + sante);
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
    public boolean dormir() {
        LocalTime actual = LocalTime.now();
        LocalTime hourMin = LocalTime.of(15, 00);
        LocalTime hourMax = LocalTime.of(7, 00);

        if (actual.isAfter(hourMin) || actual.isBefore(hourMax)) {
            sommeil = true;
        } else {
            sommeil = false;
        }
        return sommeil;
    }

    /**
     * Rénitialise la santé de l'animal
     */
    public void soigner() {
        if (!this.sante) {
            this.sante = true;
            System.out.println(nom + " vient de se faire soigner");
        } else {
            System.out.println(nom + " n'est pas malade");
        }
    }

    public void modifierEtat() {
        this.faim = true;
        this.sommeil = true;
        this.sante = false;
    }

    public abstract void emettreSon();

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }

    public boolean isSexe() {
        return sexe;
    }

    public int getEnceinte() {
        return enceinte;
    }

    public void modifierAnimauxEnceinte() {
        if (enceinte != 0) {
            enceinte += 1;
            System.out.println(nom + " est enceinte de : " + enceinte + " jour(s)");
        }
    }

    public void tomberEnceinte() {
        if(!sexe && enceinte == 0 && !faim && !sommeil && sante) {
            enceinte = 1;
            System.out.println(nom + " est enceinte !");
        }
    }

    public int pasEnceinte() {
        return enceinte = 0;
    }
}