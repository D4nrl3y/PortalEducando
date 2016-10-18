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




        ImageButton botaon = (ImageButton) findViewById(R.id.botaoalimentar);
        botaon.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intetnutricional = new Intent (Menu.this,Horario.class);
                startActivity(intetnutricional);
            }
        });

        ImageButton botaoh = (ImageButton) findViewById(R.id.botaohorario);
        botaoh.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                Intent intent = new Intent(Menu.this,Horario.class);
                startActivity(intent);
            }
        });
        ImageButton botaoMedico = (ImageButton) findViewById(R.id.botaom);
        botaoMedico.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intentmedico = new Intent(Menu.this,AcompMedico.class);
                startActivity(intentmedico);
            }
        });
        ImageButton botaoEscolar = (ImageButton) findViewById(R.id.botaoacompedu);
        botaoEscolar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intentescolar = new Intent(Menu.this,AcompEscolar.class);
                startActivity(intentescolar);
            }
        });
        ImageButton botaoDiario = (ImageButton) findViewById(R.id.botaodiario);
        botaoDiario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentdiario = new Intent (Menu.this,Diario.class);
                startActivity(intentdiario);
            }
        });
        ImageButton botaoLocal = (ImageButton) findViewById(R.id.botaolocalizacao);
        botaoLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentlocalizacao = new Intent(Menu.this,Localizacao.class);
                startActivity(intentlocalizacao);
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
            Toast.makeText(this, "Tela em desemvolvimento", Toast.LENGTH_SHORT).show();
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
        return super.onOptionsItemSelected(item);
    }

}
