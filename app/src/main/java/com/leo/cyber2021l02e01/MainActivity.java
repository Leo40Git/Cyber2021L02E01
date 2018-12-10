package com.leo.cyber2021l02e01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Random rnd;
    private TextView tvNumber;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rnd = new Random();
        number = 0;
        tvNumber = findViewById(R.id.tvNumber);
    }

    public void onClick_btnGenerate(View view) {
        number = rnd.nextInt();
        tvNumber.setText("Number = " + number);
    }

    public void onClick_btnClear(View view) {
        tvNumber.setText("No number. Click on \"Generate\"!");
    }
}
