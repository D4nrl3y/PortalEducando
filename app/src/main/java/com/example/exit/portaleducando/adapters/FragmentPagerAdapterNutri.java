package com.example.exit.portaleducando.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.exit.portaleducando.fragments.FragmentSegunda;
import com.example.exit.portaleducando.fragments.FragmentSexta;
import com.example.exit.portaleducando.fragments.FragmentTerca;
import com.example.exit.portaleducando.fragments.FragmentsQuinta;
import com.example.exit.portaleducando.fragments.FramentsQuarta;

/**
 * Created by EXIT on 06/11/2016.
 */

public class FragmentPagerAdapterNutri extends FragmentStatePagerAdapter {

    private String[] nutriTitleTabs;

    public FragmentPagerAdapterNutri(FragmentManager fm, String[] nutriTitleTabs) {
        super(fm);
        this.nutriTitleTabs = nutriTitleTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentSegunda();
            case 1:
                return new FragmentTerca();
            case 2:
                return new FramentsQuarta();
            case 3:
                return new FragmentsQuinta();
            case 4:
                return new FragmentSexta();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.nutriTitleTabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.nutriTitleTabs[position];
    }
}
