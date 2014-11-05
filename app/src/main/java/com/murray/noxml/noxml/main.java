package com.murray.noxml.noxml;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.GridView;
import android.widget.GridLayout.LayoutParams;

import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
        for(int i=0;i<colors.length;i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("colors", colors[i]);
            hm.put("images", Integer.toString(images[i]));
            aList.add(hm);
        }
        String[] from = { "colors","images"};
        int[] to = { R.id.colors,R.id.images};
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.custom_item, from, to);
        gv.setAdapter(adapter);
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
