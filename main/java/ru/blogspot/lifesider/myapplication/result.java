package ru.blogspot.lifesider.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

import static ru.blogspot.lifesider.myapplication.MainActivity.inprobdaycity;
import static ru.blogspot.lifesider.myapplication.MainActivity.inprobout;
import static ru.blogspot.lifesider.myapplication.MainActivity.inprobdaytrassa;
import static ru.blogspot.lifesider.myapplication.inputfuel.FILE_NAME2;
import static ru.blogspot.lifesider.myapplication.inputfuel.infuelout;
import static ru.blogspot.lifesider.myapplication.inputfuel.infuelazs;
public class result extends AppCompatActivity {

    public static double probinres;
    double fuelavecityres;
    double avetrassares;
    double avecommonres;
    public static double intankres;

    public final static String FILE_NAME = "content.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }


    public void OnClickWinter(View view) {
        TextView probin = findViewById(R.id.textView);
        TextView fuelavecity = findViewById(R.id.textView2);
        TextView fuelavetrassa = findViewById(R.id.textView3);
        TextView fuelavecommon = findViewById(R.id.textView4);
        TextView intank = findViewById(R.id.textView5);
        probinres = inprobout + inprobdaycity + inprobdaytrassa;
        fuelavecityres = inprobdaycity * 0.113;
        avetrassares = inprobdaytrassa * 0.101;
        avecommonres = fuelavecityres + avetrassares;
        intankres = (infuelout + infuelazs) - avecommonres;
        probin.setText("пробег при возвращении " + probinres + "км");
        fuelavecityres = Math.round(fuelavecityres * 10) / 10.0d;
        fuelavecity.setText("расход по городу " + fuelavecityres + "л");
        avetrassares = Math.round(avetrassares * 10) / 10.0d;
        fuelavetrassa.setText("расход по трассе " + avetrassares + "л");
        avecommonres = Math.round(avecommonres * 10) / 10.0d;
        fuelavecommon.setText("общий расход " + avecommonres + "л");
        intankres = Math.round(intankres * 10) / 10.0d;
        intank.setText("при возвращении " + intankres + "л");
        onSave();
        onSavef();
    }

    public void onClickSummer(View view) {
        TextView probin = findViewById(R.id.textView);
        TextView fuelavecity = findViewById(R.id.textView2);
        TextView fuelavetrassa = findViewById(R.id.textView3);
        TextView fuelavecommon = findViewById(R.id.textView4);
        TextView intank = findViewById(R.id.textView5);
        probinres = inprobout + inprobdaycity + inprobdaytrassa;
        fuelavecityres = inprobdaycity * 0.105;
        avetrassares = inprobdaytrassa * 0.092;
        avecommonres = fuelavecityres + avetrassares;
        intankres = (infuelout + infuelazs) - avecommonres;
        probin.setText("пробег при возвращении " + probinres + "км");
        fuelavecityres = Math.round(fuelavecityres * 10) / 10.0d;
        fuelavecity.setText("расход по городу " + fuelavecityres + "л");
        avetrassares = Math.round(avetrassares * 10) / 10.0d;
        fuelavetrassa.setText("расход по трассе " + avetrassares + "л");
        avecommonres = Math.round(avecommonres * 10) / 10.0d;
        fuelavecommon.setText("общий расход " + avecommonres + "л");
        intankres = Math.round(intankres * 10) / 10.0d;
        intank.setText("при возвращении " + intankres + "л");
        onSave();
        onSavef();
    }

    public void onSave() {

        FileOutputStream fos = null;
        String text = String.valueOf(probinres);
        try {

            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);//opened stream
            fos.write(text.getBytes());//written text here
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
        } catch (IOException ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally {
            try {
                if (fos != null)
                    fos.close();//output stream is closed
            } catch (IOException ex) {

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onSavef() {

        FileOutputStream foss = null;
        String textt = String.valueOf(intankres);
        try {

            foss = openFileOutput(FILE_NAME2, MODE_PRIVATE);//opened stream
            foss.write(textt.getBytes());//written text here
            Toast.makeText(this, "Файл сохранен", Toast.LENGTH_SHORT).show();
        } catch (IOException ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        } finally {
            try {
                if (foss != null)
                    foss.close();//output stream is closed
            } catch (IOException ex) {

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

    }
}







