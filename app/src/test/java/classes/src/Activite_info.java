package classes.src;

/**
 * Created by Guillaume on 06/12/2017.
 */

public class Activite_info {
    private int duree;
    private int nb_place;

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }

    public Activite_info(int duree, int nb_place) {
        this.duree = duree;
        this.nb_place = nb_place;
    }
}
