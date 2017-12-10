package projets6.com1spot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Com1Spot extends AppCompatActivity {

    EditText Login, Password;
    Button BPConnexion, BPInscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com1_spot);

        Login = findViewById(R.id.Login);
        Password = findViewById(R.id.Password);
        BPConnexion = findViewById(R.id.BPConnexion);
        BPInscription = findViewById(R.id.BPInscription);

        BPConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String test = "Romain";
                String name = Login.getText().toString();
                String mdp = Password.getText().toString();
                //On verifie si l'un des deux champs (login ou mdp) est vide :
                if (name.equals("") || mdp.equals("")){
                    Toast.makeText(Com1Spot.this,"Login et Password obligatoire",Toast.LENGTH_SHORT).show();
                    return;
                }
                //On vérifie que le login ainsi que le mdp sont correct
                if (name.equals(test) && mdp.equals("25")){
                    Intent intent = new Intent(getApplicationContext(), ActivityMenu.class);
                    startActivity(intent);
                }
            }
        });

        BPInscription.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ActivityInscription.class);
                    startActivity(intent);
                }
            });

    }

}
