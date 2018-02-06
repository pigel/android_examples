package ru.blogspot.lifesider.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class inputfuel extends AppCompatActivity {

    EditText mfuelout;
    EditText mfuelazs;
    static float infuelout;
    static float infuelazs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputfuel);
        mfuelout=findViewById(R.id.efuelout);
        mfuelazs=findViewById(R.id.efuelazs);
    }
    public void onClick(View view) {
        //если длина введенного текста равна нулю - возврат
        if (mfuelout.getText().length() == 0)infuelout=0;
        else {
            infuelout = Float.parseFloat(mfuelout.getText().toString());
        }
        if (mfuelazs.getText().length() == 0)infuelazs=0;
        else {
            infuelazs = Float.parseFloat(mfuelazs.getText().toString());
        }
        Intent intent=new Intent(inputfuel.this,result.class);
        startActivity(intent);
    }
}
