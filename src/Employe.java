
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
     * Permet d'examiner l'enclos
     * @param enclos
     */
    public void ExaminerEnclos(Enclos enclos) {
        // TODO implement here
    }

    /**
     * Permet de nettoyer l'enclos
     * @param enclos
     */
    public void NettoyerEnclos(Enclos enclos) {
        // TODO implement here
    }

    /**
     * Permet de nourrir les animaux
     * @param enclos
     */
    public void NourrirAnimaux(Enclos enclos) {
        // TODO implement here
    }

    /**
     * Permet de transférer un animal
     * @param animal
     */
    public void TransfererAnimal(Animal animal) {
        // TODO implement here
    }

}