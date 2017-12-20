package projets6.com1spot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class ActivityChercher extends AppCompatActivity {

    private ImageButton BPChMenu, BPChOptions, BPChContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chercher);

        BPChMenu = findViewById(R.id.menu);
        BPChOptions = findViewById(R.id.options);
        BPChContacts = findViewById(R.id.contacts);

        BPChMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMenu.class);
                startActivity(intent);
            }
        });

        BPChOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityPreference.class);
                startActivity(intent);
            }
        });

        BPChContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityContact.class);
                startActivity(intent);
            }
        });
    }
}
