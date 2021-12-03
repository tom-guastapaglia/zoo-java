/**
 *
 */
public abstract class Animal {

    protected int id;
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
    public Animal(int id, String nom, boolean sexe, int poids, float taille, int age, boolean faim, boolean sommeil, boolean sante) {
        this.id = id;
        this.nom = nom;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.faim = faim;
        this.sommeil = sommeil;
        this.sante = sante;
    }

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
     * Affiche le son emmit par l'animal
     * @param son
     */
    public void emettreSon(String son) {
        System.out.println(son);
    }

    /**
     * Rénitialise la faim (l'animal n'aura plus faim)
     */
    public void manger() {
        if (this.faim) {
            this.faim = false;
        }
    }

    /**
     * Rénitialise le sommeil de l'animal (il se reveille)
     */
    public void dormir() {
        if(this.sommeil) {
            this.sommeil = false;
        }
    }

    /**
     * Rénitialise la santé de l'animal
     */
    public void soigner() {
        if (!this.sante) {
            this.sante = true;
        }
    }

    /**
     * Affiche si l'animal a faim ou non
     */
    public void aFaim() {
        System.out.println(this.faim);
    }

    /**
     * Affiche si l'animal a sommeil ou non
     */
    public void aSommeil() {
        System.out.println(this.sommeil);
    }

    /**
     * Affiche si l'animal est blessé ou non
     */
    public void estBlesse() {
        System.out.println(this.sante);
    }

}