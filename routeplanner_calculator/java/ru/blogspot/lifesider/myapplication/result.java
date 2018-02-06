package ru.blogspot.lifesider.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import static ru.blogspot.lifesider.myapplication.MainActivity.inprobdaycity;
import static ru.blogspot.lifesider.myapplication.MainActivity.inprobout;
import static ru.blogspot.lifesider.myapplication.MainActivity.inprobdaytrassa;
import static ru.blogspot.lifesider.myapplication.inputfuel.infuelout;
import static ru.blogspot.lifesider.myapplication.inputfuel.infuelazs;
public class result extends AppCompatActivity {
    float probinres;
    double fuelavecityres;
    double avetrassares;
    double avecommonres;
    double intankres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);}
    public void OnClickWinter(View view) {
        TextView probin=findViewById(R.id.textView);
        TextView fuelavecity=findViewById(R.id.textView2);
        TextView fuelavetrassa=findViewById(R.id.textView3);
        TextView fuelavecommon=findViewById(R.id.textView4);
        TextView intank=findViewById(R.id.textView5);
        probinres=inprobout+inprobdaycity+inprobdaytrassa;
        fuelavecityres=inprobdaycity*0.113;
        avetrassares=inprobdaytrassa*0.101;
        avecommonres=fuelavecityres+avetrassares;
        intankres=(infuelout+infuelazs)-avecommonres;
        probin.setText("пробег при возвращении "+probinres +"км");
        fuelavecityres = Math.round(fuelavecityres*10)/10.0d;
        fuelavecity.setText("расход по городу "+fuelavecityres +"л");
        avetrassares= Math.round(avetrassares*10)/10.0d;
        fuelavetrassa.setText("расход по трассе "+avetrassares+ "л");
        avecommonres= Math.round(avecommonres*10)/10.0d;
        fuelavecommon.setText("общий расход "+avecommonres +"л");
        intankres= Math.round(intankres*10)/10.0d;
        intank.setText("при возвращении "+intankres +"л");
    }
    public void onClickSummer(View view) {
        TextView probin=findViewById(R.id.textView);
        TextView fuelavecity=findViewById(R.id.textView2);
        TextView fuelavetrassa=findViewById(R.id.textView3);
        TextView fuelavecommon=findViewById(R.id.textView4);
        TextView intank=findViewById(R.id.textView5);
        probinres=inprobout+inprobdaycity+inprobdaytrassa;
        fuelavecityres=inprobdaycity*0.105;
        avetrassares=inprobdaytrassa*0.092;
        avecommonres=fuelavecityres+avetrassares;
        intankres=(infuelout+infuelazs)-avecommonres;
        probin.setText("пробег при возвращении "+probinres +"км");
        fuelavecityres = Math.round(fuelavecityres*10)/10.0d;
        fuelavecity.setText("расход по городу "+fuelavecityres +"л");
        avetrassares= Math.round(avetrassares*10)/10.0d;
        fuelavetrassa.setText("расход по трассе "+avetrassares+ "л");
        avecommonres= Math.round(avecommonres*10)/10.0d;
        fuelavecommon.setText("общий расход "+avecommonres +"л");
        intankres= Math.round(intankres*10)/10.0d;
        intank.setText("при возвращении "+intankres +"л");
    }
}

