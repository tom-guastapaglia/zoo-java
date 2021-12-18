
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Animaux.Animal;
import Enclos.Enclos;

/**
 * Class Employé
 */
public class Employe {

    private String nom;
    private boolean sexe;
    private int age;

    /**
     * Defaut constructor
     * 
     * @param nom
     * @param sexe
     * @param age
     */
    public Employe(String nom, boolean sexe, int age) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
    }

    /**
     * Récupérer le nom de l'employé
     * 
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Permet d'examiner l'enclos
     * 
     * @param enclos
     * @throws InterruptedException
     * @throws IOException
     */
    public void NettoyerEnclos(Enclos enclos) throws IOException, InterruptedException {
        ZOO.clearConsole();
        enclos.entretenir();
        System.out.println("\nAppuyez sur entrer pour continuer\n");
        Scanner sc = new Scanner(System.in);
        String action = sc.nextLine();
    }

    /**
     * Permet de nettoyer l'enclos
     * 
     * @param enclos
     */
    public void ExaminerEnclos(Enclos enclos) {
        ZOO.clearConsole();
        System.out.println("Enclos " + enclos.getNom());
        System.out.println(
                "0. Retour \n1. Afficher les détails de l'enclos \n2. Lister les animaux présents dans l'enclos");
        Scanner viewEnclos = new Scanner(System.in);
        int viewEnclosId = viewEnclos.nextInt();
        if (viewEnclosId == 0)
            return;
        else if (viewEnclosId == 1) {
            ZOO.clearConsole();
            System.out.println(
                    "Les détails de l'enclos " + enclos.getNom() + " : ");
            enclos.afficherCaracteristiques();
            System.out.println("\nAppuyez sur entrer pour continuer\n");
            Scanner sc1 = new Scanner(System.in);
            String action1 = sc1.nextLine();
        } else if (viewEnclosId == 2) {
            ZOO.clearConsole();
            System.out.println(
                    "Les animaux de l'enclos " + enclos.getNom() + " : ");
            displayAnimauxInEnclos(enclos);
            System.out.println("\nAppuyez sur entrer pour continuer\n");
            Scanner sc2 = new Scanner(System.in);
            String action2 = sc2.nextLine();
        }
    }

    /**
     * Permet de nourrir les animaux
     * 
     * @param enclos
     */
    public void NourrirAnimaux(Enclos enclos) {
        ZOO.clearConsole();
        enclos.nourrirAnimaux();
        System.out.println("\nAppuyez sur entrer pour continuer\n");
        Scanner sc3 = new Scanner(System.in);
        String action3 = sc3.nextLine();
    }

    /**
     * Permet de transférer un animal
     * @param enclos
     * @param listeEnclos
     */
    public void TransfererAnimal(Enclos enclos, Enclos[] listeEnclos) {
        Animal[] listeAnimauxPresents = enclos.getAnimauxPresents();
        ZOO.clearConsole();
        System.out.println("Choisissez un animal de l'enclos " + enclos.getNom() + " : ");
        System.out.println("0. Retour");
        Map<Integer, Animal> mapAnimauxPresents = new HashMap<Integer, Animal>();
        for (int j = 0; j < listeAnimauxPresents.length; j++) {
            System.out.println(j + 1 + ". " + listeAnimauxPresents[j].getNom());
            mapAnimauxPresents.put(j + 1, listeAnimauxPresents[j]);
        }
        System.out.println("\nAppuyez sur entrer pour continuer\n");
        Scanner sc4 = new Scanner(System.in);
        int action4 = sc4.nextInt();
        if (action4 == 0)
            return;
        else {
            Animal animalADeplacer = null;
            for (var entry : mapAnimauxPresents.entrySet()) {
                if (entry.getKey() == action4)
                    animalADeplacer = entry.getValue();
            }
            if (animalADeplacer == null)
                ZOO.skip();
            else {
                ZOO.clearConsole();
                System.out.println("Vous déplacer l'animal " + animalADeplacer.getNom() + ", de l'enclos "
                        + enclos.getNom()
                        + ". Dans quel enclos ? (⚠️ ATTENTION ⚠️ Vous avez la responsabilité de déplacer un animal dans un mauvais enclos)");
                System.out.println("0. Retour");
                Map<Integer, Enclos> enclosPourDeplacement = new HashMap<Integer, Enclos>();
                for (int i = 0; i < listeEnclos.length; i++) {
                    System.out.printf(i + 1 + ". " + listeEnclos[i].getNom() + "\n");
                    enclosPourDeplacement.put(i + 1, listeEnclos[i]);
                }
                Scanner newEnclos = new Scanner(System.in);
                int newEnclosIndex = newEnclos.nextInt();
                if (newEnclosIndex == 0)
                    return;
                else if (enclos == enclosPourDeplacement.get(newEnclosIndex)) {
                    ZOO.skipDeplacementError();
                } else {
                    enclosPourDeplacement.get(newEnclosIndex).ajouterAnimal(animalADeplacer);
                    enclos.enleverAnimal(animalADeplacer);
                    ZOO.clearConsole();
                    System.out.println("L'animal " + animalADeplacer.getNom() + " sort de l'enclos "
                            + enclos.getNom());
                    System.out
                            .println("L'animal " + animalADeplacer.getNom() + " fait son entrée dans l'enclos "
                                    + enclosPourDeplacement.get(newEnclosIndex).getNom());
                    System.out.println("L'enclos " + enclosPourDeplacement.get(newEnclosIndex).getNom()
                            + " contient maintenant les animaux : ");
                    displayAnimauxInEnclos(enclosPourDeplacement.get(newEnclosIndex));
                    System.out.println("\nAppuyez sur entrer pour continuer\n");
                    Scanner deplacementAnimal = new Scanner(System.in);
                    String deplacementAnimalStr = deplacementAnimal.nextLine();
                }
            }
        }
    }

    /**
     * Soigner les animaux d'un enclos
     * 
     * @param enclos
     */
    public void SoignerAnimaux(Enclos enclos) {
        ZOO.clearConsole();
        enclos.soignerAnimaux();
        System.out.println("\nAppuyez sur entrer pour continuer\n");
        Scanner soinAnimal = new Scanner(System.in);
        String soinAnimalStr = soinAnimal.nextLine();
    }

    /**
     * Affiche les animaux de l'enclos
     * 
     * @param enclos
     */
    private static void displayAnimauxInEnclos(Enclos enclos) {
        Animal[] animauxPresents = enclos.getAnimauxPresents();
        for (Animal animal : animauxPresents) {
            System.out.printf("- ");
            animal.afficherCaracteristiques();
        }
    }

}