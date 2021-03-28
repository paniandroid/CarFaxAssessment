package com.carfax.assignment;

import android.app.Application;

import com.carfax.assignment.data.AppDataManager;
import com.carfax.assignment.data.local.prefs.AppPreferencesHelper;
import com.carfax.assignment.data.local.prefs.PreferencesHelper;
import com.carfax.assignment.data.remote.ApiClient;
import com.carfax.assignment.data.remote.ApiService;
import com.google.gson.Gson;

public class CarFaxApp extends Application {

    private static AppDataManager appDataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        ApiService apiHelper = ApiClient.getClient().create(ApiService.class);
        PreferencesHelper prefsHelper = AppPreferencesHelper.getInstance(this);
        Gson gson = new Gson();


        appDataManager = new AppDataManager(this, prefsHelper, apiHelper, gson);
    }

    public static AppDataManager getDataManager() {
        return appDataManager;
    }
}
