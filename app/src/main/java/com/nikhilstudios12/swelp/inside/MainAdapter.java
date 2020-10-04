package com.nikhilstudios12.swelp.inside;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nikhilstudios12.swelp.R;
import com.nikhilstudios12.swelp.hospitals.Apollo;
import com.nikhilstudios12.swelp.hospitals.Billroth;
import com.nikhilstudios12.swelp.hospitals.Kamakshi;
import com.nikhilstudios12.swelp.hospitals.Kauvery;
import com.nikhilstudios12.swelp.hospitals.Madras;
import com.nikhilstudios12.swelp.hospitals.Malar;
import com.nikhilstudios12.swelp.hospitals.Miot;
import com.nikhilstudios12.swelp.hospitals.Sims;
import com.nikhilstudios12.swelp.hospitals.Srm;
import com.nikhilstudios12.swelp.hospitals.Vijaya;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    ArrayList<MainModel> mainModels;
    Context context;

    public MainAdapter(Context context,ArrayList<MainModel>mainModels){
        this.context = context;
        this.mainModels = mainModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Create View
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Set founders to ImageView
        holder.imageView.setImageResource(mainModels.get(position).getFounders());

        //Set foundersName to TextView
        holder.textView.setText(mainModels.get(position).getFoundersName());




    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //Initialize Variables
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //Assign variables
            imageView = itemView.findViewById(R.id.image_view);
            textView = itemView.findViewById(R.id.text_view);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();



            if (position == 0) {
                Intent intent = new Intent(context, Apollo.class);
                context.startActivity(intent);
                Toast.makeText(context,"Apollo Hospitals",Toast.LENGTH_SHORT).show();
            }

            else if (position == 1) {
                Intent intent = new Intent(context, Billroth.class);
                context.startActivity(intent);
                Toast.makeText(context,"Billroth Hospital",Toast.LENGTH_SHORT).show();
            }

            else if (position == 2) {
                Intent intent = new Intent(context, Vijaya.class);
                context.startActivity(intent);
                Toast.makeText(context,"Vijaya Hospital",Toast.LENGTH_SHORT).show();
            }
            else if (position == 3) {
                Intent intent = new Intent(context, Miot.class);
                context.startActivity(intent);
                Toast.makeText(context,"MIOT International",Toast.LENGTH_SHORT).show();
            }
            else if (position == 4) {
                Intent intent = new Intent(context, Sims.class);
                context.startActivity(intent);
                Toast.makeText(context,"SIMS Hospital",Toast.LENGTH_SHORT).show();
            }

            else if (position == 5) {
                Intent intent = new Intent(context, Kauvery.class);
                context.startActivity(intent);
                Toast.makeText(context,"Kauvery Hospital",Toast.LENGTH_SHORT).show();
            }

            else if (position == 6) {
                Intent intent = new Intent(context, Srm.class);
                context.startActivity(intent);
                Toast.makeText(context,"SRM Hospitals",Toast.LENGTH_SHORT).show();
            }
            else if (position == 7) {
                Intent intent = new Intent(context, Madras.class);
                context.startActivity(intent);
                Toast.makeText(context,"Madras Medical Mission ",Toast.LENGTH_SHORT).show();
            }
            else if (position == 8) {
                Intent intent = new Intent(context, Kamakshi.class);
                context.startActivity(intent);
                Toast.makeText(context,"DR.KAMAKSHI MEMORIAL HOSPITAL",Toast.LENGTH_SHORT).show();
            }
            else if (position == 9) {
                Intent intent = new Intent(context, Malar.class);
                context.startActivity(intent);
                Toast.makeText(context,"Fortis Malar Hospital",Toast.LENGTH_SHORT).show();
            }



        }
    }
}
