package Enclos;

import Animaux.Animal;

import java.io.IOException;

public class Voliere extends Enclos {

    private int hauteur;

    public Voliere(int id, String nom, int superficie, int animauxMax, int degreProprete, int hauteur) {
        super(id, nom, superficie, animauxMax, degreProprete);
        this.hauteur = hauteur;
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println(nom + ": " + "superficie: " + superficie + ", animaux max: " + animauxMax + ", nbr animaux: " + nbrAnimaux + ", degre propreté: " + degreProprete + ", hauteur: " + hauteur);
    }

    @Override
    public void entretenir() throws IOException, InterruptedException {
        System.out.println("Sortie de tous les animaux présents dans la volière");
        System.out.println("Nettoyage de la volière en cours");
        String anim= "|/-\\";
        for (int x =0 ; x < 100 ; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x + " %";
            System.out.write(data.getBytes());
            Thread.sleep(100);
        }
        System.out.println("Entrée des animaux dans leur enclos tout propre");
        System.out.println(nom + " propre, hauteur: " + hauteur);
    }

}