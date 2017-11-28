package projets6.com1spot;

/**
 * Created by Romain on 28/11/2017.
 */

public class Sport extend Utilsateur {

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
