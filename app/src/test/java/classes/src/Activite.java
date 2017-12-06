package classes.src;
import classes.src.Activite_info;


/**
 * Created by Romain on 28/11/2017.
 */

public class Activite {
    /**
     * Modified by Guillaume on 05/12/2017
     */
    private String lieu;
    private String type_activite;
    private int date;
    private int horaire;
    private Activite_info info;

    // Getters & Setters

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getType_activite() {
        return type_activite;
    }

    public void setType_activite(String type_activite) {
        this.type_activite = type_activite;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getHoraire() {
        return horaire;
    }

    public void setHoraire(int horaire) {
        this.horaire = horaire;
    }



    //Constructor

    public Activite(String lieu, String type_activite, int date, int horaire,Activite_info activite_info) {
        this.lieu = lieu;
        this.type_activite = type_activite;
        this.date = date;
        this.horaire = horaire;
        this.info = activite_info;
    }

}
