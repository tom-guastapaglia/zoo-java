import java.text.SimpleDateFormat;
import java.util.Date;import java.util.*;


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
        Baleine baleine = new Baleine("Marcel", true, 150000, 30, 123, false, false, true);
        Baleine baleine1 = new Baleine("Mathilde", false, 120000, 25, 99, false, false, true);

        Loup loup = new Loup("Robert", true, 123, 2, 12, false, false, true);
        Aigle aigle = new Aigle("Albert", true, 6,2 ,8, false, false, false);

        System.out.println(baleine);
        System.out.println(baleine1);
        System.out.println(loup);

        loup.son();
        aigle.son();

        SimpleDateFormat formatDate = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        System.out.println(formatDate.format(date));
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