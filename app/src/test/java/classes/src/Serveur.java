package classes.src;

import java.util.Vector;

/**
 * Created by Guillaume on 12/12/2017
 *
 */

public class Serveur {
    private Vector<Utilisateur> users;
    private Vector<Activite> activites;

    public void addUtilisateur(String login,String mdp){
        this.users.add(new Utilisateur(login, mdp));
    }

    public void addActivite(int duree, int nb_places,String lieu,String type_activite,int date, int horaire){
       Activite_info infoAct=new Activite_info(duree,nb_places);
        this.activites.add(new Activite(lieu,type_activite,date,horaire,infoAct));
    }

}


