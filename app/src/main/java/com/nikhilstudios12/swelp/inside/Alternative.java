package com.nikhilstudios12.swelp.inside;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nikhilstudios12.swelp.MainActivity;
import com.nikhilstudios12.swelp.R;

public class Alternative extends AppCompatActivity {
    Button symptoms , hospitals , appointment, alterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative);

        symptoms = findViewById(R.id.btn_covid_symptoms);
        hospitals = findViewById(R.id.btn_hospitals);
        appointment = findViewById(R.id.btn_appointment);
        alterBtn = findViewById(R.id.btn_alter);

        symptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Symptoms.class));
            }
        });
        hospitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Map.class));
            }
        });
        appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), List.class));
            }
        });
        alterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

    }
}