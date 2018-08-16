package com.example.coolweather.util;

import android.util.Log;

public class LogUtil {
    private static final int VERBOSE=1;
    private static final int DEBUG=2;
    private static final int INFO=3;
    private static final int WARN=4;
    private static final int ERROR=5;
    private static final int NOTHING=6;
    private static int level =VERBOSE;

    public static void v(String msg){
        if(level<=VERBOSE){
            Log.v("Hello",msg);
        }
    }
    public static void d(String msg){
        if(level<=DEBUG){
            Log.d("Hello",msg);
        }
    }
    public static void i(String msg){
        if(level<=INFO){
            Log.i("Hello",msg);
        }
    }
    public static void w(String msg){
        if(level<=WARN){
            Log.w("Hello",msg);
        }
    }
    public static void e(String tag,String msg){
        if(level<=ERROR){
            Log.e(tag,msg);
        }
    }
}
