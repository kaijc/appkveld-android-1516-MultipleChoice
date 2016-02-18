package no.applitude.multiplechoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Store extends AppCompatActivity {

    Button mOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        mOut = (Button)findViewById(R.id.btnOut);

        mOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent();
            }
        });
    }

    public void Intent(){
        Intent intent = new Intent(this, Battle.class);
        startActivity(intent);
    }
}
