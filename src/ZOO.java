import Animaux.*;
import Animaux.mammifères.*;
import Animaux.ovipares.*;
import Enclos.*;

import java.io.IOException;
import java.util.*;

import javax.naming.directory.InitialDirContext;
import javax.sound.sampled.SourceDataLine;
import javax.swing.CellEditor;

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
                        if (enclosScannerId == 0)
                            break;
                        int enclosIndex = getEnclosIndexWithId(enclosScannerId);
                        if (enclosIndex != -1) {
                            while (true) {
                                clearConsole();
                                System.out
                                        .println("Vous êtes dans l'enclos : " + listeEnclos[enclosIndex].getName()
                                                + "\nChoisissez une action à effectuer sur cet enclos :");
                                System.out.println(menuEnclos);
                                Scanner actionEnclos = new Scanner(System.in);
                                int actionEnclosId = actionEnclos.nextInt();
                                if (actionEnclosId == 0)
                                    break;
                                else
                                    catchActionEnclos(actionEnclosId, enclosIndex);
                            }
                        }
                    }
                default:
                    break;
            }
        }
    }

    private static int getEnclosIndexWithId(int enclosScannerId) {
        for (int i = 0; i < listeEnclos.length; i++) {
            if (listeEnclos[i].getId() == enclosScannerId)
                return i;
        }
        return -1;
    }

    private static void catchActionEnclos(int actionEnclosId, int enclosIndex)
            throws IOException, InterruptedException {
        switch (actionEnclosId) {
            case 1:
                clearConsole();
                listeEnclos[enclosIndex].entretenir();
                System.out.println("\nAppuyez sur entrer pour continuer\n");
                Scanner sc = new Scanner(System.in);
                String action = sc.nextLine();
                break;
            case 2:
                clearConsole();
                System.out.println("Enclos " + listeEnclos[enclosIndex].getName());
                System.out.println(
                        "0. Retour \n1. Afficher les détails de l'enclos \n2. Lister les animaux présents dans l'encos");
                Scanner viewEnclos = new Scanner(System.in);
                int viewEnclosId = viewEnclos.nextInt();
                if (viewEnclosId == 0)
                    break;
                else if (viewEnclosId == 1) {
                    clearConsole();
                    System.out.println(
                            "Les détails de l'enclos " + listeEnclos[enclosIndex].getName() + " : ");
                    listeEnclos[enclosIndex].afficherCaracteristiques();
                    System.out.println("\nAppuyez sur entrer pour continuer\n");
                    Scanner sc1 = new Scanner(System.in);
                    String action1 = sc1.nextLine();
                } else if (viewEnclosId == 2) {
                    clearConsole();
                    System.out.println(
                            "Les animaux de l'enclos " + listeEnclos[enclosIndex].getName() + " : ");
                    displayAnimauxInEnclos(listeEnclos[enclosIndex]);
                    System.out.println("\nAppuyez sur entrer pour continuer\n");
                    Scanner sc2 = new Scanner(System.in);
                    String action2 = sc2.nextLine();
                }
                break;
            case 3:
                clearConsole();
                listeEnclos[enclosIndex].nourirAnimaux();
                System.out.println("\nAppuyez sur entrer pour continuer\n");
                Scanner sc3 = new Scanner(System.in);
                String action3 = sc3.nextLine();
                break;
            case 4:
                Animal[] listeAnimauxPresents = listeEnclos[enclosIndex].getAnimauxPresents();
                clearConsole();
                System.out.println("Choisissez un animal de l'enclos " + listeEnclos[enclosIndex].getName() + " : ");
                System.out.println("0. Retour");
                Map<Integer, Animal> mapAnimauxPresents = new HashMap<Integer, Animal>();
                for (int j = 0; j < listeAnimauxPresents.length; j++) {
                    System.out.println(j + 1 + ". " + listeAnimauxPresents[j].getName());
                    mapAnimauxPresents.put(j + 1, listeAnimauxPresents[j]);
                }
                System.out.println("\nAppuyez sur entrer pour continuer\n");
                Scanner sc4 = new Scanner(System.in);
                int action4 = sc4.nextInt();
                if (action4 == 0)
                    break;
                else {
                    Animal animalADeplacer = null;
                    for (var entry : mapAnimauxPresents.entrySet()) {
                        if (entry.getKey() == action4)
                            animalADeplacer = entry.getValue();
                    }
                    if (animalADeplacer == null)
                        skip();
                    else {
                        clearConsole();
                        System.out.println("Vous déplacer l'animal " + animalADeplacer.getName() + ", de l'enclos "
                                + listeEnclos[enclosIndex].getName()
                                + ". Dans quel enclos ? (⚠️ ATTENTION ⚠️ Vous avez la responsabilité de déplacer un animal dans un mauvais enclos)");
                        System.out.println("0. Retour");
                        Map<Integer, Enclos> enclosPourDeplacement = new HashMap<Integer, Enclos>();
                        for (int i = 0; i < listeEnclos.length; i++) {
                            System.out.printf(i + 1 + ". " + listeEnclos[i].getName() + "\n");
                            enclosPourDeplacement.put(i + 1, listeEnclos[i]);
                        }
                        Scanner newEnclos = new Scanner(System.in);
                        int newEnclosIndex = newEnclos.nextInt();
                        if (newEnclosIndex == 0)
                            break;
                        else if (listeEnclos[enclosIndex] == enclosPourDeplacement.get(newEnclosIndex)) {
                            skipDeplacementError();
                        } else {
                            listeEnclos[enclosIndex].enleverAnimal(animalADeplacer);
                            System.out.println("L'animal " + animalADeplacer.getName() + " sort de l'enclos "
                                    + listeEnclos[enclosIndex].getName());
                            enclosPourDeplacement.get(enclosIndex).ajouterAnimal(animalADeplacer);
                            System.out
                                    .println("L'animal" + animalADeplacer.getName() + " fait son entrée dans l'enclos "
                                            + enclosPourDeplacement.get(enclosIndex).getName());
                            System.out.println("L'enclos " + enclosPourDeplacement.get(enclosIndex).getName()
                                    + " contient maintenant les animaux : ");
                            displayAnimauxInEnclos(enclosPourDeplacement.get(enclosIndex));
                            System.out.println("\nAppuyez sur entrer pour continuer\n");
                            Scanner deplacementAnimal = new Scanner(System.in);
                            String deplacementAnimalStr = deplacementAnimal.nextLine();
                        }
                    }
                }
                break;
            default:
                break;
        }

    }

    private static void displayAnimauxInEnclos(Enclos enclos) {
        Animal[] animauxPresents = enclos.getAnimauxPresents();
        for (Animal animal : animauxPresents) {
            System.out.println("- " + animal.getName());
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

    private static String menuEnclos = "0. Retour \n1. Nettoyer l'enclos \n2. Examiner l'enclos \n3. Nourrir les animaux de l'enclos \n4. Transférer un animal \n";

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
        clearConsole();
        System.out.println("Merci de choisir un enclos :");
        System.out.println("0. Retour");
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

    public static void skipDeplacementError() {
        clearConsole();
        System.out.println("L'animal est déjà dans cet enclos ! Erreur");
        waitingAction();
    }
}