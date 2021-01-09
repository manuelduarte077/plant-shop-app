package com.hardsoftday.plantshopapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.hardsoftday.plantshopapp.adapter.PopularPlantAdapter;
import com.hardsoftday.plantshopapp.models.PopularPlant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewPopular;
    PopularPlantAdapter popularPlantAdapter;

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

    }

    public void setRecyclerViewPopular(List<PopularPlant> popularPlantList) {
        recyclerViewPopular = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recyclerViewPopular.setLayoutManager(layoutManager);
        popularPlantAdapter = new PopularPlantAdapter(this, popularPlantList);
        recyclerViewPopular.setAdapter(popularPlantAdapter);
    }
}