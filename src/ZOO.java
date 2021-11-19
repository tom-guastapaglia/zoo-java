import java.util.*;
import java.util.Scanner;

/**
 * 
 */
public class ZOO {


    /**
     *
     */
    public static void main(String[] args) {
        //Creation du zoo
        new ZOO();

        //Creation de l'employe
        new Employe();


        //Creation male et femelle animal
        Scanner baleine = new Scanner(System.in);
        System.out.println("Veuillez creer une baleine et suivre les indications.");
        System.out.println("Le nom : ");
        String nom = baleine.next();
        System.out.println("Le sexe (true/false) : ");
        boolean sexe = baleine.nextBoolean();
        System.out.println("Le poids : ");
        int poids = baleine.nextInt();
        System.out.println("La taille : ");
        float taille = baleine.nextFloat();
        System.out.println("L'age : ");
        int age = baleine.nextInt();
        Baleine Maria = new Baleine(nom, sexe, poids, taille, age, Animal.faim = false, Animal.sommeil = false, Animal.sante = true);

        System.out.println(Maria);



    }

    /**
     * Default constructor
     */
    public ZOO() {
        //Creation de 3 Enclos
        new Aquarium();
        new Voliere();
        new Standard();
    }

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