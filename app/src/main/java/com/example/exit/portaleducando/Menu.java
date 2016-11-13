package com.example.exit.portaleducando;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle(R.string.sub_titulo);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();

        ImageButton botaoescolar = (ImageButton) findViewById(R.id.botaoescolar);
        ImageButton botaoalimentar = (ImageButton) findViewById(R.id.botaoalimentar);
        ImageButton botaomedico = (ImageButton) findViewById(R.id.botaomedico);
        ImageButton botaolocalizacao = (ImageButton) findViewById(R.id.botaolocalizacao);
        ImageButton botaodiario = (ImageButton) findViewById(R.id.botaodiario);
        ImageButton botaohorario = (ImageButton) findViewById(R.id.botaohorario);

        botaoalimentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Nutricional.class);
                startActivity(it);
            }
        });

        botaomedico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, AcompMedico.class);
                startActivity(it);
            }
        });

        botaoescolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, AcompEscolar.class);
                startActivity(it);
            }
        });

        botaolocalizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Localizacao.class);
                startActivity(it);
            }
        });

        botaodiario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Diario.class);
                startActivity(it);
            }
        });

        botaohorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, Horario.class);
                startActivity(it);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()== R.id.sair) {
            finish();
            return true;
        }
        else if(item.getItemId() == R.id.sobre){
                Intent intentsobre = new Intent(Menu.this,Sobre.class);
                startActivity(intentsobre);
//            Toast.makeText(this, "chamar o sobre", Toast.LENGTH_SHORT).show();
        }
        else  if (item.getItemId() == R.id.ajuda){
               Intent intentajuda = new Intent(Menu.this,AjudaActivity.class);
               startActivity(intentajuda);
        }
        else if (item.getItemId() == R.id.perfil){
            Intent intentsobre = new Intent(Menu.this,Perfil.class);
            startActivity(intentsobre);
        }
        else if(item.getItemId() == R.id.contatenos){

            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "portal@gmail.com");
            sendIntent.setType("text/plain");

            if (sendIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(sendIntent);
            }
        }
        else if(item.getItemId() == R.id.quiz){
            Intent intentquiz = new Intent(Menu.this,QuizActivity.class);
            startActivity(intentquiz);

        }
        return super.onOptionsItemSelected(item);
    }

}
