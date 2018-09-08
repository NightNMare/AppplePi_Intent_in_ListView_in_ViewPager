package com.example.dlarb.realviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter{

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new OneFragment();
            case 1:return new TwoFragment();
            case 2:return new ThreeFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
