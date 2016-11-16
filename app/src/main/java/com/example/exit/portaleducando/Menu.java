package com.example.exit.portaleducando;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.exit.portaleducando.deserialize.AlunoDes;
import com.example.exit.portaleducando.model.Aluno;
import com.example.exit.portaleducando.util.RestManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Menu extends AppCompatActivity {

    private AlertDialog dialogo;

    private Aluno aluno;
    private RestManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();
        aluno = (Aluno) intent.getSerializableExtra("aluno");

        mManager = new RestManager();

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
                it.putExtra("aluno", aluno);
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
            alerta_logoff();
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
            intentsobre.putExtra("aluno", aluno);
            startActivity(intentsobre);
        }
        else if (item.getItemId() == R.id.agenda){
            Intent intentagenda = new Intent(Menu.this,Agenda.class);
            intentagenda.putExtra("aluno", aluno);
            startActivity(intentagenda);
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

    private void alerta_logoff() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Porta Educando");
        builder.setIcon(R.drawable.sair);
        builder.setMessage("Deseja Realmente sair do Programa?");
        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
             finish();
            }
        });
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        dialogo = builder.create();
        dialogo.show();
    }

}
