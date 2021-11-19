import java.io.InputStream;
import java.util.*;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/**
 * 
 */
public class ZOO {

    public static void main(String[] args) {
        System.out.println("Bienvenue dans le ZOO, choisissez une action :");
        Scanner sc = new Scanner(System.in);
        int action = sc.nextInt();
        System.out.printf("Votre action est " + action);
    }

    /**
     * Default constructor
     */
    public ZOO() {
        // Creation de 3 Enclos
        new Aquarium();
        new Voliere();
        new Standard();
    }

    /**
     * 
     */
    private Animal[] listeAnimaux;

    /**
     * 
     */
    private Enclos[] listeEnclos;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private int enclosMax;

    /**
     * 
     */
    private int actionsMax;


    public static void DisplayMenu(){
        System.out.println("##### MENU #####");

    }

    /**
     * 
     */
    public void AfficherNombreAnimaux() {
        // TODO implement here
    }

    /**
     * 
     */
    public void AfficherLesAnimaux() {
        // TODO implement here
    }

    /**
     * @param Animal
     */
    public void modifierEtatAnimal(Animal animal) {
        // TODO implement here
    }

    /**
     * @param Enclos
     */
    public void modifierEtatEnclos(Enclos enclos) {
        // TODO implement here
    }

    /**
     *
     *
     */
    public void donnerMain(Employe employe) {
        // TODO implement here
    }

}