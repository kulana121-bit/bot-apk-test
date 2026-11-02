package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Minimal starter activity - koi AndroidX nahi, sirf framework.
 * Bot se bani asal app apni activities yahan se aage badhayegi.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView label = new TextView(this);
        label.setText(getString(R.string.app_name) + "\nAPK build kaam kar gaya!");
        label.setTextSize(20);
        label.setGravity(Gravity.CENTER);
        setContentView(label);
    }
}
