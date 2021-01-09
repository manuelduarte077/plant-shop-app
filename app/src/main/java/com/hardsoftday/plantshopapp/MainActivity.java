package com.hardsoftday.plantshopapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.hardsoftday.plantshopapp.adapter.PlantAdapter;
import com.hardsoftday.plantshopapp.adapter.PopularPlantAdapter;
import com.hardsoftday.plantshopapp.models.Plant;
import com.hardsoftday.plantshopapp.models.PopularPlant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewPopular, recyclerViewPlant;
    PopularPlantAdapter popularPlantAdapter;
    PlantAdapter plantAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PopularPlant> popularPlantList = new ArrayList<>();
        popularPlantList.add(new PopularPlant("1", "POPULAR"));
        popularPlantList.add(new PopularPlant("2", "ORGANIC"));
        popularPlantList.add(new PopularPlant("3", "INDOORS"));
        popularPlantList.add(new PopularPlant("4", "SYNTHETIC"));
        setRecyclerViewPopular(popularPlantList);


        List<Plant> plantList = new ArrayList<>();
        plantList.add(new Plant(1, "Succulent Plant", "$39.99", R.drawable.uno));
        plantList.add(new Plant(2, "Succulent Plant", "$39.99", R.drawable.dos));
        plantList.add(new Plant(3, "Succulent Plant", "$39.99", R.drawable.tress));
        plantList.add(new Plant(4, "Succulent Plant", "$39.99", R.drawable.cuatro));
        plantList.add(new Plant(4, "Succulent Plant", "$39.99", R.drawable.cinco));
        plantList.add(new Plant(4, "Succulent Plant", "$39.99", R.drawable.seis));
        setRecyclerViewPlant(plantList);
    }

    public void setRecyclerViewPopular(List<PopularPlant> popularPlantList) {
        recyclerViewPopular = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recyclerViewPopular.setLayoutManager(layoutManager);
        popularPlantAdapter = new PopularPlantAdapter(this, popularPlantList);
        recyclerViewPopular.setAdapter(popularPlantAdapter);
    }

    public void setRecyclerViewPlant(List<Plant> plantList) {
        recyclerViewPlant = findViewById(R.id.plant_recycler);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerViewPlant.setLayoutManager(layoutManager);
        plantAdapter = new PlantAdapter(this, plantList);
        recyclerViewPlant.setAdapter(plantAdapter);
    }
}