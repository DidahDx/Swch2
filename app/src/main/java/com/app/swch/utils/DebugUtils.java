package com.app.swch.utils;

import android.util.Log;

import com.app.swch.BuildConfig;


/* renamed from: ke.swch.utils.DebugUtils */
public class DebugUtils {
    public static void doLog(Object theClass, Object theLogMessage) {
        if (BuildConfig.DEBUG) {
            Log.d(BuildConfig.APPLICATION_ID, String.format("%s: %s", new Object[]{theClass.toString(), theLogMessage.toString()}));
        }
    }
}
