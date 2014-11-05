package com.murray.noxml.noxml;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by murray on 2014/11/05.
 */
public class main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello world");
        setContentView(tv);

    }
}
