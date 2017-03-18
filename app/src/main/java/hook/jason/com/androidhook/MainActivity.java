package hook.jason.com.androidhook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import hook.jason.com.androidhook.utils.Log;

/**
 * create by Yin.Jason 17/3/1817:029
 * Email:Jason.Yin365@gmail.com
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(this, "onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        Log.d(this, "onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(this, "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(this, "onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.d(this, "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onAttachedToWindow() {
        Log.d(this, "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        Log.d(this, "onDetachedFromWindow");
        super.onDetachedFromWindow();
    }
}
