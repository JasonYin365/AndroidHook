package hook.jason.com.androidhook.utils;

/**
 * Created by Yin.Jason on 17/3/18.
 * Email:Jason.Yin365@gmail.com
 */

public class Log {
    private static final String TAG = "AndroidHook";

    public static void d(Object obj, String msg) {
        android.util.Log.d(TAG, obj.getClass().getSimpleName() + " : " + msg);
    }

    public static void i(Object obj, String msg) {
        android.util.Log.i(TAG, obj.getClass().getSimpleName() + " : " + msg);
    }

    public static void e(Object obj, String msg) {
        android.util.Log.e(TAG, obj.getClass().getSimpleName() + " : " + msg);
    }

    public static void w(Object obj, String msg) {
        android.util.Log.w(TAG, obj.getClass().getSimpleName() + " : " + msg);
    }
}