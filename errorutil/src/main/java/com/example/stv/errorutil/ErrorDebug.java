package com.example.stv.errorutil;

import android.util.Log;

/**
 * Created by Steva on 16/03/2018.
 */

public class ErrorDebug {
    private static final String TAG = "SUPER_AWESOME_APP";

    public static void e(String message) {
        Log.e(TAG, message);
    }
}


