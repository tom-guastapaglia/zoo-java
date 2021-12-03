
import java.util.*;

/**
 * 
 */
public abstract class Animal {

    protected static String nom;
    protected static boolean sexe;
    protected static int poids;
    protected static float taille;
    protected static int age;
    protected static boolean faim;
    protected static boolean sommeil;
    protected static boolean sante;

    /**
     * Default constructor
     */
    public Animal() {

    }


    /**
     * 
     */
    public void manger() {
        // TODO implement here
        faim = false;
    }

    /**
     * 
     */
    public void emmetreSon() {
        // TODO implement here
    }

    /**
     * 
     */
    public void etreSoigne() {
        // TODO implement here
        sante = false;
    }

    /**
     * 
     */
    public void dormir() {
        // TODO implement here
        sommeil = false;
    }

}