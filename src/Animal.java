/**
 * 
 */
public abstract class Animal {

    protected String nom;
    protected boolean sexe;
    protected int poids;
    protected float taille;
    protected int age;
    protected boolean faim;
    protected boolean sommeil;
    protected boolean sante;

    /**
     * Default constructor
     */
    public Animal() {}

    public String toString() {
        return "\nNom : " + this.nom +
                "\nSexe : " + this.sexe +
                "\nPoids : " + this.poids + " kg" +
                "\nTaille : " + this.taille + " metre" +
                "\nAge : " + this.age + " an(s)" +
                "\nFaim : " + this.faim +
                "\nSommeil : " + this.sommeil +
                "\nSante : " + this.sante +
                "\n\n";
    }


    /**
     * 
     */
    public void manger() {

    }

    public void emettreSon(String son) {
        System.out.println(son);
    }

    /**
     * 
     */
    public void etreSoigne() {
        // TODO implement here
    }

    /**
     * 
     */
    public void dormir() {
        // TODO implement here
    }


}