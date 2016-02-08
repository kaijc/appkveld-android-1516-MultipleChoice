package no.applitude.multiplechoice;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AssetManager am = getApplicationContext().getAssets();
        Typeface unifont = Typeface.createFromAsset(am, String.format(Locale.US, "fonts/%s", "unifont.ttf"));
        ((TextView)findViewById(R.id.text)).setTypeface(unifont);
       // Player p = new Player("Name", "mage");
    }
}
