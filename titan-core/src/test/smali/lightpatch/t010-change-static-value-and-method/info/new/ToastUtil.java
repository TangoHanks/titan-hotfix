package com.baidu.titan.sample;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by shanghuibo on 18-1-18.
 */

public class ToastUtil extends ToastDad {

    private Context mContext;

    private String tag = "hello";

    public final String toastStr;

    public static final int A = 3;

    public static int b = 6;

    public static final long startTime = System.currentTimeMillis();

    public static boolean debug = true;

    public long updateTime;

    public ToastUtil(Context context, int i) {

        super(i + 1);
        mContext = context;
        toastStr = "test";
        Log.d("ToastUtil", "what's up guy");
    }


    public static void showToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        Log.d("ToastUtil", "showToast " + text + " " +  startTime + " --->" + b);


    }

    public void logInt(int value) {
        switch (value) {
            case 100:
                Log.d("ToastUtil", "100");
                break;
            case 200:
                Log.d("ToastUtil", "200");
                break;
            default:
                Log.d("ToastUtil", String.valueOf(value));
                break;
        }
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;


    }
}
