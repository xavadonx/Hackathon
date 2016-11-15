package com.example.zer.hackathon;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ishtefan on 15.11.2016.
 */

public class Model {

//    public List<String> value;


//    public String city;
    //    температура
    @SerializedName("temp_C")
    public int temperature;
    //    Облачно, пасмурно, возм дождь
//    public String weatherDesc;

    //    температура как чувствуется
    @SerializedName("FeelsLikeС")
    public int temperatureFeel;
    // давление
    public int pressure;

    //Расширенная информация
    //   рассвет
    public String sunrise;
    //    закат
    public String sunset;
    //  восход луны
    public String moonrise;
    //    заход луны
    public String moonset;

    // вероятность дождя
    public int chanceofrain;
    // вероятность снега
    public int chanceofsnow;
    // вероятность тумана
    public int chanceoffog;
    // вероятность появления солнца;
    public int chanceofsunshine;

    // скорость ветра
    public int windspeedKmph;


    class Current_condition {
        //    температура
        public int temp_C;

        class WeatherDesc {
            //    Облачно, пасмурно, возм дождь
            List<String> value;
        }

        //    температура как чувствуется
        public int FeelsLikeC;

        // давление
        public int pressure;
    }


}