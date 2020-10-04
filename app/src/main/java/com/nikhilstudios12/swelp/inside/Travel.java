package com.nikhilstudios12.swelp.inside;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nikhilstudios12.swelp.R;

public class Travel extends AppCompatActivity {
    Button travelBtn;
    ImageView Ambulance , Personal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        travelBtn = findViewById(R.id.btn_travel);
        Ambulance = findViewById(R.id.iv_ambulance);
        Personal = findViewById(R.id.iv_personal);

        travelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Would.class));
            }
        });

        Ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Confirm.class));
            }
        });

        Personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Confirmation.class));
            }
        });

    }
}