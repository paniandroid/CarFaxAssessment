package com.carfax.assignment.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.carfax.assignment.viewmodel.CarDetailsViewModel;
import com.google.gson.Gson;

import mvvm.rxjava.example.R;
import mvvm.rxjava.example.databinding.ActivityCarDetailsBinding;

public class CarDetailsActivity extends AppCompatActivity{
    public static final String CAR_INFO = "CAR_INFO";
    private ActivityCarDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.binding = DataBindingUtil.setContentView(this, R.layout.activity_car_details);

        CarDetailsViewModel carViewModel = new CarDetailsViewModel(this,
                new Gson().fromJson(getIntent().getStringExtra(CAR_INFO), com.carfax.assignment.model.Listing.class));

        this.binding.setCarDetailsVM(carViewModel);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

}
