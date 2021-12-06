package Enclos;

import Animaux.Animal;

public abstract class Enclos {

    protected int id;
    protected String nom;
    protected int superficie;
    protected int animauxMax;
    protected int nbrAnimaux;
    protected int degreProprete;
    protected Animal[] animauxPresents;

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

    public Animal[] getAnimauxPresents() {
        return animauxPresents;
    }

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

    public String getName() {
        return nom;
    }

    public int getId() {
        return id;
    }

}