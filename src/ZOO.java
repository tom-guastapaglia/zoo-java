import Animaux.*;
import Animaux.mammifères.*;
import Animaux.ovipares.*;
import Enclos.*;

import java.io.IOException;
import java.util.*;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.naming.directory.InitialDirContext;
import javax.sound.sampled.SourceDataLine;

import java.text.SimpleDateFormat;
import java.time.zone.ZoneRulesException;

public class ZOO {

    public static void main(String[] args) throws IOException, InterruptedException {

        new ZOO();

        while (true) {
            Timer minuteur = new Timer();
            TimerTask tache = new TimerTask() {
                public void run() {
                    SimpleDateFormat formatDate = new SimpleDateFormat("HH:mm:ss");
                    var date = new Date();
                }
            };

            minuteur.schedule(tache, 0, 1000);
            Scanner sc = new Scanner(System.in);
            DisplayMenu(menu1);
            System.out.println("Choisissez une action et appuyez sur entrer :");
            int action = sc.nextInt();
            switch (action) {
                case 1:
                    DisplayAnimaux();
                    break;
                case 2:
                    DisplayAnimauxParEnclos();
                    break;
                case 3:
                    clearConsole();
                    System.out.println("Bienvenue Monsieur l'employé, vous vouvez vous déplacer dans un enclos :");
                    while (true) {
                        DisplayEnclos();
                        Scanner enclosScanner = new Scanner(System.in);
                        int enclosScannerId = enclosScanner.nextInt();
                        Enclos enclosFocus = null;
                        System.out.println(listeEnclos.length);
                        int enclosIndex = getEnclosIndexWithId(enclosScannerId);
                        for (Enclos enclos : listeEnclos) {
                            if (enclos.getId() == enclosScannerId) {
                                enclosFocus = enclos;
                            }
                        }
                        if (enclosFocus != null) {
                            System.out.println("Vous êtes dans l'enclos :");
                            DisplayMenu(menuEnclos);
                            Scanner actionEnclos = new Scanner(System.in);
                            int actionEnclosId = actionEnclos.nextInt();
                            catchActionEnclos(actionEnclosId, enclosIndex);
                        }
                        // To do : vérifier si l'id existe et si oui éditer l'enclos correspondant
                    }
                default:
                    skip();
                    break;
            }
        }
    }

    private static int getEnclosIndexWithId(int enclosScannerId) {
        for (int i = 0; i < listeEnclos.length; i++) {
            if (listeEnclos[i].getId() == enclosScannerId)
                return i;
            else
                return (Integer) null;
        }
        return (Integer) null;
    }

    private static void catchActionEnclos(int actionEnclosId, int enclosIndex)
            throws IOException, InterruptedException {
        switch (actionEnclosId) {
            case 1:
                listeEnclos[enclosIndex].entretenir();
            case 2:
            case 3:
            case 4:
            default:
                skip();
                break;
        }
    }

    private static void init() {
        Aquarium aquarium1 = new Aquarium(1, "Aquarium 1", 50, 10, 0, 2, 10);
        Voliere voliere1 = new Voliere(2, "Voliere 1", 50, 10, 0, 2);
        Standard standard1 = new Standard(3, "Standard 1", 50, 10, 0);

        Aigle aigle = new Aigle(1, "Albert", true, 6, 2, 8);
        Aigle aigle1 = new Aigle(2, "Sophie", false, 4, 1, 6);

        Baleine baleine = new Baleine(3, "Marcel", true, 150000, 30, 123);
        Baleine baleine1 = new Baleine(4, "Mathilde", false, 120000, 25, 99);

        Loup loup = new Loup(5, "Robert", true, 123, 2, 12);
        Loup loup1 = new Loup(6, "Jade", false, 99, 1, 11);

        Ours ours = new Ours(7, "Leo", true, 500, 2, 15);
        Ours ours1 = new Ours(8, "Clemence", false, 400, 1, 12);

        Pingouin pingouin = new Pingouin(9, "Lucas", true, 1, 1, 5);
        Pingouin pingouin1 = new Pingouin(10, "Emy", false, 2, 1, 6);

        PoissonRouge poissonRouge = new PoissonRouge(11, "Nemo", true, 1, 1, 6);
        PoissonRouge poissonRouge1 = new PoissonRouge(12, "Dory", false, 1, 1, 5);

        Requin requin = new Requin(13, "Bruce", true, 5000, 12, 50);
        Requin requin1 = new Requin(14, "Martine", false, 4000, 10, 45);

        Tigre tigre = new Tigre(15, "Paul", true, 150, 3, 5);
        Tigre tigre1 = new Tigre(16, "Cerise", false, 120, 2, 6);

        // Ajouter un animal dans un enclos
        // aquarium
        aquarium1.ajouterAnimal(poissonRouge1);
        aquarium1.ajouterAnimal(poissonRouge);
        aquarium1.ajouterAnimal(baleine);
        aquarium1.ajouterAnimal(baleine1);

        // voliere
        voliere1.ajouterAnimal(aigle1);
        voliere1.ajouterAnimal(aigle);
        voliere1.ajouterAnimal(pingouin1);
        voliere1.ajouterAnimal(pingouin);

        // standard
        standard1.ajouterAnimal(tigre);
        standard1.ajouterAnimal(tigre1);
        standard1.ajouterAnimal(loup);
        standard1.ajouterAnimal(loup1);
        standard1.ajouterAnimal(ours);
        standard1.ajouterAnimal(ours1);

        // PUSH ENCLOS
        listeEnclos = pushEnclos(listeEnclos, aquarium1);
        listeEnclos = pushEnclos(listeEnclos, voliere1);
        listeEnclos = pushEnclos(listeEnclos, standard1);

        // PUSH ANIMAUX
        listeAnimaux = pushAnimaux(listeAnimaux, aigle);
        listeAnimaux = pushAnimaux(listeAnimaux, aigle1);
        listeAnimaux = pushAnimaux(listeAnimaux, baleine);
        listeAnimaux = pushAnimaux(listeAnimaux, baleine1);
        listeAnimaux = pushAnimaux(listeAnimaux, loup);
        listeAnimaux = pushAnimaux(listeAnimaux, loup1);
        listeAnimaux = pushAnimaux(listeAnimaux, ours);
        listeAnimaux = pushAnimaux(listeAnimaux, ours1);
        listeAnimaux = pushAnimaux(listeAnimaux, pingouin);
        listeAnimaux = pushAnimaux(listeAnimaux, pingouin1);
        listeAnimaux = pushAnimaux(listeAnimaux, poissonRouge);
        listeAnimaux = pushAnimaux(listeAnimaux, poissonRouge1);
        listeAnimaux = pushAnimaux(listeAnimaux, requin);
        listeAnimaux = pushAnimaux(listeAnimaux, requin1);
        listeAnimaux = pushAnimaux(listeAnimaux, tigre);
        listeAnimaux = pushAnimaux(listeAnimaux, tigre1);
    }

