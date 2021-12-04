package Enclos;

import java.util.jar.Attributes.Name;

import Animaux.Animal;

public abstract class Enclos {

    protected static int id;
    protected static String nom;
    protected int superficie;
    protected int animauxMax;
    protected int nbrAnimaux;
    protected int degreProprete;
    protected static Animal[] animauxPresents;

    public Enclos(int id, String nom, int superficie, int animauxMax, int nbrAnimaux, int degreProprete,
            Animal[] animauxPresents) {
        this.id = id;
        this.nom = nom;
        this.superficie = superficie;
        this.animauxMax = animauxMax;
        this.nbrAnimaux = nbrAnimaux;
        this.degreProprete = degreProprete;
        this.animauxPresents = animauxPresents;

    }

    public abstract void afficherCaracteristiques();

    public void afficherCaracteristiquesAnimaux() {
        // TODO implement here
    }

    public void ajouterAnimal() {
        // TODO implement here
    }

    public void enleverAnimal() {
        // TODO implement here
    }

    public void nourirAnimaux() {
        // TODO implement here
    }

    public abstract void entretenir();

    public static Animal[] getAnimauxPresents() {
        return animauxPresents;
    }

    public static String getName() {
        return nom;
    }

    public static int getId() {
        return id;
    }

}