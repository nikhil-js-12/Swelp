package com.nikhilstudios12.swelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nikhilstudios12.swelp.inside.Alternative;
import com.nikhilstudios12.swelp.inside.Would;

public class MainActivity extends AppCompatActivity {
    Button Yes , No , covidBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Yes =findViewById(R.id.btn_covid_yes);
        No = findViewById(R.id.btn_covid_no);
        covidBtn = findViewById(R.id.btn_covid_patient);

        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Would.class));
            }
        });

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Alternative.class));
            }
        });

        covidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Entry.class));
            }
        });
    }
}