package com.nikhilstudios12.swelp.inside;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nikhilstudios12.swelp.R;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<MainModel> mainModels;
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.recycler_view);

        Integer[] founders = {R.drawable.apollo, R.drawable.billroth, R.drawable.vijaya, R.drawable.miot, R.drawable.sims, R.drawable.kauvery, R.drawable.srm, R.drawable.madras, R.drawable.kamakshi, R.drawable.malar};
        String[] foundersName = {"Apollo Hospitals", "Billroth Hospital", "Vijaya Hospital", "Miot International", "SIMS Hospital", "Kauvery Hospital", "SRM Hospitals", "Madras Medical Mission", "DR.KAMAKSHI MEMORIAL HOSPITAL", "Fortis Malar Hospital"};

        mainModels = new ArrayList<>();
        for (int i = 0; i < founders.length; i++) {
            MainModel model = new MainModel(founders[i], foundersName[i]);
            mainModels.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                List.this, LinearLayoutManager.VERTICAL, false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mainAdapter = new MainAdapter(List.this, mainModels);
        recyclerView.setAdapter(mainAdapter);



    }
}