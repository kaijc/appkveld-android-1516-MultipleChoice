package no.applitude.multiplechoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_name);

        mPlay =(Button)findViewById(R.id.btnPlay);

        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent();
            }
        });
    }

    public void Intent(){
        Intent intent = new Intent(this, quest.class);
        startActivity(intent);
    }
}
