package com.example.exit.portaleducando.util;

import android.provider.SyncStateContract;

import com.example.exit.portaleducando.api.Services;
import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Allef on 12/11/2016.
 */

public class RestManager {

    private Services mService;

    public Services getFlowerService(Gson gson) {
        if (mService == null) {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Config.BaseUrl.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            mService = retrofit.create(Services.class);
        }
        return mService;
    }
}
