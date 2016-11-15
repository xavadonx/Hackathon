package com.example.zer.hackathon;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.Calendar;
import android.util.Log;
import android.widget.Toast;

import com.example.zer.hackathon.models.Responce;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public static final String SHAREDPREFS = "sharedprefs";
    public static final String DATE = "date";
    public static final String INDEX = "index";
    public static boolean isSync = false;

    private FrameLayout flnow;
    private FrameLayout flfirst;
    private FrameLayout flsecond;
    private FrameLayout flthird;
    private FrameLayout flfourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intiFields();

        checkSyncDate();
    }

    private void intiFields() {
        flnow = (FrameLayout) findViewById(R.id.flNow);
        flfirst = (FrameLayout) findViewById(R.id.flFifth);
        flsecond = (FrameLayout) findViewById(R.id.flSecond);
        flthird = (FrameLayout) findViewById(R.id.flThird);
        flfourth = (FrameLayout) findViewById(R.id.flFourth);

        flnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatrSecondActivity(0);
            }
        });
        flfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatrSecondActivity(1);
            }
        });
        flsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatrSecondActivity(2);
            }
        });
        flthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatrSecondActivity(3);
            }
        });
        flfourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatrSecondActivity(4);
            }
        });
    }

    private void StatrSecondActivity(int index) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(INDEX, index);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void checkSyncDate() {
        SharedPreferences sp = getSharedPreferences(SHAREDPREFS, Context.MODE_PRIVATE);
        String lastSyncDate = sp.getString(DATE, "Unknown");
        String d = String.valueOf(Calendar.getInstance().DAY_OF_YEAR);

        if (lastSyncDate.equals("Unknown")) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putString(DATE, d);
            editor.apply();
            isSync = true;
        } else {
            if (lastSyncDate.equals(d)) {
                isSync = true;
            } else {
                isSync = false;
            }
        }
    }

        Retrofit.getWeather("Kharkiv", new Callback<Responce>() {

            @Override
            public void success(Responce responce, Response response) {
                Log.d("Responce", response.toString());
            }

            @Override
            public void failure(RetrofitError error) {
//                Toast.makeText(MainActivity.this, (CharSequence) error,Toast.LENGTH_LONG).show();
                Log.d("Error", error.toString());
            }
        });



        intiFields();

        checkSyncDate();
    }

    private void intiFields() {
        flnow = (FrameLayout) findViewById(R.id.flNow);
        flfirst = (FrameLayout) findViewById(R.id.flFifth);
        flsecond = (FrameLayout) findViewById(R.id.flSecond);
        flthird = (FrameLayout) findViewById(R.id.flThird);
        flfourth = (FrameLayout) findViewById(R.id.flFourth);

        flnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatrSecondActivity(0);
            }
        });
        flfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatrSecondActivity(1);
            }
        });
        flsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatrSecondActivity(2);
            }
        });
        flthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatrSecondActivity(3);
            }
        });
        flfourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StatrSecondActivity(4);
            }
        });
    }

    private void StatrSecondActivity(int index) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(INDEX, index);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void checkSyncDate() {
        SharedPreferences sp = getSharedPreferences(SHAREDPREFS, Context.MODE_PRIVATE);
        String lastSyncDate = sp.getString(DATE, "Unknown");
        String d = String.valueOf(Calendar.getInstance().DAY_OF_YEAR);

        if (lastSyncDate.equals("Unknown")) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putString(DATE, d);
            editor.apply();
            isSync = true;
        } else {
            if (lastSyncDate.equals(d)) {
                isSync = true;
            } else {
                isSync = false;
            }
        }
    }


}
