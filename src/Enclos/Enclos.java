package Enclos;

import Animaux.Animal;
import Animaux.ovipares.PoissonRouge;

import java.io.IOException;

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

    public void afficherCaracteristiquesAnimaux() {
        System.out.println(animauxPresents.length);
        for(int i=0; i<animauxPresents.length; i++) {
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

    public void enleverAnimal() {
        // TODO implement here
    }

    public void nourirAnimaux() {
        for(int i=0; i<animauxPresents.length-1; i++) {
            animauxPresents[i].manger();
        }
    }

    public abstract void entretenir() throws IOException, InterruptedException;

    public String getName() {
        return nom;
    }

    public int getId() {
        return id;
    }

}