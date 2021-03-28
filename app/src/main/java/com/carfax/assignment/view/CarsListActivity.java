package com.carfax.assignment.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.Toast;

import com.carfax.assignment.view.adapter.CarsRecyclerAdapter;
import com.carfax.assignment.viewmodel.CarViewModel;

import java.util.Observable;
import java.util.Observer;

import mvvm.rxjava.example.R;
import mvvm.rxjava.example.databinding.ActivityCarListBinding;

public class CarsListActivity extends AppCompatActivity implements Observer {
    private ActivityCarListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.binding = DataBindingUtil.setContentView(this, R.layout.activity_car_list);

        CarViewModel carViewModel = new CarViewModel(this);

        this.setupObserver(carViewModel);
        this.initCarRecyclerView(binding.carsList);
        this.binding.setCarViewModel(carViewModel);
        carViewModel.fetchCars();
    }

    public void setupObserver(Observable observable) {
        observable.addObserver(this);
    }

    /**
     * Initialize cars adapter
     *
     * @param recyclerView
     */
    private void initCarRecyclerView(RecyclerView recyclerView) {
        CarsRecyclerAdapter adapter = new CarsRecyclerAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof CarViewModel) {
            CarsRecyclerAdapter adapter = (CarsRecyclerAdapter) binding.carsList.getAdapter();
            CarViewModel carViewModel = (CarViewModel) observable;
            adapter.setCarsList(carViewModel.getCardsList());

            Toast.makeText(getApplicationContext(), "Refreshed", Toast.LENGTH_SHORT).show();
        }
    }
}