package no.applitude.multiplechoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quest extends AppCompatActivity {

    Button mBattle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);

        mBattle =(Button)findViewById(R.id.btnBattle);

        mBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent();
            }
        });
    }

    public void Intent(){
        Intent intent = new Intent(this, Store.class);
        startActivity(intent);
    }
}
