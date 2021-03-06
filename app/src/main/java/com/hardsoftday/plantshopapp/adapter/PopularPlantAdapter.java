package com.hardsoftday.plantshopapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.provider.CalendarContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hardsoftday.plantshopapp.R;
import com.hardsoftday.plantshopapp.models.PopularPlant;

import java.util.List;

public class PopularPlantAdapter extends RecyclerView.Adapter<PopularPlantAdapter.PopularViewHolder> {

    Context context;
    List<PopularPlant> popularPlantList;

    public PopularPlantAdapter(Context context, List<PopularPlant> popularPlantList) {
        this.context = context;
        this.popularPlantList = popularPlantList;
    }

    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_row_popular, parent, false);

        return new PopularViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder holder, int position) {
        holder.popularName.setText(popularPlantList.get(position).getPopularName());

        if(position==0)
          holder.popularName.setTextColor(Color.parseColor("#00B761"));

    }

    @Override
    public int getItemCount() {
        return popularPlantList.size();
    }


    public static final class PopularViewHolder extends RecyclerView.ViewHolder  {

        TextView popularName;

        public PopularViewHolder(@NonNull View itemView) {
            super(itemView);

            popularName = itemView.findViewById(R.id.popular_name);

        }
    }
}
