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
        System.out.println(nom);
        System.out.println(superficie);
        System.out.println(animauxMax);
        System.out.println(nbrAnimaux);
        System.out.println(degreProprete);
        System.out.println(animauxPresents);
        System.out.println(hauteur);
    }

    @Override
    public void entretenir() {
        // TODO: Verif toit
    }

}