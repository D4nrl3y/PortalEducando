package com.example.exit.portaleducando.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.exit.portaleducando.fragments.FragmentAlimento;
import com.example.exit.portaleducando.fragments.FragmentHistorico;
import com.example.exit.portaleducando.fragments.FragmentMedicamento;

/**
 * Created by EXIT on 06/11/2016.
 */

public class FragmentPagerAdapterMedico extends FragmentStatePagerAdapter {

    private String[] medicoTitleTabs;

    public FragmentPagerAdapterMedico(FragmentManager fm, String[] medicoTitleTabs) {
        super(fm);
        this.medicoTitleTabs = medicoTitleTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
            return new FragmentHistorico();
            case 1:
                return new FragmentMedicamento();
            case 2:
                return new FragmentAlimento();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.medicoTitleTabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.medicoTitleTabs[position];
    }
}
