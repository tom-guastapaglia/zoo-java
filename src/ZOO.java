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

        // Creation male et femelle animal
        Baleine baleine = new Baleine("Marcel", true, 150000, 30, 123, false, false, true);
        Baleine baleine1 = new Baleine("Mathilde", false, 120000, 25, 99, false, false, true);

        Loup loup = new Loup("Robert", true, 123, 2, 12, false, false, true);
        Aigle aigle = new Aigle("Albert", true, 6, 2, 8, false, false, false);

        System.out.println(baleine);
        System.out.println(baleine1);
        System.out.println(loup);

        while (true) {
            Timer minuteur = new Timer();
            TimerTask tache = new TimerTask() {
                public void run() {
                    SimpleDateFormat formatDate = new SimpleDateFormat("HH:mm:ss");
                    var date = new Date();
                    System.out.println(formatDate.format(date));
                }
            };
            // minuteur.schedule(tache, 0, 1000);
            System.out.println("Bienvenue dans le ZOO");
            Scanner sc = new Scanner(System.in);
            DisplayMenu1();
            System.out.println("Choisissez une action");
            int action = sc.nextInt();
            switch (action) {
                case 1:
                    DisplayAnimaux();
                    System.out.println("Menu 1");
                    break;
                case 2:
                    DisplayAnimauxParEnclos();
                    System.out.println("Menu 2");
                case 3:
                    System.out.println("Bienvenue Monsieur l'employé, vous vouvez vous déplacer dans un enclos :");
                    while (true) {
                        DisplayEnclos();
                        Scanner enclosScanner = new Scanner(System.in);
                        int enclosScannerId = enclosScanner.nextInt();
                        if (FindEnclosById(enclosScannerId) != null) {
                            Enclos newEnclos = FindEnclosById(enclosScannerId);
                            EditEnclosByWorker(newEnclos);
                        } else {
                            System.out.println("Erreur dans le choix de l'enclos");
                            break;
                        }
                        break;
                    }

                    System.out.println("Menu 3");
                default:
                    System.out.println("Erreur de frappe");
                    break;
            }
        }
    }

    private static void EditEnclosByWorker(Enclos newEnclos) {
        System.out.println("Vous venez d'entrer dans l'enclos" + Enclos.getName());
        while (true) {
            String enclosMenu = "Choisissez une action:\n" +
                    "1. Nettoyer l'enclos.\n" +
                    "2. Examiner l'enclos.\n" +
                    "3. Nourir les animaux de l'enclos.\n" +
                    "4. Transférer un animal.\n";
            System.out.println(enclosMenu);
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
    private static Enclos[] listeEnclos;

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

    public static void DisplayEnclos() {
        for (Enclos enclos : listeEnclos) {
            System.out.printf("Enclos" + enclos.getName() + " numéro " + getId());
        }
    }

    /**
     * Afficher tous les animaux dans leurs enclos respectifs
     */
    public static void DisplayAnimauxParEnclos() {
        for (Enclos enclos : listeEnclos) {
            System.out.println(enclos);
            for (Animal animal : enclos.animauxPresents) {
                System.out.println("\t" + animal);
            }
        }
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
     * Trouver un enclos grâce à son id
     * 
     * @param idEnclos
     * @return
     */
    public static Enclos FindEnclosById(int idEnclos) {
        for (Enclos enclos : listeEnclos) {
            if (enclos.getId() == idEnclos) {
                return enclos;
            }
        }
        return null;
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