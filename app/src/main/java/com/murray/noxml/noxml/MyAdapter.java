package com.murray.noxml.noxml;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by murray on 2014/11/05.
 */
public class MyAdapter extends ArrayAdapter<String> {
Context c;
    public MyAdapter(Context context, String[] strings) {

        super(context, -1, -1, strings);
        c= context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LinearLayout listLayout = new LinearLayout(c);
        listLayout.setLayoutParams(new AbsListView.LayoutParams(
                AbsListView.LayoutParams.WRAP_CONTENT,
                AbsListView.LayoutParams.WRAP_CONTENT));
        listLayout.setId(5000);

        TextView listText = new TextView(c);
        listText.setId(5001);

        ImageView imgView = new ImageView(c);
        listText.setId(5002);

        listLayout.addView(listText);
        listLayout.addView(imgView);

        listText.setText(super.getItem(position));
        Drawable background;
        switch (position){

            case 0:
                imgView.setBackgroundResource(R.drawable.ic_red);
                break;
            case 1:
                imgView.setBackgroundResource(R.drawable.ic_blue);
                break;
            case 2:
                imgView.setBackgroundResource(R.drawable.ic_green);
                break;
            case 3:
                imgView.setBackgroundResource(R.drawable.ic_purple);
                break;

        }

        return listLayout;
    }
}