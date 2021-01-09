package com.hardsoftday.plantshopapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hardsoftday.plantshopapp.R;
import com.hardsoftday.plantshopapp.models.Plant;

import java.util.List;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.PlantViewHolder> {

    Context context;
    List<Plant> plantList;

    public PlantAdapter(Context context, List<Plant> plantList) {
        this.context = context;
        this.plantList = plantList;
    }

    @NonNull
    @Override
    public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_row_plant, parent, false);

        return new PlantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlantViewHolder holder, int position) {

        holder.plantName.setText(plantList.get(position).getPlantName());
        holder.priceName.setText(plantList.get(position).getPlantPrice());
        holder.imagePlant.setImageResource(plantList.get(position).getPlantImage());

    }

    @Override
    public int getItemCount() {
        return plantList.size();
    }


    public static final class PlantViewHolder extends RecyclerView.ViewHolder {

        TextView plantName, priceName;
        ImageView imagePlant;

        public PlantViewHolder(@NonNull View itemView) {
            super(itemView);

            plantName = itemView.findViewById(R.id.name_plant);
            priceName = itemView.findViewById(R.id.price_plant);
            imagePlant = itemView.findViewById(R.id.plant_image);

        }
    }
}
