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
        Voliere voliere1 = new Voliere(1, "Voliere 1", 50, 10, 0, 2, null, 10);
        Standard standard1 = new Standard(1, "Standard 1", 50, 10, 0, 2, null);

        Aigle aigle = new Aigle(1, "Albert", true, 6, 2, 8, false, false, false, 43);
        Aigle aigle1 = new Aigle(2, "Sophie", false, 4, 1, 6, false, false, false, 43);

        Baleine baleine = new Baleine(3,"Marcel", true, 150000, 30, 123, false, false, true, 420);
        Baleine baleine1 = new Baleine(4,"Mathilde", false, 120000, 25, 99, false, false, true, 420);

        Loup loup = new Loup(5,"Robert", true, 123, 2, 12, false, false, true, 62);
        Loup loup1 = new Loup(6,"Jade", false, 99, 1, 11, false, false, true, 62);

        Ours ours = new Ours(7,"Leo", true, 500, 2, 15, false, false, true, 200);
        Ours ours1 = new Ours(8,"Clemence", false, 400, 1, 12, false, false, true, 200);

        Pingouin pingouin = new Pingouin(9,"Lucas", true, 1, 1, 5, false, false, true, 67);
        Pingouin pingouin1 = new Pingouin(10,"Emy", false, 2, 1, 6, false, false, true, 67);

        PoissonRouge poissonRouge = new PoissonRouge(11,"Nemo", true, 1, 1, 6, false, false, true, 5);
        PoissonRouge poissonRouge1 = new PoissonRouge(12,"Dory", false, 1, 1, 5, false, false, true, 5);

        Requin requin = new Requin(13,"Bruce", true, 5000, 12, 50, false, false, true, 90);
        Requin requin1 = new Requin(14,"Martine", false, 4000, 10, 45, false, false, true, 90);

        Tigre tigre = new Tigre(15,"Paul", true, 150, 3, 5, false, false, true, 100);
        Tigre tigre1 = new Tigre(16,"Cerise", false, 120, 2, 6, false, false, true, 100);

         while (true) {
            Timer minuteur = new Timer();
            TimerTask tache = new TimerTask() {
                public void run() {
                    SimpleDateFormat formatDate = new SimpleDateFormat("HH:mm:ss");
                    var date = new Date();
                }
            };

            // PUSH ENCLOS
            listeEnclos = pushEnclos(listeEnclos, aquarium1);
            listeEnclos = pushEnclos(listeEnclos, voliere1);
            listeEnclos = pushEnclos(listeEnclos, standard1);
             System.out.println("liste enclos: ");
            for (int i=1; i<listeEnclos.length; i++) {
                listeEnclos[i].afficherCaracteristiques();
            }

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
             System.out.println("liste animaux: ");
             for (int i=1; i<listeAnimaux.length; i++) {
                 listeAnimaux[i].afficherCaracteristiques();
             }

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

    public ZOO() {
    }

    private static String menu1 = "1. Afficher le nombre d'animaux \n2. Afficher les animaux par enclos \n3. Prendre le contrôle de l'employé";

    private static Animal[] listeAnimaux = {};

    private static Enclos[] listeEnclos = {null};

    private String nom;

    private int enclosMax;

    private int actionsMax;

    public static void ListerNouvelAnimal(Animal newAnimal) {

    }

    private static Enclos[] pushEnclos(Enclos[] array, Enclos push) {
        Enclos[] longer = new Enclos[array.length + 1];
        for (int i = 0; i < array.length; i++)
            longer[i] = array[i];
        longer[array.length] = push;
        return longer;
    }

    private static Animal[] pushAnimaux(Animal[] array, Animal push) {
        Animal[] longer = new Animal[array.length + 1];
        for (int i = 0; i < array.length; i++)
            longer[i] = array[i];
        longer[array.length] = push;
        return longer;
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

    public void donnerMain(Employe employe) {
        // TODO implement here
    }

}