package com.example.dlarb.realviewpager;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ThreeFragment extends android.support.v4.app.Fragment {
    ArrayList<Data> items = new ArrayList<>();
    ListAdapter mAdapter;
    ListView list;

    public ThreeFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment3, null);
        list = v.findViewById(R.id.list3);
        mAdapter = new com.example.dlarb.realviewpager.ListAdapter(items);
        list.setAdapter(mAdapter);

        items.add(new Data("3a1", "3a2"));
        items.add(new Data("3b1", "3b2"));
        items.add(new Data("3c1", "3c2"));
        items.add(new Data("3d1", "3d2"));
        items.add(new Data("3e1", "3e2"));
        items.add(new Data("3f1", "3f2"));
        items.add(new Data("3g1", "3g2"));
        items.add(new Data("3h1", "3h2"));
        items.add(new Data("3i1", "3i2"));
        mAdapter.notifyDataSetChanged();
        return v;

    }
}
