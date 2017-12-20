package projets6.com1spot;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ActivityProposer extends AppCompatActivity {

    private ImageButton BPProMenu, BPProOptions, BPProContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proposer);

        BPProMenu = findViewById(R.id.menu);
        BPProOptions = findViewById(R.id.options);
        BPProContacts = findViewById(R.id.contacts);

        BPProMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMenu.class);
                startActivity(intent);
            }
        });

        BPProOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityPreference.class);
                startActivity(intent);
            }
        });

        BPProContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityContact.class);
                startActivity(intent);
            }
        });
    }
}