package Enclos;

import Animaux.Animal;

import java.io.IOException;
import java.util.Random;

/**
 * Class Enclos
 */
public abstract class Enclos {

    protected int id;
    protected String nom;
    protected int superficie;
    protected int animauxMax;
    protected int nbrAnimaux;
    protected int degreProprete;
    protected Animal[] animauxPresents = {};

    /**
     * Defaut constructor
     * @param id
     * @param nom
     * @param superficie
     * @param animauxMax
     * @param degreProprete
     */
    public Enclos(int id, String nom, int superficie, int animauxMax, int degreProprete) {
        this.id = id;
        this.nom = nom;
        this.superficie = superficie;
        this.animauxMax = animauxMax;
        this.degreProprete = degreProprete;
    }

    /**
     * Renvoie l'id de l'enclos
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Renvoie le nom de l'enclos
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Renvoie le nombre d'animaux présent dans l'enclos
     * @return int
     */
    public int getNbrAnimaux() {
        return nbrAnimaux;
    }

    /**
     * Méthode abstraite pour afficher les caractéristiques de l'enclos
     */
    public abstract void afficherCaracteristiques();

    /**
     * Renvoie les animaux présents dans l'enclos
     * @return Animal[]
     */
    public Animal[] getAnimauxPresents() {
        return animauxPresents;
    }

    /**
     * Modifie l'état des animaux
     */
    public void modifierEtatAnimaux() {
        Random rand = new Random(); //instance of random class
        int int_random = rand.nextInt(animauxPresents.length);
        animauxPresents[int_random].modifierEtat();
        System.out.println(animauxPresents[int_random].getNom() + " a faim, a sommeil et n'est pas en bonne santé");
    }

    /**
     * Modifie l'état de l'enclos
     */
    public void modifierEtatEnclos() {
        this.degreProprete = 0;
        System.out.println("L'enclos " + nom + " est sale\n");
    }

    /**
     * Affiche les caractéristiques des animaux présents dans l'enclos
     */
    public void afficherCaracteristiquesAnimaux() {
        System.out.println(animauxPresents.length);
        for (int i = 0; i < animauxPresents.length; i++) {
            animauxPresents[i].afficherCaracteristiques();
        }
    }

    /**
     * Ajoute un animal dans l'enclos
     */
    public void ajouterAnimal(Animal push) {
        Animal[] longer = new Animal[animauxPresents.length + 1];
        if (animauxPresents.length < animauxMax) {
            for (int i = 0; i < animauxPresents.length; i++)
                longer[i] = animauxPresents[i];
            longer[animauxPresents.length] = push;
            animauxPresents = longer;
        }
    }

    /**
     * Enleve un animal dans l'enclos
     * @param animal
     */
    public void enleverAnimal(Animal animal) {
        Animal[] shorter = new Animal[animauxPresents.length - 1];
        for (int i = 0, k = 0; i < animauxPresents.length; i++) {
            if (animauxPresents[i] == animal) {
                continue;
            }
            shorter[k++] = animauxPresents[i];
        }
        animauxPresents = shorter;
    }

    /**
     * Permet de nourrir les animaux
     */
    public void nourrirAnimaux () {
        for (int i = 0; i < animauxPresents.length - 1; i++) {
            if (!animauxPresents[i].dormir()) {
                animauxPresents[i].manger();
            } else {
                System.out.println(animauxPresents[i].getNom() + " dort, revenez plus tard");
            }
        }
    }

    /**
     * Permet de soigner les animaux
     */
    public void soignerAnimaux() {
        for (int i = 0; i < animauxPresents.length - 1; i++) {
            if (!animauxPresents[i].dormir()) {
                animauxPresents[i].soigner();
            } else {
                System.out.println(animauxPresents[i].getNom() + " dort, revenez plus tard");
            }
        }
    }

    /**
     * Class abstraite permettant d'entretenir l'enclos
     * @throws IOException
     * @throws InterruptedException
     */
    public abstract void entretenir() throws IOException, InterruptedException;

    /**
     * Effacer la console pour l'utilisateur
     */
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}