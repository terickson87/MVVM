package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.mvvm.adapters.RecyclerAdapter;
import com.example.mvvm.models.NicePlace;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private List<NicePlace> mNicePlaces = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        initNicePlaces();
        initRecyclerView();
    }

    private void initNicePlaces() {
        Log.d(TAG, "initNicePlaces: preparing nice places");

        mNicePlaces.add(new NicePlace("Arizona","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Flag_of_Arizona.svg/1920px-Flag_of_Arizona.svg.png"));
        mNicePlaces.add(new NicePlace("Scottsdale", "https://upload.wikimedia.org/wikipedia/en/thumb/c/c6/Seal_of_Scottsdale_%28Arizona%29.svg/1024px-Seal_of_Scottsdale_%28Arizona%29.svg.png"));
        mNicePlaces.add(new NicePlace("Tempe", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Flag_of_Tempe%2C_Arizona.svg/1280px-Flag_of_Tempe%2C_Arizona.svg.png"));
        mNicePlaces.add(new NicePlace("Phoenix", "https://upload.wikimedia.org/wikipedia/en/thumb/b/b1/Phoenix-logo.svg/1220px-Phoenix-logo.svg.png"));
        mNicePlaces.add(new NicePlace("Payson", "https://learningfromdogs.files.wordpress.com/2010/04/payson.jpg"));
        mNicePlaces.add(new NicePlace("Chandler", "https://upload.wikimedia.org/wikipedia/en/8/8d/Chandleraz_seal.png"));
        mNicePlaces.add(new NicePlace("Gilbert", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Seal_of_Gilbert%2C_Arizona.svg/966px-Seal_of_Gilbert%2C_Arizona.svg.png"));
        mNicePlaces.add(new NicePlace("Mesa", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Flag_of_Mesa%2C_Arizona.svg/1280px-Flag_of_Mesa%2C_Arizona.svg.png"));
        mNicePlaces.add(new NicePlace("Fountain Hills", "https://upload.wikimedia.org/wikipedia/en/2/27/FountainHillsaz_seal.png"));
        mNicePlaces.add(new NicePlace("Apache Junction", "https://upload.wikimedia.org/wikipedia/en/5/5f/Apache_junction_seal.png"));
        mNicePlaces.add(new NicePlace("Surprise", "https://upload.wikimedia.org/wikipedia/en/7/76/Surprise_AZ_seal.png"));
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, mNicePlaces);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}