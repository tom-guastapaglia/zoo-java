import Animaux.Animal;
import Animaux.Oeuf;
import Animaux.mammifères.*;
import Animaux.ovipares.*;
import Enclos.Aquarium;
import Enclos.Enclos;
import Enclos.Standard;
import Enclos.Voliere;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Class Zoo
 */
public class ZOO {

    private static Animal[] listeAnimaux = {};
    private static Enclos[] listeEnclos = {};
    private static Oeuf[] listeOeuf = {};
    private String nom;

    private static int enclosMax;

    /**
     * Defaut constructor
     * 
     * @param nom
     * @param enclosMax
     */
    public ZOO(String nom, int enclosMax) {
        this.nom = nom;
        ZOO.enclosMax = enclosMax;
        init();
    }

    /**
     * Point d'entrée de l'application
     * 
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        ZOO JavassicPark = new ZOO("JavassicPark", 10);
        Employe Lowery = new Employe("Lowery", true, 37);

        String menu1 = "Bienvenue dans le ZOO \n\n1. Afficher le nombre d'animaux \n2. Afficher les animaux par enclos \n3. Prendre le contrôle de l'employé";
        String menuEnclos = "0. Retour \n1. Nettoyer l'enclos \n2. Examiner l'enclos \n3. Nourrir les animaux de l'enclos \n4. Transférer un animal \n5. Soigner les animaux malades \n";

        /**
         * Modification de l'état des animaux et d'un enclos toutes les minutes
         */
        new Timer().scheduleAtFixedRate(new TimerTask() {
            /**
             *
             */
            @Override
            public void run() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                for (int i = 0; i < listeEnclos.length; i++) {
                    listeEnclos[i].modifierEtatAnimaux();
                }
                Random rand = new Random(); // instance of random class
                int int_random = rand.nextInt(listeEnclos.length);
                listeEnclos[int_random].modifierEtatEnclos();

                for (Oeuf oeuf : listeOeuf) {
                    if (oeuf != null) {
                        if (oeuf.getIncubation() == oeuf.getTempsCouvert()) {
                            System.out.println("L'oeuf de " + oeuf.getType() + " éclot !!!");
                            Animal bebe = oeuf.eclore();
                            listeAnimaux = pushAnimaux(listeAnimaux, bebe);
                            String type = bebe.getType();
                            for (Enclos enclos : listeEnclos) {
                                if (enclos.getNom() == "Voliere 1" && type == "Pingouin" || type == "Aigle") {
                                    enclos.ajouterAnimal(bebe);
                                } else if (enclos.getNom() == "Aquarium 1") {
                                    enclos.ajouterAnimal(bebe);
                                }
                            }
                            enleveOeuf(listeOeuf, oeuf);
                        } else {
                            oeuf.modifierOeufEclosion();
                        }
                    }
                }

                for (Animal animal : listeAnimaux) {
                    if (animal != null) {
                        String type = animal.getType();
                        if (type == "Baleine" || type == "Loup" || type == "Ours" || type == "Tigre") {
                            Mammifere cetAnimal = (Mammifere) animal;
                            if (cetAnimal.getGestation() == cetAnimal.getEnceinte()) {
                                System.out.println(cetAnimal.getNom() + " accouche !!!");
                                Animal bebe = cetAnimal.mettreBas();
                                listeAnimaux = pushAnimaux(listeAnimaux, bebe);
                                for (Enclos enclos : listeEnclos) {
                                    if (enclos.getNom() == "Aquarium 1" && type == "Baleine") {
                                        enclos.ajouterAnimal(bebe);
                                    } else if (enclos.getNom() == "Standard 1") {
                                        enclos.ajouterAnimal(bebe);
                                    }
                                }
                                cetAnimal.pasEnceinte();
                            }
                        } else if (type == "Aigle" || type == "Pingouin" || type == "Poisson rouge"
                                || type == "Requin") {
                            Ovipare cetAnimal = (Ovipare) animal;
                            if (cetAnimal.getIncubation() == cetAnimal.getEnceinte()) {
                                System.out.println(cetAnimal.getNom() + " pond un oeuf !!!");
                                listeOeuf = pushOeuf(listeOeuf, cetAnimal.pondre());
                                cetAnimal.pasEnceinte();
                            }
                        }
                        animal.modifierAnimauxEnceinte();
                    }
                }
                int animalPlace = 0;
                for (Enclos enclos : listeEnclos) {
                    if (enclos.getNbrAnimaux() > 8) {
                        animalPlace += 1;
                    }
                }
                if (animalPlace == 0 && listeAnimaux[int_random] != null && listeAnimaux[int_random].getAge() != 0) {
                    listeAnimaux[int_random].tomberEnceinte();
                }
                System.out.println("Appuyez sur entrer pour continuer");
            }
        }, 0, 40000);

        while (true) {
            Scanner sc = new Scanner(System.in);
            /*
             * Affichage du menu principal
             */
            DisplayMenu(menu1);
            System.out.println("Choisissez une action et appuyez sur entrer :");
            String action = sc.nextLine();
            switch (action) {
                /*
                 * Affichage du nombre d'animaux
                 */
                case "1":
                    DisplayAnimaux();
                    break;
                /*
                 * Affichage des animaux par enclos
                 */
                case "2":
                    DisplayAnimauxParEnclos();
                    break;
                /*
                 * Contrôle de l'employé
                 */
                case "3":
                    clearConsole();
                    System.out.println(
                            "Bienvenue Monsieur" + Lowery.getNom() + ", vous voulez vous déplacer dans un enclos :");
                    /**
                     * Début de l'employé
                     */
                    while (true) {
                        DisplayEnclos();
                        Scanner enclosScanner = new Scanner(System.in);
                        String enclosScannerId = enclosScanner.nextLine();
                        if (enclosScannerId == "")
                            break;
                        else {
                            int enclosIndex = getEnclosIndexWithId(Integer.parseInt(enclosScannerId));
                            if (enclosScannerId == "0")
                                break;
                            else if (enclosIndex != -1) {
                                while (true) {
                                    clearConsole();
                                    System.out
                                            .println("Vous êtes dans l'enclos : " + listeEnclos[enclosIndex].getNom()
                                                    + "\nChoisissez une action à effectuer sur cet enclos :");
                                    System.out.println(menuEnclos);
                                    Scanner actionEnclos = new Scanner(System.in);
                                    String actionEnclosId = actionEnclos.nextLine();
                                    if (actionEnclosId == "0")
                                        break;
                                    else {
                                        catchActionEnclos(actionEnclosId, enclosIndex, Lowery);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    }
                default:
                    break;
            }
        }
    }

    /**
     * Renvoie l'id d'un enclos
     * 
     * @param enclosScannerId
     * @return int
     */
    private static int getEnclosIndexWithId(int enclosScannerId) {
        for (int i = 0; i < listeEnclos.length; i++) {
            if (listeEnclos[i].getId() == enclosScannerId)
                return i;
        }
        return -1;
    }

    /**
     * Affiche le menu de l'enclos
     * 
     * @param actionEnclosId
     * @param enclosIndex
     * @param Lowery
     * @throws IOException
     * @throws InterruptedException
     */
    private static void catchActionEnclos(String actionEnclosId, int enclosIndex, Employe Lowery)
            throws IOException, InterruptedException {
        /*
         * Affichage du menu de l'employé
         */
        switch (actionEnclosId) {
            /*
             * Entretien de l'enclos
             */
            case "1":
                Lowery.NettoyerEnclos(listeEnclos[enclosIndex]);
                break;
            /*
             * Examiner l'enclos
             */
            case "2":
                Lowery.ExaminerEnclos(listeEnclos[enclosIndex]);
                break;
            /*
             * Nourrir les animaux de l'enclos
             */
            case "3":
                Lowery.NourrirAnimaux(listeEnclos[enclosIndex]);
                break;
            /*
             * Transférer un animal
             */
            case "4":
                Lowery.TransfererAnimal(listeEnclos[enclosIndex], listeEnclos);
                break;

            /**
             * Soigner des animaux
             */
            case "5":
                Lowery.SoignerAnimaux(listeEnclos[enclosIndex]);
                break;
            default:
                skip();
                break;
        }
        return;
    }

    /**
     * Initialisation du zoo avec animaux et enclos
     */
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
        aquarium1.ajouterAnimal(requin);
        aquarium1.ajouterAnimal(requin1);

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

    /**
     * Ajoute un enclos dans listeEnclos
     */
    public static Enclos[] pushEnclos(Enclos[] array, Enclos push) {
        Enclos[] longer = new Enclos[array.length + 1];
        if (listeEnclos.length < enclosMax) {
            if (array.length == 0) {
                longer[0] = push;
            } else {
                for (int i = 0; i < array.length; i++) {
                    longer[i] = array[i];
                }
                longer[array.length] = push;
            }
        }
        return longer;
    }

    /**
     * Ajoute un enclos dans listeAnimaux
     */
    public static Animal[] pushAnimaux(Animal[] array, Animal push) {
        Animal[] longer = new Animal[array.length + 1];
        for (int i = 0; i < array.length; i++)
            longer[i] = array[i];
        longer[array.length] = push;
        return longer;
    }

    /**
     * Ajoute un oeuf dans listeOeuf
     */
    public static Oeuf[] pushOeuf(Oeuf[] array, Oeuf push) {
        Oeuf[] longer = new Oeuf[array.length + 1];
        for (int i = 0; i < array.length; i++)
            longer[i] = array[i];
        longer[array.length] = push;
        return longer;
    }

    /**
     * supprime un oeuf (qui vient d'eclore) dans listeOeuf
     */
    public static Oeuf[] enleveOeuf(Oeuf[] array, Oeuf enleve) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == enleve) {
                array[i] = null;
            }
        }
        return array;
    }

    /**
     * Affiche les enclos du zoo
     */
    public static void DisplayEnclos() {
        clearConsole();
        System.out.println("Merci de choisir un enclos :");
        System.out.println("0. Retour");
        for (int i = 0; i < listeEnclos.length; i++) {
            System.out.printf(listeEnclos[i].getId() + ". Enclos : " + listeEnclos[i].getNom() + "\n");
        }
    }

    /**
     * Affiche tous les animaux
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
            System.out.println("Animaux dans l'enclos " + listeEnclos[i].getNom() + " : ");
            for (int j = 0; j < listeAnimauxPresents.length; j++) {
                System.out.printf("\t - ");
                listeAnimauxPresents[j].afficherCaracteristiques();
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

    /**
     * Effacer la console pour l'utilisateur + affichage de l'heure
     */
    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println(s.format(date));
    }

    /**
     * Attend l'action de l'utilisateur
     */
    public static void waitingAction() {
        System.out.println("Appuyez sur entrer pour continuer");
        Scanner sc = new Scanner(System.in);
        String action = sc.nextLine();
    }

    /**
     *
     */
    public static void skip() {
        clearConsole();
        System.out.println("Erreur de frappe, appuyez sur entrer pour recommencer");
        waitingAction();
    }

    /**
     *
     */
    public static void skipDeplacementError() {
        clearConsole();
        System.out.println("L'animal est déjà dans cet enclos ! Erreur");
        waitingAction();
    }
}