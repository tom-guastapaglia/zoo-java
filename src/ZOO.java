import java.io.InputStream;
import java.util.*;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
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
         /*while (true) {
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
        }*/

        //Creation male et femelle animal
        /*
        Aigle aigle = new Aigle(1,"Albert", true, 6,2 ,8, false, false, false);
        Aigle aigle1 = new Aigle(2,"Sophie", false, 4,1 ,6, false, false, false);

        Baleine baleine = new Baleine(3,"Marcel", true, 150000, 30, 123, false, false, true);
        Baleine baleine1 = new Baleine(4,"Mathilde", false, 120000, 25, 99, false, false, true);

        Loup loup = new Loup(5,"Robert", true, 123, 2, 12, false, false, true);
        Loup loup1 = new Loup(6,"Jade", false, 99, 1, 11, false, false, true);

        Ours ours = new Ours(7,"Leo", true, 500, 2, 15, false, false, true);
        Ours ours1 = new Ours(8,"Clemence", false, 400, 1, 12, false, false, true);

        Pingouin pingouin = new Pingouin(9,"Lucas", true, 1, 1, 5, false, false, true);
        Pingouin pingouin1 = new Pingouin(10,"Emy", false, 2, 1, 6, false, false, true);

        PoissonRouge poissonRouge = new PoissonRouge(11,"Nemo", true, 1, 1, 6, false, false, true);
        PoissonRouge poissonRouge1 = new PoissonRouge(12,"Dory", false, 1, 1, 5, false, false, true);

        Requin requin = new Requin(13,"Bruce", true, 5000, 12, 50, false, false, true);
        Requin requin1 = new Requin(14,"Enzo", false, 4000, 10, 45, false, false, true);

        Tigre tigre = new Tigre(15,"Paul", true, 150, 3, 5, false, false, true);
        Tigre tigre1 = new Tigre(16,"Julia", false, 120, 2, 6, false, false, true);*/
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