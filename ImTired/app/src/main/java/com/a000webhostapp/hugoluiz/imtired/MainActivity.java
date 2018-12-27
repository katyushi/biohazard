package com.a000webhostapp.hugoluiz.imtired;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void topic1(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Topic1Activity.class);
        startActivity(intent);
    }

    public void topic2(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Topic2Activity.class);
        startActivity(intent);
    }

    public void topic3(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Topic3Activity.class);
        startActivity(intent);
    }

    public void topic4(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Topic4Activity.class);
        startActivity(intent);
    }

    public void topic5(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Topic5Activity.class);
        startActivity(intent);
    }

    public void topic6(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Topic6Activity.class);
        startActivity(intent);
    }

    public void topic7(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Topic7Activity.class);
        startActivity(intent);
    }

    public void topic8(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, Topic8Activity.class);
        startActivity(intent);
    }

    public void about(View view) {
        Log.d(LOG_TAG, "Button Clicked!");
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

}
