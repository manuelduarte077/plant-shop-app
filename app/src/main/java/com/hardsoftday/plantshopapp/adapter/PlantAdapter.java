package com.hardsoftday.plantshopapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PlantViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static final class PlantViewHolder extends RecyclerView.ViewHolder {
        public PlantViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
