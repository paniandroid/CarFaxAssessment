package com.carfax.assignment.data.local.prefs;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreferencesHelper implements PreferencesHelper {

    private static final String PREF_KEY_ASSIGNMENT_RESPONSE = "PREF_KEY_ASSIGNMENT_RESPONSE";

    private final SharedPreferences mPrefs;
    private static AppPreferencesHelper appPreferencesHelper;

    public static AppPreferencesHelper getInstance(Context context) {
        if (appPreferencesHelper == null) {
            appPreferencesHelper = new AppPreferencesHelper(context);
        }
        return appPreferencesHelper;
    }
    private AppPreferencesHelper(Context context) {
        mPrefs = context.getSharedPreferences("prefFileName", Context.MODE_PRIVATE);
    }

    @Override
    public String getLocalAssignmentResponse() {
        return mPrefs.getString(PREF_KEY_ASSIGNMENT_RESPONSE, "{}");
    }

    @Override
    public void setLocalAssignmentResponse(String assignmentResponse) {
        mPrefs.edit().putString(PREF_KEY_ASSIGNMENT_RESPONSE, assignmentResponse).apply();
    }
}
