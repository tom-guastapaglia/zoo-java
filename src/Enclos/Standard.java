package Enclos;

import Animaux.Animal;
import Enclos.Enclos;

/**
 * 
 */
public class Standard extends Enclos {

    public Standard(int id, String nom, int superficie, int animauxMax, int nbrAnimaux, int degreProprete, Animal[] animauxPresents) {
        super(id, nom, superficie, animauxMax, nbrAnimaux, degreProprete, animauxPresents);
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println(nom + ": " + "superficie: " + superficie + ", animaux max: " + animauxMax + ", nbr animaux: " + nbrAnimaux + ", degre propreté: " + degreProprete + ", animaux présents: " + animauxPresents);
    }

    @Override
    public void entretenir() {
        // TODO: Entretien classique
    }

}