package co.laiup.sample.touchmechanism;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Ha on 9/17/2015.
 */
public class L {
    public static final String TAG = "Touch Event";
    public static void m(String message) {
        Log.d(TAG, message);
    }

    public static void t(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
