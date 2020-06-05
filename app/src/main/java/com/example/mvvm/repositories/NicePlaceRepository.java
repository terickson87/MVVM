package com.example.mvvm.repositories;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvm.models.NicePlace;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton Pattern
 */
public class NicePlaceRepository {
    private static NicePlaceRepository mInstance;
    private ArrayList<NicePlace> mDataset = new ArrayList<>();

    public static NicePlaceRepository getInstance() {
        if (mInstance == null) {
            mInstance = new NicePlaceRepository();
        }
        return mInstance;
    }

    // Method to make your API or Database query
    // For now it is simulated
    public MutableLiveData<List<NicePlace>> getNicePlaces() {
        setNicePlaces();

        MutableLiveData<List<NicePlace>> data = new MutableLiveData<>();
        data.setValue(mDataset);
        return data;
    }

    // This method mimics retrieving the data from an API or Database
    private void setNicePlaces() {
        mDataset.add(new NicePlace("Arizona","https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Flag_of_Arizona.svg/1920px-Flag_of_Arizona.svg.png"));
        mDataset.add(new NicePlace("Scottsdale", "https://upload.wikimedia.org/wikipedia/en/thumb/c/c6/Seal_of_Scottsdale_%28Arizona%29.svg/1024px-Seal_of_Scottsdale_%28Arizona%29.svg.png"));
        mDataset.add(new NicePlace("Tempe", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Flag_of_Tempe%2C_Arizona.svg/1280px-Flag_of_Tempe%2C_Arizona.svg.png"));
        mDataset.add(new NicePlace("Phoenix", "https://upload.wikimedia.org/wikipedia/en/thumb/b/b1/Phoenix-logo.svg/1220px-Phoenix-logo.svg.png"));
        mDataset.add(new NicePlace("Payson", "https://learningfromdogs.files.wordpress.com/2010/04/payson.jpg"));
        mDataset.add(new NicePlace("Chandler", "https://upload.wikimedia.org/wikipedia/en/8/8d/Chandleraz_seal.png"));
        mDataset.add(new NicePlace("Gilbert", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/Seal_of_Gilbert%2C_Arizona.svg/966px-Seal_of_Gilbert%2C_Arizona.svg.png"));
        mDataset.add(new NicePlace("Mesa", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Flag_of_Mesa%2C_Arizona.svg/1280px-Flag_of_Mesa%2C_Arizona.svg.png"));
        mDataset.add(new NicePlace("Fountain Hills", "https://upload.wikimedia.org/wikipedia/en/2/27/FountainHillsaz_seal.png"));
        mDataset.add(new NicePlace("Apache Junction", "https://upload.wikimedia.org/wikipedia/en/5/5f/Apache_junction_seal.png"));
    }
}
