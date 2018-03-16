package com.example.stv.logutil;

import android.util.Log;

/**
 * Created by Steva on 16/03/2018.
 */

public class LogDebug {

    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
