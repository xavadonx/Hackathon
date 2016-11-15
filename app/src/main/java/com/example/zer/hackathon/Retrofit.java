package com.example.zer.hackathon;

import android.util.Log;

import com.example.zer.hackathon.models.Responce;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by ishtefan on 15.11.2016.
 */

public class Retrofit {

    private static final String ENDPOINT = "http://api.worldweatheronline.com/premium/v1";
    private static ApiReference apiReference;

    static {
        initialize();
    }

    static void initialize() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(ENDPOINT)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        apiReference = restAdapter.create(ApiReference.class);
    }

    interface ApiReference {
        @GET("/weather.ashx")
        void getWeather(@Query("key") String key,
                        @Query("q") String city,
                        @Query("format") String json,
                        @Query("num_of_days") String numOfDays,
                        @Query("tp") String tp,
                        Callback<Responce> callback);

//        void getWeather(@Path("city") String city, Callback<List<Model>> callback);

    }

    public static void getWeather(String city, Callback<Responce> callback) {
        apiReference.getWeather("5686ce60a7464918b54134533161511", "Kharkiv", "json", "5", "24", callback);


    }

}
