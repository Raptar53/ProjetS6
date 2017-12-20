package projets6.com1spot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class ActivityPreference extends AppCompatActivity {

    private ImageButton BPPreMenu, BPPreContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

        BPPreMenu = findViewById(R.id.menu);
        BPPreContacts = findViewById(R.id.contacts);

        BPPreMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMenu.class);
                startActivity(intent);
            }
        });

        BPPreContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityContact.class);
                startActivity(intent);
            }
        });
    }
}
