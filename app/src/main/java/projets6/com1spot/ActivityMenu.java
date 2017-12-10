package projets6.com1spot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class ActivityMenu extends AppCompatActivity {

    Button BPProposer, BPChercher;
    ImageButton BPOptions, BPContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BPProposer = findViewById(R.id.proposer);
        BPChercher = findViewById(R.id.chercher);
        BPOptions = findViewById(R.id.options);
        BPContacts = findViewById(R.id.contacts);

        BPProposer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActivityProposer.class);
                startActivity(intent);
            }
        });

        BPChercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActivityChercher.class);
                startActivity(intent);
            }
        });

        BPOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActivityPreference.class);
                startActivity(intent);
            }
        });

        BPContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActivityContact.class);
                startActivity(intent);
            }
        });
    }
}
