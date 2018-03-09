package com.example.xyzreader.remote;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import com.example.xyzreader.R;

public  class Utility
{
    public static boolean isConnected(Context ctx)
    {
        ConnectivityManager cm = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        boolean isConnected = networkInfo != null && networkInfo.isConnectedOrConnecting();

        if (!isConnected) {
            Log.d("network", ctx.getString(R.string.no_internet_connection));
        }

        return isConnected;
    }
}