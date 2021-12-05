package Enclos;

import Animaux.Animal;

public class Voliere extends Enclos {

    private int hauteur;

    public Voliere(int id, String nom, int superficie, int animauxMax, int nbrAnimaux, int degreProprete, Animal[] animauxPresents, int hauteur) {
        super(id, nom, superficie, animauxMax, nbrAnimaux, degreProprete, animauxPresents);
        this.hauteur = hauteur;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println(nom + ": " + "superficie: " + superficie + ", animaux max: " + animauxMax + ", nbr animaux: " + nbrAnimaux + ", degre propreté: " + degreProprete + ", animaux présents: " + animauxPresents + ", hauteur: " + hauteur);

    }

    @Override
    public void entretenir() {
        // TODO: Verif toit
    }

}