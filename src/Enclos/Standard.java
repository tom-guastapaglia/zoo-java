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
        System.out.println(nom);
        System.out.println(superficie);
        System.out.println(animauxMax);
        System.out.println(nbrAnimaux);
        System.out.println(degreProprete);
        System.out.println(animauxPresents);
    }

    @Override
    public void entretenir() {
        // TODO: Entretien classique
    }

}