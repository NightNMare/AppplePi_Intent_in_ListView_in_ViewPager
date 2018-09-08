package com.example.dlarb.realviewpager;



import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TwoFragment extends android.support.v4.app.Fragment {
    ArrayList<Data> items = new ArrayList<>();
    ListAdapter mAdapter;
    ListView list;
    public TwoFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment2, null);

        list = v.findViewById(R.id.list2);
        mAdapter = new com.example.dlarb.realviewpager.ListAdapter(items);
        list.setAdapter(mAdapter);

        items.add(new Data("2a1","2a2"));
        items.add(new Data("2b1","2b2"));
        items.add(new Data("2c1","2c2"));
        items.add(new Data("2d1","2d2"));
        items.add(new Data("2e1","2e2"));
        items.add(new Data("2f1","2f2"));
        items.add(new Data("2g1","2g2"));
        items.add(new Data("2h1","2h2"));
        items.add(new Data("2i1","2i2"));
        mAdapter.notifyDataSetChanged();
        return v;
    }
}
