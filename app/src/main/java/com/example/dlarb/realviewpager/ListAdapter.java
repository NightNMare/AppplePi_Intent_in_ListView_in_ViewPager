package com.example.dlarb.realviewpager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    ArrayList<Data> items;


    public ListAdapter(ArrayList<Data> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,null);

        TextView title =(TextView) v.findViewById(R.id.title);
        TextView content=(TextView) v.findViewById(R.id.content);

        title.setText(items.get(position).title);
        content.setText(items.get(position).content);

        return v;
    }
}
