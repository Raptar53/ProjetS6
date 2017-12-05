package projets6.com1spot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Com1Spot extends AppCompatActivity {

    //int [] ids;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_com1_spot);
        //TextView text = new TextView(this);
        //text.setText("PUTAIN CA MARCHE !!!!!!!!!");
        setContentView(R.layout.activity_menu);

        //ids = new int[2];
        //ids[0] = R.id.button1;
        //ids[1] = R.id.button2;

        Button BP1 = /*(Button)*/ findViewById(R.id.button2);
        BP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActivityChercher.class);
                startActivity(intent);
            }
        });
    }

    /*public void chercher(View v){
        Log.i("Com1Spot","Chercher element dont le id est" + v.getId());

        if (v.getId() == ids[1]){
            setContentView(R.layout.activity_menu);
        }
        if (v.getId() == ids[2]){
            setContentView(R.layout.activity_com1_spot);
        }

    }*/
}
