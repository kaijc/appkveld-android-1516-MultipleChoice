package no.applitude.multiplechoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Battle extends AppCompatActivity {

    TextView mEnemy;
    TextView mYou;
    TextView mAttNow;
    Button mRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        mEnemy =(TextView)findViewById(R.id.txtEnemy);
        mYou =(TextView)findViewById(R.id.txtYou);
        mAttNow =(TextView)findViewById(R.id.txtAttNow);
        mRun =(Button)findViewById(R.id.btnRun);

        int unicode = 0x1F47E;
        int uni2 = 0x1F46E;
        mEnemy.setText(getEmojiByUnicode(unicode) + "");
        mAttNow.setText(getEmojiByUnicode(uni2) + " attacked " + getEmojiByUnicode(unicode));
        mYou.setText(getEmojiByUnicode(uni2) + "");

        mRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent();
            }
        });
    }

    public String getEmojiByUnicode(int unicode){
        return new String(Character.toChars(unicode));
    }

    public void Intent(){
        Intent intent = new Intent(this, Game_Over.class);
        startActivity(intent);
    }
}
