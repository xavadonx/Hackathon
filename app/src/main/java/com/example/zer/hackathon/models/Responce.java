package com.example.zer.hackathon.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ishtefan on 15.11.2016.
 */

public class Responce {

    public Data data;

    static class Data {
        @SerializedName("current_conditions")
        public CurrentCondition[] currentConditions;

        public Weather[] weather;

    }

    static class CurrentCondition {
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
        WeatherDesc weatherDesc;

        static class WeatherDesc {
            public String value;
        }
    }

    static class Weather {

        public Hourly[] hourly;

        static class Hourly {
            public int tempC;
            public String pressure;
            public int FeelsLikeC;

            public WeatherDesc[] weatherDesc;

            static class WeatherDesc {
                public String value;
            }
        }
    }
}
