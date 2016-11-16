package com.example.exit.portaleducando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.exit.portaleducando.deserialize.NotasDes;
import com.example.exit.portaleducando.deserialize.NutricionalDes;
import com.example.exit.portaleducando.model.Notas;
import com.example.exit.portaleducando.util.RestManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DadosNotas extends AppCompatActivity {

    private RestManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_notas);

        Intent i = getIntent();
        String parametroNomeUsuario = i.getStringExtra("disciplina");
        int id = Integer.parseInt(parametroNomeUsuario);

        mManager = new RestManager();
        Gson gson = new GsonBuilder().registerTypeAdapter(Notas.class, new NotasDes()).create();
        Call<Notas> dadosNotas = mManager.getFlowerService(gson).procurarDadosDisciplina(id);
        dadosNotas.enqueue(new Callback<Notas>() {
            @Override
            public void onResponse(Call<Notas> call, Response<Notas> response) {
                if(response.isSuccessful()){
                    Notas notas = response.body();

                    TextView disciplina = (TextView) findViewById(R.id.nome_disciplina);
                    disciplina.setText(notas.getDisciplina().getNome());

                    TextView professor = (TextView) findViewById(R.id.nome_professor);
                    professor.setText(notas.getProfessor().getNome());

                    TextView faltas = (TextView) findViewById(R.id.faltas);
                    faltas.setText(notas.getFaltas());

                    TextView n1 = (TextView) findViewById(R.id.nota1);
                    String nota1 = String.valueOf(notas.getNota1());
                    n1.setText(nota1);

                    TextView n2 = (TextView) findViewById(R.id.nota2);
                    String nota2 = String.valueOf(notas.getNota2());
                    n2.setText(nota2);

                    TextView n3 = (TextView) findViewById(R.id.nota3);
                    String nota3 = String.valueOf(notas.getNota3());
                    n3.setText(nota3);

                    TextView n4 = (TextView) findViewById(R.id.nota4);
                    String nota4 = String.valueOf(notas.getNota4());
                    n4.setText(nota4);

                    TextView me = (TextView) findViewById(R.id.media);
                    String media = String.valueOf(notas.getMedia());
                    me.setText(media);
                }
            }

            @Override
            public void onFailure(Call<Notas> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "ERRO: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
