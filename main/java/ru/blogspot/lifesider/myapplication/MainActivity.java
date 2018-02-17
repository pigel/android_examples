package ru.blogspot.lifesider.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.IOException;

import static ru.blogspot.lifesider.myapplication.result.FILE_NAME;


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

        //if lenght of data = 0 return

        if (mprobout.getText().length() == 0)return;
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
        //request result class
       Intent intent=new Intent(MainActivity.this,inputfuel.class);
        startActivity(intent);
    }
    public void onPredClick(View view) {
        onOpen();
    }




    private void onOpen(){

    FileInputStream fin = null;

            try {
        fin = openFileInput(FILE_NAME);//let's create stream
        byte[] bytes = new byte[fin.available()];
        fin.read(bytes);
        String text = new String (bytes);
        mprobout.setText(text);
    }
            catch(IOException ex) {

        Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
    }
            finally{

        try{
            if(fin!=null)
                fin.close();///close stream
        }
        catch(IOException ex){

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
    private void deleteFile() {
        deleteFile(FILE_NAME);
    }
    public void onClicksbrosprob(View view) {
        deleteFile();
    }
}

