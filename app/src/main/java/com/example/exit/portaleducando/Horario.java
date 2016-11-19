package com.example.exit.portaleducando;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.exit.portaleducando.adapters.FragmentPagerAdapterHorario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Horario extends AppCompatActivity {

    private TabLayout hTabLayout;
    private ViewPager hPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar barraHorario = getSupportActionBar();
        barraHorario.setSubtitle("Acomp.Horario de Aula");
        barraHorario.setDisplayHomeAsUpEnabled(true);
        barraHorario.show();

        hTabLayout =(TabLayout) findViewById(R.id.tab_horario);
        hPagerAdapter =(ViewPager) findViewById(R.id.pager_horario);

        hPagerAdapter.setAdapter(new FragmentPagerAdapterHorario(getSupportFragmentManager(),getResources().getStringArray(R.array.title_tab_horarios)));
        hTabLayout.setupWithViewPager(hPagerAdapter);;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        if(menuItem.getItemId() == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}
