package com.example.exit.portaleducando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.exit.portaleducando.model.Aluno;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //DADOS PESSOAIS ALUNO
        TextView tvNome = (TextView) findViewById(R.id.nome_aluno_pefil);
        TextView tvSexo = (TextView) findViewById(R.id.sexo_aluno_pefil);
        TextView tvDataNasc = (TextView) findViewById(R.id.data_nas_aluno_pefil);
        TextView tvCpf = (TextView) findViewById(R.id.cpf_aluno_pefil);
        TextView tvTelefone = (TextView) findViewById(R.id.telefone_aluno_pefil);
        TextView tvLogin = (TextView) findViewById(R.id.login_aluno_pefil);

        //DADOS ENDERECO ALUNO
        TextView tvRua = (TextView) findViewById(R.id.rua_aluno_pefil);
        TextView tvNumero = (TextView) findViewById(R.id.numero_aluno_perfil);
        TextView tvCep = (TextView) findViewById(R.id.cep_aluno_pefil);
        TextView tvCidade = (TextView) findViewById(R.id.cidade_aluno_pefil);
        TextView tvEstado = (TextView) findViewById(R.id.estado_aluno_pefil);
        TextView tvBairro = (TextView) findViewById(R.id.bairro_aluno_pefil);

        Intent intent = getIntent();
        Aluno aluno = (Aluno) intent.getSerializableExtra("aluno");

        if(aluno != null){
            tvNome.setText(aluno.getNome());
            tvSexo.setText(aluno.getSexo());
            tvDataNasc.setText(aluno.getData_nascimento());
            tvCpf.setText(aluno.getCpf());
            tvTelefone.setText(aluno.getTelefone());
            tvLogin.setText(aluno.getLogin());
            tvRua.setText(aluno.getEndereco().getRua());
            tvNumero.setText(aluno.getEndereco().getNumero());
            tvCep.setText(aluno.getEndereco().getCep());
            tvCidade.setText(aluno.getEndereco().getCidade());
            tvEstado.setText(aluno.getEndereco().getEstado());
            tvBairro.setText(aluno.getEndereco().getBairro());
        }
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
