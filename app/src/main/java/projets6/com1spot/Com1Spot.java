package projets6.com1spot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Com1Spot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_com1_spot);
        TextView text = new TextView(this);
        text.setText("Bonjour, vous me devez 1 000 000€.");
        setContentView(text);
    }
}
