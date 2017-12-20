package projets6.com1spot;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import projets6.com1spot.DataBase.MyDataBase;


public class ActivityChercher extends AppCompatActivity {
    private MyDataBase mData;
    private ImageButton BPChMenu, BPChOptions, BPChContacts;
    private ListView mAvtivityView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chercher);
        mData= new MyDataBase();
        BPChMenu = findViewById(R.id.menu);
        BPChOptions = findViewById(R.id.options);
        BPChContacts = findViewById(R.id.contacts);
        mAvtivityView= (ListView) findViewById(R.id.actView);
        mAvtivityView.setAdapter(mData.get_Activity(ActivityChercher.this));
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
