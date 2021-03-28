package com.carfax.assignment.view.adapter;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carfax.assignment.model.Listing;
import com.carfax.assignment.viewmodel.ItemCarViewModel;

import java.util.ArrayList;
import java.util.List;

import mvvm.rxjava.example.R;
import mvvm.rxjava.example.databinding.ItemCarBinding;

public class CarsRecyclerAdapter extends RecyclerView.Adapter<CarsRecyclerAdapter.CarViewHolder> {
    private List<Listing> carsList;

    public CarsRecyclerAdapter() {
        this.carsList = new ArrayList<>();
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCarBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_car, parent, false);
        return new CarViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.bindCar(carsList.get(position));
    }

    @Override
    public int getItemCount() {
        return carsList.size();
    }

    public void setCarsList(List<Listing> carsList) {
        this.carsList.clear();
        this.carsList.addAll(carsList);
        notifyDataSetChanged();
    }

    @BindingAdapter("android:onClick")
    public static void setOnClickListener(View view, final Runnable runnable) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runnable.run();
            }
        });

    }
    static class CarViewHolder extends RecyclerView.ViewHolder {
        final ItemCarBinding binding;

        CarViewHolder(ItemCarBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


        void bindCar(Listing car) {
            if (binding.getCarItemVM() == null) {
                binding.setCarItemVM(new ItemCarViewModel(itemView.getContext(), car));
            } else {
                binding.getCarItemVM().setCar(car);
            }
        }
    }
}