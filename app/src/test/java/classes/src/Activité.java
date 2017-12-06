package classes.src;


/**
 * Created by Romain on 28/11/2017.
 */

public class Activite {
    /**
     * Modified by Guillaume on 05/12/2017
     */
    private String lieu;
    private String type_activite;
    private String date;
    private String horaire;
    private String duree;
    private int nb_place;

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

    public String getDate() {
        return date;
    }

    public void setDate(int jour,int mois, int annee) {
        this.date[0] = jour;
        this.date[1] = mois;
        this.date[2] = annee;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(int heure, int minute) {
        this.horaire[0] = heure;
        this.horaire[1] = minute;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(int minute, int heure) {
        this.duree[0] = heure;
        this.duree[1] = minute;
    }

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }

    //Constructor

    public Activite(String lieu, String type_activite, String date, String horaire, String duree, int nb_place) {
        this.lieu = lieu;
        this.type_activite = type_activite;
        this.date = date;
        this.horaire = horaire;
        this.duree = duree;
        this.nb_place = nb_place;
    }

    public Activite(String lieu, String type_activite, String date, String horaire) {
        this.lieu = lieu;
        this.type_activite = type_activite;
        this.date = date;
        this.horaire = horaire;
    }

    public Activite(String lieu, String type_activite, String date, String horaire, String duree) {
        this.lieu = lieu;
        this.type_activite = type_activite;
        this.date = date;
        this.horaire = horaire;
        this.duree = duree;
    }

    public Activite(String lieu, String type_activite, String date, String horaire, int nb_place) {
        this.lieu = lieu;
        this.type_activite = type_activite;
        this.date = date;
        this.horaire = horaire;
        this.nb_place = nb_place;
    }
}
