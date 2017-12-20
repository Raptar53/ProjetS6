package projets6.com1spot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import projets6.com1spot.DataBase.MyDataBase;


public class ActivityInscription extends AppCompatActivity {

    private MyDataBase mData;
    private Button BPInInscription;
    private ImageButton BPInRetour;
    private EditText Login, Password, Confirmation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        mData = new MyDataBase();

        Login = findViewById(R.id.Login);
        Password = findViewById(R.id.Password);
        Confirmation = findViewById(R.id.confirmation);
        BPInRetour = findViewById(R.id.retour);
        BPInInscription = findViewById(R.id.inscription);

        BPInInscription.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name = Login.getText().toString();
                String mdp = Password.getText().toString();
                String mdp2 = Confirmation.getText().toString();
                System.out.println(mdp);
                System.out.println(mdp2);
                //On affiche un message si l'un des deux champs (login ou mdp) est vide :
                if (name.equals("") || mdp.equals("") || mdp2.equals("")){
                    Toast.makeText(ActivityInscription.this,"Données incomplètes",Toast.LENGTH_SHORT).show();
                    return;
                }
                //On affiche un message si les 2 mdp sont identiques
                if (!mdp.equals(mdp2)){
                    Toast.makeText(ActivityInscription.this,"Les deux password sont différents",Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    mData.addUser(ActivityInscription.this,name,mdp2);
                    Intent intent = new Intent(getApplicationContext(),Com1Spot.class);
                    startActivity(intent);
                }
            }
        });

        BPInRetour.setOnClickListener(new View.OnClickListener(){    //ajout dans bdd (en attente)
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),Com1Spot.class);
                startActivity(intent);
            }
        });
    }
}
