package com.carfax.assignment.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.carfax.assignment.model.Listing;
import com.carfax.assignment.view.CarDetailsActivity;
import com.google.gson.Gson;

public class ItemCarViewModel extends BaseObservable {
    private Listing car;
    private Context context;


    public ItemCarViewModel(Context context, Listing car) {
        this.car = car;
        this.context = context;
    }

    @BindingAdapter("imageUrl")
    public static void setImageUrl(final ImageView imageView, final String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL))
                .into(imageView);
    }

    public String getName() {
        return this.car.getModel();
    }

    public String getPublisher() {
        return this.car.getMake();
    }

    public String getCreatedBy() {
        return this.car.getDealer().getName();
    }

    public String getThumbnail() {
        return this.car.getImages().getMedium().get(0);
    }

    public Listing getCar() {
        return car;
    }

    public void setCar(Listing car) {
        this.car = car;
        notifyChange();
    }

    public void callDealer() {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", car.getDealer().getPhone(), null));
        context.getApplicationContext().startActivity(intent);
    }

    public void openCarDetails() {
        Intent intent = new Intent(context, CarDetailsActivity.class);
        intent.putExtra(CarDetailsActivity.CAR_INFO, new Gson().toJson(car));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.getApplicationContext().startActivity(intent);
    }
}