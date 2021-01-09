package com.marcelhomsak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    private TextView textViewDate;
    private TextView textViewTime;
    private TextClock textClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setTitle("CountdownX Settings");

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());




        textViewDate = findViewById(R.id.textViewDate);
        textViewDate.setText("Date: "+currentDate);

        textViewTime = findViewById(R.id.textViewTime);
        textViewTime.setText("Time: ");

        textClock = findViewById(R.id.textClock);
        textClock.setFormat12Hour("HH:mm:ss");

    }
}