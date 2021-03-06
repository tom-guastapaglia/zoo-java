package Animaux;

import java.time.LocalTime;

/**
 * Class Animal
 */
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

    /**
     * Defaut Constructor
     * @param type
     * @param id
     * @param nom
     * @param sexe
     * @param poids
     * @param taille
     * @param age
     * @param enceinte
     * @param faim
     * @param sommeil
     * @param sante
     */
    public Animal(String type, int id, String nom, boolean sexe, int poids, float taille, int age, int enceinte,
            boolean faim, boolean sommeil, boolean sante) {
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

    /**
     * Affiche les caractéristiques de l'animal
     */
    public void afficherCaracteristiques() {
        System.out.println(nom + " est un " + type + ", son sexe: " + toStringSexe() + ", poids: " + poids
                + "Kg, taille: " + taille
                + "m, age: " + age + ". De plus, " + nom + " " + toStringEnceinte() + ", " + toStringFaim() + " et "
                + toStringSommeil() + ". Sa santé est "
                + toStringSante());
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
        LocalTime hourMin = LocalTime.of(15, 0);
        LocalTime hourMax = LocalTime.of(7, 0);

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

    /**
     * Modifie l'état de l'animal
     */
    public void modifierEtat() {
        this.faim = true;
        this.sommeil = true;
        this.sante = false;
    }

    /**
     * Méthode abstraite pour emettre un son
     */
    public abstract void emettreSon();

    /**
     * Renvoie l'âge de l'animal
     * @return int
     */
    public int getAge() {
        return age;
    }

    /**
     * Renvoie le type de l'animal
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * Renvoie le nom de l'animal
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Renvoie le sexe de l'animal
     * @return Sexe
     */
    public boolean isSexe() {
        return sexe;
    }

    /**
     * Vérifie si l'animal est enceinte ou pas
     * @return int
     */
    public int getEnceinte() {
        return enceinte;
    }

    /**
     * Ajoute un jour de plus à la période enceinte
     */
    public void modifierAnimauxEnceinte() {
        if (enceinte != 0) {
            enceinte += 1;
            System.out.println(nom + " est enceinte de : " + enceinte + " jour(s)");
        }
    }

    /**
     * Permet à un animal de tomber enceinte
     */
    public void tomberEnceinte() {
        if(!sexe && enceinte == 0 && !faim && !sommeil && sante) {
            enceinte = 1;
            System.out.println(nom + " est enceinte !");
        }
    }

    /**
     * L'animal n'est plus enceinte
     * @return int
     */
    public int pasEnceinte() {
        return enceinte = 0;
    }

    /**
     * Renvoie le sexe de l'animal
     * @return String
     */
    public String toStringSexe() {
        if (sexe == true)
            return "mâle";
        else
            return "femelle";
    }

    /**
     * Renvoie l'état enceinte ou non de l'animal
     * @return String
     */
    public String toStringEnceinte() {
        if (enceinte == 0)
            return "n'est pas enceinte";
        else
            return "est enceinte";
    }

    /**
     * Renvoie si l'animal a faim ou pas
     * @return String
     */
    public String toStringFaim() {
        if (faim == true)
            return "a faim";
        else
            return "n'a pas faim";
    }

    /**
     * Renvoie si l'animal a envie de dormir ou pas
     * @return String
     */
    public String toStringSommeil() {
        if (sommeil == true)
            return "est en train de dormir";
        else
            return "ne dort pas et est en pleine forme";
    }

    /**
     * Renvoie si l'animal est en bonne santé ou pas
     * @return String
     */
    public String toStringSante() {
        if (sante == true)
            return "bonne";
        else
            return "mauvaise, il faut soigner cet animal.";
    }
}