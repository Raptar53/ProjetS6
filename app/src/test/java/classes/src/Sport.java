package classes.src;

/**
 * Created by Romain on 28/11/2017.
 */

public class Sport extends Activite {

    private int niveau = 0;

    public Sport(String lieu, String type_activite, int date, int horaire, int duree, Activite_info activite_info) {
        super(lieu, type_activite, date, horaire, activite_info);
        this.niveau = niveau;
    }

    public int getNiveau() {
        return niveau;
    }
}
