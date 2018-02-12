package ru.blogspot.lifesider.kia_calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public class MainActivity extends AppCompatActivity {

        EditText mprobout;
        EditText mprobdaycity;
        EditText mrobdaytrassa;
        static float inprobout;
        static float inprobdaycity;
        static float inprobdaytrassa;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mprobout=findViewById(R.id.eprobout);
            mprobdaycity=findViewById(R.id.ecity);
            mrobdaytrassa=findViewById(R.id.etrassa);
        }
        public void onClick(View view) {
            //if lenght of data = 0 retutrn
            if (mprobout.getText().length() == 0)inprobout =0;
            else {
                inprobout = Float.parseFloat(mprobout.getText().toString());
            }

            if (mprobdaycity.getText().length() == 0)inprobdaycity=0;
            else {
                inprobdaycity = Float.parseFloat(mprobdaycity.getText().toString());
            }

            if (mrobdaytrassa.getText().length() == 0)inprobdaytrassa=0;
            else {
                inprobdaytrassa = Float.parseFloat(mrobdaytrassa.getText().toString());
            }
            //request class result
            Intent intent=new Intent(MainActivity.this,inputfuel.class);
            startActivity(intent);
        }


    }
