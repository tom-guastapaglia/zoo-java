package Enclos;

import java.io.IOException;

public class Meute extends Enclos {
    public Meute(int id, String nom, int superficie, int animauxMax, int degreProprete) {
        super(id, nom, superficie, animauxMax, degreProprete);
    }

    @Override
    public void afficherCaracteristiques() {

    }

    @Override
    public void entretenir() throws IOException, InterruptedException {

    }
}
