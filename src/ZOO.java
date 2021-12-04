import Animaux.*;
import Animaux.mammifères.Baleine;
import Animaux.mammifères.Loup;
import Animaux.mammifères.Ours;
import Animaux.mammifères.Tigre;
import Animaux.ovipares.Aigle;
import Animaux.ovipares.Pingouin;
import Animaux.ovipares.PoissonRouge;
import Animaux.ovipares.Requin;
import Enclos.Enclos;
import Enclos.Aquarium;
import Enclos.Standard;
import Enclos.Voliere;

import java.util.*;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.text.SimpleDateFormat;

/**
 *
 */
public class ZOO {

    public static void main(String[] args) {
        Aquarium aquarium1 = new Aquarium(1, "Aquarium 1", 50, 10, 0, 2, null, 10, 10);
        listeEnclos[0] = aquarium1;
        Voliere voliere1 = new Voliere(1, "Aquarium 1", 50, 10, 0, 2, null, 10);
        // listeEnclos[1] = voliere1;
        Standard standard1 = new Standard(1, "Aquarium 1", 50, 10, 0, 2, null);
        // listeEnclos[2] = standard1;

        Aigle aigle = new Aigle(1, "Albert", true, 6, 2, 8, false, false, false, 43);
        Aigle aigle1 = new Aigle(2, "Sophie", false, 4, 1, 6, false, false, false, 43);

        Baleine baleine = new Baleine(3, "Marcel", true, 150000, 30, 123, false, false, true, 420);
        Baleine baleine1 = new Baleine(4, "Mathilde", false, 120000, 25, 99, false, false, true, 420);

        Loup loup = new Loup(5, "Robert", true, 123, 2, 12, false, false, true, 62);
        Loup loup1 = new Loup(6, "Jade", false, 99, 1, 11, false, false, true, 62);

        Ours ours = new Ours(7, "Leo", true, 500, 2, 15, false, false, true, 200);
        Ours ours1 = new Ours(8, "Clemence", false, 400, 1, 12, false, false, true, 200);

        Pingouin pingouin = new Pingouin(9, "Lucas", true, 1, 1, 5, false, false, true, 67);
        Pingouin pingouin1 = new Pingouin(10, "Emy", false, 2, 1, 6, false, false, true, 67);

        PoissonRouge poissonRouge = new PoissonRouge(11, "Nemo", true, 1, 1, 6, false, false, true, 5);
        PoissonRouge poissonRouge1 = new PoissonRouge(12, "Dory", false, 1, 1, 5, false, false, true, 5);

        Requin requin = new Requin(13, "Bruce", true, 5000, 12, 50, false, false, true, 90);
        Requin requin1 = new Requin(14, "Enzo", false, 4000, 10, 45, false, false, true, 90);

        Tigre tigre = new Tigre(15, "Paul", true, 150, 3, 5, false, false, true, 100);
        Tigre tigre1 = new Tigre(16, "Julia", false, 120, 2, 6, false, false, true, 100);

        while (true) {
            System.out.println(aigle);
            aquarium1.afficherCaracteristiques();
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
                    "3. Nourir les animaux de l'enclos.\n"+ 
                    "4. Transférer un animal.\n";
            System.out.println(enclosMenu);
        }
    }

    /**
     * Default constructor
     */
    public ZOO() {
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
            System.out.printf("Enclos" + enclos.getName() + " numéro " + enclos.getId());
        }
    }

    /**
     * Afficher tous les animaux dans leurs enclos respectifs
     */
    public static void DisplayAnimauxParEnclos() {
        for (Enclos enclos : listeEnclos) {
            System.out.println(enclos);
            for (Animal animal : enclos.getAnimauxPresents()) {
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

    public void modifierEtatAnimal(Animal animal) {
        // TODO implement here
    }

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