package com.example.zer.hackathon;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Calendar;
import java.util.HashMap;

/**
 * Created by samik on 15.11.2016.
 */

public class SecondActivity extends AppCompatActivity  {
    TextView sun;
    TextView moon;
    TextView wind;
    TextView rain;

    TextView weekDay;
    TextView today;
    TextView date;
    ImageView icon;
    Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initialize();
        Intent intent = getIntent();
        int modelNum = intent.getIntExtra("index",0);
        setDetailsInfo(modelNum);

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

        String today = "";
        if (modelNum == 0){
            today = "сегодня";
        }
        String dateVolume = String.valueOf(Calendar.getInstance());
        String url = getIconUrl();
        String weekDay = weekDay();

        setSimpleDatail(weekDay,today,dateVolume,url);

    }

    private void setTextDetail(String sunVolume, String moonVolume, String windVolume, String rainVolume) {
        sun.setText(sunVolume);
        moon.setText(moonVolume);
        rain.setText(rainVolume);
        wind.setText(windVolume);

    }

    private void setSimpleDatail(String weekDayVolume, String todayVolume, String dateVolume, String url){
        weekDay.setText(weekDayVolume);
        today.setText(todayVolume);
        date.setText(dateVolume);
        Picasso.with(this).
                load(url).
                into(icon);
    }

    private void initialize() {
        rain = (TextView) findViewById(R.id.chanceOfRain);
        sun = (TextView) findViewById(R.id.sunUpDown);
        wind = (TextView) findViewById(R.id.windSpeed);
        moon = (TextView) findViewById(R.id.moonUpDown);

        weekDay = (TextView)findViewById(R.id.tvNowDay);
        today = (TextView)findViewById(R.id.tvNow); // показывает если выбран сегоднешний день
        icon = (ImageView)findViewById(R.id.ivNow);
        date = (TextView)findViewById(R.id.tvDataNow);

    }


    public String getIconUrl() {
        //TODO
        return null;
    }


    public String weekDay() {
        //TODO
        return null;
    }
}
