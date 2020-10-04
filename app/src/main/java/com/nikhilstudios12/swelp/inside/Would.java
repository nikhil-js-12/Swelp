package com.nikhilstudios12.swelp.inside;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nikhilstudios12.swelp.MainActivity;
import com.nikhilstudios12.swelp.R;

public class Would extends AppCompatActivity {
    Button Would , Yes , No;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_would);

        Would = findViewById(R.id.btn_would);
        Yes = findViewById(R.id.btn_bed_yes);
        No = findViewById(R.id.btn_bed_no);

        Would.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Travel.class));
            }
        });
        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Quarantine.class));
            }
        });

    }
}