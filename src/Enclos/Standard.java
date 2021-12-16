package Enclos;

import Animaux.Animal;
import Enclos.Enclos;

import java.io.IOException;

import javax.swing.CellEditor;

/**
 * 
 */
public class Standard extends Enclos {

    public Standard(int id, String nom, int superficie, int animauxMax, int degreProprete) {
        super(id, nom, superficie, animauxMax, degreProprete);
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println(nom + ": " + "superficie: " + superficie + ", animaux max: " + animauxMax + ", nbr animaux: "
                + nbrAnimaux + ", degre propreté: " + degreProprete);
    }

    @Override
    public void entretenir() throws IOException, InterruptedException {
        System.out.println("Sortie de tous les animaux présents dans l'enclos");
        System.out.println("Nettoyage de l'enclos en cours");
        String anim = "|/-\\";
        for (int x = 0; x < 100; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x + " %";
            System.out.write(data.getBytes());
            Thread.sleep(100);
        }
        degreProprete = 1;
        clearConsole();
        System.out.println("\nEntrée des animaux dans leur enclos tout propre");

        System.out.println(nom + " propre");
    }

}