    public ZOO() {
        init();
    }

    private static String menu1 = "Bienvenue dans le ZOO \n\n1. Afficher le nombre d'animaux \n2. Afficher les animaux par enclos \n3. Prendre le contrôle de l'employé";

    private static String menuEnclos = "1. Nettoyer l'enclos \n2. Examiner l'enclos \n3. Nourrir les animaux de l'enclos \n4. Transférer un animal \n";

    private static Animal[] listeAnimaux = {};

    private static Enclos[] listeEnclos = {};

    private String nom;

    private int enclosMax;

    private int actionsMax;

    public static void ListerNouvelAnimal(Animal newAnimal) {

    }

    public static Enclos[] pushEnclos(Enclos[] array, Enclos push) {
        Enclos[] longer = new Enclos[array.length + 1];
        if (array.length == 0) {
            longer[0] = push;
        } else {
            for (int i = 0; i < array.length; i++) {
                longer[i] = array[i];
            }
            longer[array.length] = push;
        }
        return longer;
    }

    public static Animal[] pushAnimaux(Animal[] array, Animal push) {
        Animal[] longer = new Animal[array.length + 1];
        for (int i = 0; i < array.length; i++)
            longer[i] = array[i];
        longer[array.length] = push;
        return longer;
    }

    public static void DisplayEnclos() {

        for (int i = 0; i < listeEnclos.length; i++) {
            System.out.printf(listeEnclos[i].getId() + ". Enclos : " + listeEnclos[i].getName() + "\n");
        }

    }

    /**
     * Afficher tous les animaux
     */
    public static void DisplayAnimaux() {
        clearConsole();
        System.out.println("Il y a actuellement " + listeAnimaux.length + " animaux dans le ZOO !\n");
        waitingAction();
    }

    /**
     * Afficher tous les animaux dans leurs enclos respectifs
     */
    public static void DisplayAnimauxParEnclos() {
        clearConsole();
        for (int i = 0; i < listeEnclos.length; i++) {
            Animal[] listeAnimauxPresents = listeEnclos[i].getAnimauxPresents();
            System.out.println("Animaux dans l'enclos " + listeEnclos[i].getName() + " : ");
            for (int j = 0; j < listeAnimauxPresents.length; j++) {
                System.out.println("\t - " + listeAnimauxPresents[j].getName());
            }
        }
        waitingAction();
    }

    /**
     * Afficher un menu pour l'utilisateur de manière jolie
     */
    public static void DisplayMenu(String menu) {
        clearConsole();
        System.out.println(menu);
    }

    public void AfficherNombreAnimaux() {
        // TODO implement here
    }

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
     * Effacer la console pour l'utilisateur
     */
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void waitingAction() {
        System.out.println("Appuyez sur entrer pour continuer");
        Scanner sc = new Scanner(System.in);
        String action = sc.nextLine();
    }

    public static void skip() {
        clearConsole();
        System.out.println("Erreur de frappe, appuyez sur entrer pour recommencer");
        waitingAction();
    }

}