package com.example.exit.portaleducando;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.exit.portaleducando.adapters.FragmentPagerAdapterMedico;
import com.example.exit.portaleducando.model.Aluno;

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

        //Buscando os dados do aluno

        Intent intent = getIntent();
        Aluno aluno = (Aluno) intent.getSerializableExtra("aluno");

        if(aluno != null){
            int id = aluno.getId();

            String id_user = String.valueOf(id);

            TextView tv = (TextView) findViewById(R.id.id_user);
            tv.setText(id_user);
        }


    }
}
