package com.example.zer.hackathon;

/**
 * Created by ishtefan on 15.11.2016.
 */

public class Model {
    public String city;
    //    температура
    public int temperature;
    //    Облачно, пасмурно, возм дождь
    public String weatherDesc;
    //    температура как чувствуется
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
}
