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
    Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        initialize();


    }


    public void setDetailsInfo(int modelNum) {
        model = Weathers.getInstance().get(modelNum);
        String sunVolum = "Солнце : Восход - " + model.sunrise + " Закат - " + model.sunset;
        String moonVolum = "Луна : Восход - " + model.moonrise + " Закат - " + model.sunset;
        String rainVolume = "Вероятность дождя " + model.chanceofrain + " %." +
                "Вероятность снега" + model.chanceofsnow + " %." +
                "Вероятность тумана " + model.chanceoffog + " %." +
                "Вероятность появлени солнца " + model.chanceofsunshine + " %";
        String windVolume = "Скорость ветра состовляет " + model.windspeedKmph + " км/ч.";

        setTextDetail(sunVolum,moonVolum,windVolume,rainVolume);

    }

    private void setTextDetail(String sunVolume, String moonVolume, String windVolume, String rainVolume) {
        sun.setText(sunVolume);
        moon.setText(moonVolume);
        rain.setText(rainVolume);
        wind.setText(windVolume);
    }

//    private void initialize() {
//        rain = (TextView) findViewById(R.id.da_rainAndAll);
//        sun = (TextView) findViewById(R.id.da_sunUpDown);
//        wind = (TextView) findViewById(R.id.da_wind);
//        moon = (TextView) findViewById(R.id.da_moonUpDown);
//    }
}
