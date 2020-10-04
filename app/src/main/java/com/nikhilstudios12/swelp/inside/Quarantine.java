package com.nikhilstudios12.swelp.inside;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nikhilstudios12.swelp.R;

public class Quarantine extends AppCompatActivity {
    Button Yes , No, quarantineBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine);

        Yes = findViewById(R.id.btn_yes_quarantine);
        No = findViewById(R.id.btn_no_quarantine);
        quarantineBtn = findViewById(R.id.btn_quarantine);

        quarantineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Would.class));
            }
        });

        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quarantine.this, "Take Care , do contact us if required",Toast.LENGTH_SHORT).show();
            }
        });

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Would.class));

            }
        });

    }
}