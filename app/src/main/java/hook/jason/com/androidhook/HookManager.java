package hook.jason.com.androidhook;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import hook.jason.com.androidhook.utils.Log;

/**
 * Created by Yin.Jason on 17/3/18.
 * Email:Jason.Yin365@gmail.com
 */

public class HookManager {
    static Object activityThreadInstance;

    public static void init() throws ClassNotFoundException,
            NoSuchMethodException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Class<?> activityThread = Class.forName("android.app.ActivityThread");
        Method currentActivityThread = activityThread
                .getDeclaredMethod("currentActivityThread");
        activityThreadInstance = currentActivityThread.invoke(null);
    }

    public static void injectInstrumentation() throws NoSuchFieldException,
            IllegalAccessException, IllegalArgumentException {
        Log.i(HookManager.class, " start injectInstrumentation");
        Field field_instrumentation = activityThreadInstance.getClass()
                .getDeclaredField("mInstrumentation");
        field_instrumentation.setAccessible(true);
        InstrumentationHook instrumentationHook = new InstrumentationHook();
        field_instrumentation.set(activityThreadInstance, instrumentationHook);
    }
}
