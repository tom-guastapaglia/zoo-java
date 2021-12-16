package Enclos;

import Animaux.Animal;
import Animaux.ovipares.PoissonRouge;

import java.io.IOException;
import java.util.Random;

public abstract class Enclos {

    protected int id;
    protected String nom;
    protected int superficie;
    protected int animauxMax;
    protected int nbrAnimaux;
    protected int degreProprete;
    protected Animal[] animauxPresents = {};

    public Enclos(int id, String nom, int superficie, int animauxMax, int degreProprete) {
        this.id = id;
        this.nom = nom;
        this.superficie = superficie;
        this.animauxMax = animauxMax;
        this.degreProprete = degreProprete;
    }

    public abstract void afficherCaracteristiques();

    public Animal[] getAnimauxPresents() {
        return animauxPresents;
    }

    public void modifierEtatAnimaux() {
        Random rand = new Random(); //instance of random class
        int int_random = rand.nextInt(animauxPresents.length);
        animauxPresents[int_random].modifierEtat();
        System.out.println(animauxPresents[int_random].getName() + " a faim, a sommeil et n'est pas en bonne santé");
    }

    public void modifierEtatEnclos() {
        this.degreProprete = 0;
        System.out.println("L'enclos " + nom + " est sale");
    }

    public void afficherCaracteristiquesAnimaux() {
        System.out.println(animauxPresents.length);
        for (int i = 0; i < animauxPresents.length; i++) {
            animauxPresents[i].afficherCaracteristiques();
        }
    }

    public void ajouterAnimal(Animal push) {
        Animal[] longer = new Animal[animauxPresents.length + 1];
        for (int i = 0; i < animauxPresents.length; i++)
            longer[i] = animauxPresents[i];
        longer[animauxPresents.length] = push;
        animauxPresents = longer;
    }

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

    public void nourirAnimaux() {
        for (int i = 0; i < animauxPresents.length - 1; i++) {
            animauxPresents[i].manger();
        }
    }

    public abstract void entretenir() throws IOException, InterruptedException;

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    /**
     * Effacer la console pour l'utilisateur
     */
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}