package Enclos;

import Animaux.Animal;

/**
 * 
 */
public class Aquarium extends Enclos {

    private int profondeur;
    private int salinite;

    public Aquarium(int id, String nom, int superficie, int animauxMax, int nbrAnimaux, int degreProprete, Animal[] animauxPresents, int profondeur, int salinite) {
        super(id, nom, superficie, animauxMax, nbrAnimaux, degreProprete, animauxPresents);
        this.profondeur = profondeur;
        this.salinite = salinite;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println(nom + ": " + "superficie: " + superficie + ", animaux max: " + animauxMax + ", nbr animaux: " + nbrAnimaux + ", degre propreté: " + degreProprete + ", animaux présents: " + animauxPresents + ", profondeur: " + profondeur + ", salinité: " + salinite);
    }

    @Override
    public void entretenir() {
        // TODO: Verif salinité et profondeur
    }

}