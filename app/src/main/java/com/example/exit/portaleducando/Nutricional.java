package com.example.exit.portaleducando;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.exit.portaleducando.adapters.FragmentPagerAdapterNutri;

public class Nutricional extends AppCompatActivity {

    private TabLayout nTabLayout;
    private ViewPager nPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutricional);


        nTabLayout = (TabLayout) findViewById(R.id.tab_nutricao);
        nPagerAdapter = (ViewPager)findViewById(R.id.pager_nutri);

        nPagerAdapter.setAdapter(new FragmentPagerAdapterNutri(getSupportFragmentManager(),getResources().getStringArray(R.array.title_tab_nutri)));
        nTabLayout.setupWithViewPager(nPagerAdapter);
    }
}
