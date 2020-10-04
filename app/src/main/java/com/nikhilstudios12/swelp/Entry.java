package com.nikhilstudios12.swelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.nikhilstudios12.swelp.auth.Splash;

public class Entry extends AppCompatActivity {
    Button getIn , yourProfile , logout;
    private FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mFirebaseAuth = FirebaseAuth.getInstance();
        getIn = findViewById(R.id.btn_getin);
        yourProfile = findViewById(R.id.btn_profile);
        logout = findViewById(R.id.btn_logout);

        getIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        yourProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), User_Profile.class));
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentL = new Intent(Entry.this, Splash.class);
                startActivity(intentL);
                finish();
                Toast.makeText(Entry.this, "Succesfully Logout",Toast.LENGTH_SHORT).show();
                mFirebaseAuth.signOut();
            }
        });

    }
}