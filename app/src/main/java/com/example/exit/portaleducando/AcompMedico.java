package com.example.exit.portaleducando;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.exit.portaleducando.adapters.FragmentPagerAdapterMedico;

public class AcompMedico extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mPageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acomp_medico);

        mTabLayout = (TabLayout) findViewById(R.id.tab_medico);
        mPageAdapter = (ViewPager) findViewById(R.id.pager_medico);

        mPageAdapter.setAdapter(new FragmentPagerAdapterMedico(getSupportFragmentManager(),getResources().getStringArray(R.array.title_tab_medico)));
        mTabLayout.setupWithViewPager(mPageAdapter);

    }
}
