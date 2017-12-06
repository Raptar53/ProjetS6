package classes.src;

/**
 * Created by Romain on 28/11/2017.
 */

public class Utilisateur {
    private String login;
    private String mdp;
    private String pseudo;
    private String type_activités;
    private String lieux;
    private String commentaire;

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

    public Utilisateur(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }

}
