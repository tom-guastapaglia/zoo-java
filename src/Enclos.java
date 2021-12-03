
import java.util.*;

/**
 * 
 */
public class Enclos {

    protected int id;
    protected String nom;
    protected int superficie;
    protected int animauxMax;
    protected int animaux;
    protected int degreProprete;
    protected Animal animauxPresents[];

    /**
     * Default constructor
     */
    public Enclos() {}

    public String toString() {
        return "\nNom : " + this.nom +
                "\nSuperficie : " + this.superficie + " m²" +
                "\nAnimaux maximun : " + this.animauxMax +
                "\nAnimaux : " + this.animaux +
                "\nDegres de proprete : " + this.degreProprete + " %" +
                "\nAnimaux presents : " + Arrays.toString(this.animauxPresents) +
                "\n\n";
    }

    public void AfficherCaracteristiques() {
        // TODO implement here
        System.out.println(nom);
        System.out.println(superficie);
        System.out.println(animauxMax);
        System.out.println(animaux);
        System.out.println(degreProprete);
        System.out.println(animauxPresents);
    }

    /**
     * 
     */
    public void afficherCaracteristiquesAnimaux() {
        // TODO implement here
    }

    /**
     * 
     */
    public void ajouterAnimal() {
        // TODO implement here
    }

    /**
     * 
     */
    public void enleverAnimal() {
        // TODO implement here
    }

    /**
     * 
     */
    public void nourirAnimaux() {
        // TODO implement here
    }

    /**
     * 
     */
    public void etreEntretenu() {
        // TODO implement here
    }

}