package projets6.com1spot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class ActivityContact extends AppCompatActivity {

    private ImageButton BPCoMenu, BPCoOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        BPCoMenu = findViewById(R.id.menu);
        BPCoOptions = findViewById(R.id.options);

        BPCoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityMenu.class);
                startActivity(intent);
            }
        });

        BPCoOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityPreference.class);
                startActivity(intent);
            }
        });
    }
}
