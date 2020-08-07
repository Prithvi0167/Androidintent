package com.example.intentapplication;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class Myintentservice extends IntentService {
    private static final String TAG="package com.example.intentapplication";

    public Myintentservice() {
        super("Myintentservice");

    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG,"The service started");
    }
}
