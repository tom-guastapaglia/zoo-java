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
        System.out.println(nom);
        System.out.println(superficie);
        System.out.println(animauxMax);
        System.out.println(nbrAnimaux);
        System.out.println(degreProprete);
        System.out.println(animauxPresents);
        System.out.println(profondeur);
        System.out.println(salinite);
    }

    @Override
    public void entretenir() {
        // TODO: Verif salinité et profondeur
    }

}