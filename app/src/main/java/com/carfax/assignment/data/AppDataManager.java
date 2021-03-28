package com.carfax.assignment.data;

import android.content.Context;

import com.carfax.assignment.data.local.prefs.PreferencesHelper;
import com.carfax.assignment.data.remote.ApiService;
import com.carfax.assignment.data.utils.NetworkUtils;
import com.carfax.assignment.model.AssignmentResponse;
import com.google.gson.Gson;

import org.reactivestreams.Publisher;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

public class AppDataManager implements DataManager {

    private static final String TAG = "AppDataManager";

    private final ApiService mApiHelper;

    private final Context mContext;

    private final Gson mGson;

    private final PreferencesHelper mPreferencesHelper;

    public AppDataManager(Context context, PreferencesHelper preferencesHelper, ApiService apiHelper, Gson gson) {
        mContext = context;
        mPreferencesHelper = preferencesHelper;
        mApiHelper = apiHelper;
        mGson = gson;
    }

    @Override
    public Single<AssignmentResponse> getAssignmentResponse() {
        if (!NetworkUtils.isNetworkConnected(mContext)) {
            return Single.just(mGson.fromJson(mPreferencesHelper.getLocalAssignmentResponse(), AssignmentResponse.class));
        }
        Single<AssignmentResponse> assignmentResponse = mApiHelper.getAssignmentResponse();
        assignmentResponse.toObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(it -> setLocalAssignmentResponse(mGson.toJson(it)));
        return assignmentResponse;
    }

    @Override
    public String getLocalAssignmentResponse() {
        return mPreferencesHelper.getLocalAssignmentResponse();
    }

    @Override
    public void setLocalAssignmentResponse(String assignmentResponse) {
        mPreferencesHelper.setLocalAssignmentResponse(assignmentResponse);
    }
}
