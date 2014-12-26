package com.epam.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i("activity-lifecycle","onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("activity-lifecycle","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("activity-lifecycle","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("activity-lifecycle","onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activity-lifecycle","onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("activity-lifecycle","onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("activity-lifecycle","onDestroy");
    }

}
