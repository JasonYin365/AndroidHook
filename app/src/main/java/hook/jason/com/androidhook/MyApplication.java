package hook.jason.com.androidhook;

import android.app.Application;

import hook.jason.com.androidhook.utils.Log;

/**
 * Created by Yin.Jason on 17/3/18.
 * Email:Jason.Yin365@gmail.com
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        try {
            Log.d(this, " onCreate starting init");
            HookManager.init();
            HookManager.injectInstrumentation();
        } catch (Exception e) {
            Log.d(this, " onCreate e:" + e.toString());
        }
        super.onCreate();
    }
}
