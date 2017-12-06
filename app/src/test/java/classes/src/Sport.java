package classes.src;

/**
 * Created by Romain on 28/11/2017.
 */

public class Sport extends Activite {

    private int niveau = 0;

    public Sport(String lieu, String type_activite, int[] date, int[] horaire, int[] duree, int nb_place, int niveau) {
        super(lieu, type_activite, date, horaire, duree, nb_place);
        this.niveau = niveau;
    }

    public Sport(String lieu, String type_activite, int[] date, int[] horaire, int niveau) {
        super(lieu, type_activite, date, horaire);
        this.niveau = niveau;
    }

    public Sport(String lieu, String type_activite, int[] date, int[] horaire, int[] duree, int niveau) {
        super(lieu, type_activite, date, horaire, duree);
        this.niveau = niveau;
    }

    public Sport(String lieu, String type_activite, int[] date, int[] horaire, int nb_place, int niveau) {
        super(lieu, type_activite, date, horaire, nb_place);
        this.niveau = niveau;
    }

    public void setNiveau(int n) {
        niveau = n;
    }

    public int getNiveau() {
        return niveau;
    }
}
