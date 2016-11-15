package com.example.zer.hackathon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by samik on 15.11.2016.
 */

public class SecondActivity extends AppCompatActivity {
    TextView sun;
    TextView moon;
    TextView wind;
    TextView rain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initialize();

    }


//    public void setDetailsInfo(){
//
//        String sunVolume = "Восход : " + sun
//        //Расширенная информация
//        //   рассвет
//        public String sunrise;
//        //    закат
//        public String sunset;
//        //  восход луны
//        public String moonrise;
//        //    заход луны
//        public String moonset;
//
//        // вероятность дождя
//        public int chanceofrain;
//        // вероятность снега
//        public int chanceofsnow;
//        // вероятность тумана
//        public int chanceoffog;
//        // вероятность появления солнца;
//        public int chanceofsunshine;
//
//        // скорость ветра
//        public int windspeedKmph;
//    }

    private void setTextDetail(String sunVolume,String moonVolume,String windVolume,String rainVolume){
        sun.setText(sunVolume);
        moon.setText(moonVolume);
        rain.setText(rainVolume);
        wind.setText(windVolume);
    }

    private void initialize() {
        rain = (TextView)findViewById(R.id.da_rainAndAll);
        sun = (TextView)findViewById(R.id.da_sunUpDown);
        wind = (TextView)findViewById(R.id.da_wind);
        moon = (TextView)findViewById(R.id.da_moonUpDown);
    }
}
