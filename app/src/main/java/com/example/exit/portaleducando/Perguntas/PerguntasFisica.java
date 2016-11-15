package com.example.exit.portaleducando.Perguntas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.exit.portaleducando.R;

public class PerguntasFisica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas_fisica);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("Perguntas - Fisica");
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();
    }
}
