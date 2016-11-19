package com.example.exit.portaleducando;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import com.example.exit.portaleducando.Perguntas.PerguntasBiologia;
import com.example.exit.portaleducando.Perguntas.PerguntasFisica;
import com.example.exit.portaleducando.Perguntas.PerguntasGeografia;
import com.example.exit.portaleducando.Perguntas.PerguntasHistoria;
import com.example.exit.portaleducando.Perguntas.PerguntasIngles;
import com.example.exit.portaleducando.Perguntas.PerguntasMatematica;
import com.example.exit.portaleducando.Perguntas.PerguntasPortugues;
import com.example.exit.portaleducando.Perguntas.PerguntasQuimica;

public class QuizActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar barraperfil = getSupportActionBar();
        barraperfil.setSubtitle("Quiz - Desafio");
        barraperfil.setDisplayHomeAsUpEnabled(true);
        barraperfil.show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //chama as activitys referente as perguntas do quiz.
        ImageButton botaoportugues = (ImageButton) findViewById(R.id.botaoPortugues);
        ImageButton botaomatematica = (ImageButton) findViewById(R.id.botaoMatematica);
        ImageButton botaoquimica = (ImageButton) findViewById(R.id.botaoQuimica);
        ImageButton botaoingles = (ImageButton) findViewById(R.id.botaoIngles);
        ImageButton botaohistoria = (ImageButton) findViewById(R.id.botaoHistoria);
        ImageButton botaogeografia = (ImageButton) findViewById(R.id.botaoGeografia);
        ImageButton botaobiologia = (ImageButton) findViewById(R.id.botaoBiologia);
        ImageButton botaofisica = (ImageButton) findViewById(R.id.botaoFisica);

        botaoportugues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(QuizActivity.this, PerguntasPortugues.class);
                startActivity(it);
            }
        });

        botaomatematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(QuizActivity.this, PerguntasMatematica.class);
                startActivity(it);
            }
        });
        botaoquimica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(QuizActivity.this, PerguntasQuimica.class);
                startActivity(it);
            }
        });
        botaoingles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(QuizActivity.this, PerguntasIngles.class);
                startActivity(it);
            }
        });
        botaohistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(QuizActivity.this, PerguntasHistoria.class);
                startActivity(it);
            }
        });
        botaogeografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(QuizActivity.this, PerguntasGeografia.class);
                startActivity(it);
            }
        });
        botaobiologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(QuizActivity.this, PerguntasBiologia.class);
                startActivity(it);
            }
        });
        botaofisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(QuizActivity.this, PerguntasFisica.class);
                startActivity(it);
            }
        });



    }


}
