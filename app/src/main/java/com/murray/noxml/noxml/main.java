package com.murray.noxml.noxml;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.GridLayout.LayoutParams;

import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by murray on 2014/11/05.
 */
public class main extends Activity {
    String[] colors = new String[] {
            "red",
            "blue",
            "green",
            "purple",



    };
    int[] images = new int[]{
            R.drawable.ic_blue,
            R.drawable.ic_red,
            R.drawable.ic_green,
            R.drawable.ic_purple,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GridView gv = new GridView(this);
        setContent(gv);
        setGVAdapter(gv);


    }
    public void setGVAdapter(GridView gv){

        gv.setAdapter(new MyAdapter(this, colors));
    }
    public void setContent(GridView gv){
        int gvID = 100;
        gv.setId(gvID);
        gv.setLayoutParams(new
                GridView.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        gv.setNumColumns(3);
        gv.setColumnWidth(GridView.AUTO_FIT);
        gv.setVerticalSpacing(5);
        gv.setHorizontalSpacing(5);
        gv.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
        gv.setGravity(Gravity.CENTER);
        setContentView(gv);
    }






}
