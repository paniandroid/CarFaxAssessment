package com.carfax.assignment.viewmodel;

import android.content.Context;
import android.databinding.ObservableInt;
import android.view.View;

import com.carfax.assignment.CarFaxApp;
import com.carfax.assignment.data.AppDataManager;
import com.carfax.assignment.data.remote.ApiClient;
import com.carfax.assignment.data.remote.ApiService;
import com.carfax.assignment.model.AssignmentResponse;
import com.carfax.assignment.model.Listing;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class CarViewModel extends java.util.Observable {

    public ObservableInt progress;
    public ObservableInt recycler;
    private Context context;
    private List<Listing> carsList;

    public CarViewModel(Context context) {
        this.context = context;

        this.progress = new ObservableInt(View.GONE);
        this.recycler = new ObservableInt(View.GONE);

        this.carsList = new ArrayList<>();
    }

    public void fetchCars() {
        this.progress.set(View.VISIBLE);
        fetchAllCars();
    }


    public List<Listing> getCardsList() {
        return carsList;
    }

    /**
     * Subscribe to observable
     */
    private void fetchAllCars() {
        getCarsObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(getCarsObserver());
    }

    /**
     * Making Retrofit call to get observable
     */
    private Observable<AssignmentResponse> getCarsObservable() {
        return CarFaxApp.getDataManager().getAssignmentResponse()
                .toObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }


    /**
     * Making call to get observer
     *
     * @return
     */
    private DisposableObserver<AssignmentResponse> getCarsObserver() {

        return new DisposableObserver<AssignmentResponse>() {
            @Override
            public void onNext(@NonNull AssignmentResponse response) {
                carsList.clear();
                carsList.addAll(response.getListings());

                progress.set(View.GONE);
                recycler.set(View.VISIBLE);

                setChanged();
                notifyObservers();
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
    }
}