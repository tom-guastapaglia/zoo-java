import java.io.InputStream;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.text.SimpleDateFormat;
/**
 * 
 */
public class ZOO {

    public static void main(String[] args) {
        while (true) {
            Timer minuteur = new Timer();
            TimerTask tache = new TimerTask() {
                public void run() {
                    SimpleDateFormat formatDate = new SimpleDateFormat("HH:mm:ss");
                    var date = new Date();
                    System.out.println(formatDate.format(date));
                }
            };
            minuteur.schedule(tache, 0, 1000);
            System.out.println("Bienvenue dans le ZOO");
            Scanner sc = new Scanner(System.in);
            DisplayMenu1();
            System.out.println("Choisissez une action");
            int action = sc.nextInt();
            switch (action) {
                case 1:
                    DisplayAnimaux();
                    break;
                default:
                    System.out.println("Erreur de frappe");
                    break;
            }
        }
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

    private static String menu1 = "1. Afficher le nombre d'animaux \n2. Afficher les animaux par enclos \n3. Prendre le contrôle de l'employé";

    /**
     * 
     */
    private static Animal[] listeAnimaux;

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

    public static void ListerNouvelAnimal(Animal newAnimal) {

    }

    /**
     * Afficher tous les animaux
     */
    public static void DisplayAnimaux() {
        for (Animal animal : listeAnimaux) {
            System.out.println(animal);
        }
    }

    /**
     * Afficher le premier menu pour l'utilisateur
     */
    public static void DisplayMenu1() {
        System.out.println(menu1);
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