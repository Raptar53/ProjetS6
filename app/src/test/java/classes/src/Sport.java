package classes.src;

/**
 * Created by Romain on 28/11/2017.
 */

public class Sport extends Utilisateur {

    private int niveau = 0;

    public Sport(int n) {
        niveau = n;
    }

    public void setNiveau(int n) {
        niveau = n;
    }

    public int getNiveau() {
        return niveau;
    }
}
