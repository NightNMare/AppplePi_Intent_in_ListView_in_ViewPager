package com.example.dlarb.realviewpager;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class OneFragment extends android.support.v4.app.Fragment {

    ArrayList<Data> items = new ArrayList<>();
    ListAdapter mAdapter;
    ListView list;
    public OneFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment1, null);

        list = v.findViewById(R.id.list1);
        mAdapter = new com.example.dlarb.realviewpager.ListAdapter(items);
        list.setAdapter(mAdapter);

        items.add(new Data("1a1","1a2"));
        items.add(new Data("1b1","1b2"));
        items.add(new Data("1c1","1c2"));
        items.add(new Data("1d1","1d2"));
        items.add(new Data("1e1","1e2"));
        items.add(new Data("1f1","1f2"));
        items.add(new Data("1g1","1g2"));
        items.add(new Data("1h1","1h2"));
        items.add(new Data("1i1","1i2"));
        mAdapter.notifyDataSetChanged();
        return v;
    }
}
