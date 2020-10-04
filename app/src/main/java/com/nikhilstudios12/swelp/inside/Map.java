package com.nikhilstudios12.swelp.inside;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.nikhilstudios12.swelp.R;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng Apollo_Hospital_chennai  = new LatLng(13.0631, 80.2518);
        map.addMarker(new MarkerOptions().position(Apollo_Hospital_chennai ).title("Apollo Hospital chennai"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Apollo_Hospital_chennai ));

        LatLng Rajiv_Gandhi_Government_General_Hospital = new LatLng(13.0814, 80.2772);
        map.addMarker(new MarkerOptions().position(Rajiv_Gandhi_Government_General_Hospital).title("Rajiv Gandhi Government General Hospital"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Rajiv_Gandhi_Government_General_Hospital));

        LatLng Tamil_Nadu_Government_Multi_Super_Specialty  = new LatLng(13.0692, 80.2737);
        map.addMarker(new MarkerOptions().position(Tamil_Nadu_Government_Multi_Super_Specialty).title("Tamil Nadu Government Multi Super Specialty"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Tamil_Nadu_Government_Multi_Super_Specialty));

        LatLng Billroth_hospital_shenoy_nagar  = new LatLng(13.0758, 80.2275);
        map.addMarker(new MarkerOptions().position(Billroth_hospital_shenoy_nagar).title("Billroth hospital shenoy nagar"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Billroth_hospital_shenoy_nagar ));

        LatLng vijaya_hospital  = new LatLng(13.0483, 80.209);
        map.addMarker(new MarkerOptions().position(vijaya_hospital ).title("vijaya hospital"));
        map.moveCamera(CameraUpdateFactory.newLatLng(vijaya_hospital));

        LatLng MIOt_hopital   = new LatLng(13.0225, 80.1863);
        map.addMarker(new MarkerOptions().position(MIOt_hopital ).title("MIOt hopital"));
        map.moveCamera(CameraUpdateFactory.newLatLng(MIOt_hopital));

        LatLng SIMS_Hospital  = new LatLng(13.0517, 80.2114);
        map.addMarker(new MarkerOptions().position(SIMS_Hospital ).title("SIMS Hospital"));
        map.moveCamera(CameraUpdateFactory.newLatLng(SIMS_Hospital ));

        LatLng Kauvery_Hospital_Multi_Specialty_Hospital_Chennai   = new LatLng(13.0604, 80.2496);
        map.addMarker(new MarkerOptions().position(Kauvery_Hospital_Multi_Specialty_Hospital_Chennai).title("Kauvery Hospital - Multi Specialty Hospital Chennai"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Kauvery_Hospital_Multi_Specialty_Hospital_Chennai));

        LatLng Chettinad_Hospital_and_Research_Institute  = new LatLng(12.7957, 80.2156);
        map.addMarker(new MarkerOptions().position(Chettinad_Hospital_and_Research_Institute).title("Chettinad Hospital and Research Institute"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Chettinad_Hospital_and_Research_Institute));

        LatLng SRM_HOSPITAL   = new LatLng(13.0333, 80.1802);
        map.addMarker(new MarkerOptions().position(SRM_HOSPITAL).title("SRM HOSPITAL"));
        map.moveCamera(CameraUpdateFactory.newLatLng(SRM_HOSPITAL ));

        LatLng Sri_Ramachandra_Medical_Centre  = new LatLng(13.0404, 80.1428);
        map.addMarker(new MarkerOptions().position(Sri_Ramachandra_Medical_Centre).title("Sri Ramachandra Medical Centre"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Sri_Ramachandra_Medical_Centre));

        LatLng Kumaran_Hospital   = new LatLng(13.0789, 80.2491);
        map.addMarker(new MarkerOptions().position(Kumaran_Hospital ).title("Kumaran Hospital"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Kumaran_Hospital));

        LatLng Frontier_Lifeline_Hospital  = new LatLng(13.0876, 80.1857);
        map.addMarker(new MarkerOptions().position(Frontier_Lifeline_Hospital).title("Frontier Lifeline Hospital"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Frontier_Lifeline_Hospital));

        LatLng madras_medical_mission  = new LatLng(13.0524, 80.2508);
        map.addMarker(new MarkerOptions().position(madras_medical_mission).title("madras medical mission"));
        map.moveCamera(CameraUpdateFactory.newLatLng(madras_medical_mission));

        LatLng Kamakshi_Memorial_Hospital   = new LatLng(12.9484, 80.2092);
        map.addMarker(new MarkerOptions().position(Kamakshi_Memorial_Hospital).title("Kamakshi Memorial Hospital"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Kamakshi_Memorial_Hospital));

        LatLng Fortis_Malar_Hospital   = new LatLng(13.0102, 80.2587);
        map.addMarker(new MarkerOptions().position(Fortis_Malar_Hospital).title("Fortis Malar Hospital "));
        map.moveCamera(CameraUpdateFactory.newLatLng(Fortis_Malar_Hospital));

        LatLng Stanley_hospital_Chennai    = new LatLng(13.1059, 80.2854);
        map.addMarker(new MarkerOptions().position(Stanley_hospital_Chennai).title("Stanley hospital Chennai"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Stanley_hospital_Chennai));

        LatLng Southern_Railway_Headquarters_Hospital   = new LatLng(13.0876, 80.1857);
        map.addMarker(new MarkerOptions().position(Southern_Railway_Headquarters_Hospital).title("Southern Railway Headquarters Hospital"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Southern_Railway_Headquarters_Hospital));

        LatLng Kilpauk_Medical_College_and_Hospital_Periyar_EVR_Salai   = new LatLng(13.0784, 80.2429);
        map.addMarker(new MarkerOptions().position(Kilpauk_Medical_College_and_Hospital_Periyar_EVR_Salai).title("Kilpauk Medical College and Hospital Periyar EVR Salai"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Kilpauk_Medical_College_and_Hospital_Periyar_EVR_Salai));

        LatLng Government_Royapettah_Hospital   = new LatLng(12.9484, 80.2092);
        map.addMarker(new MarkerOptions().position(Government_Royapettah_Hospital).title("Government Royapettah Hospital"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Government_Royapettah_Hospital));

    }
}