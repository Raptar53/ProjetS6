package classes.src;

import java.util.Vector;
import classes.src.Contact;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Utilisateur {
    private Vector<Contact> repertoire;
    private String login;
    private String mdp;
    private String pseudo;
    private String type_activités;
    private String lieux;
    private String commentaire;

    //private Firebase mRef;

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getType_activités() {
        return type_activités;
    }

    public void setType_activités(String type_activités) {
        this.type_activités = type_activités;
    }

    public String getLieux() {
        return lieux;
    }

    public void setLieux(String lieux) {
        this.lieux = lieux;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }



    //Constructeur
    public Utilisateur(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
        this.repertoire = new Vector<>();
    }


    //methode

    public void addContact(String pseudo){
        this.repertoire.add(new Contact(pseudo));
    }

}
