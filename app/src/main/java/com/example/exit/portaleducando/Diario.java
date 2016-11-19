package com.example.exit.portaleducando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class Diario extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diario);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView pt = (TextView) findViewById(R.id.disciplina_portugues);
        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Diario.this, DadosNotas.class);
                i.putExtra("disciplina", "7");
                startActivity(i);
            }
        });

        TextView pt2 = (TextView) findViewById(R.id.disciplina_matematica);
        pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Diario.this, DadosNotas.class);
                i.putExtra("disciplina", "8");
                startActivity(i);
            }
        });

        TextView pt3 = (TextView) findViewById(R.id.disciplina_geografia);
        pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Diario.this, DadosNotas.class);
                i.putExtra("disciplina", "10");
                startActivity(i);
            }
        });

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
