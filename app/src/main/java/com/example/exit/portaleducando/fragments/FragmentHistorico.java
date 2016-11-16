package com.example.exit.portaleducando.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.exit.portaleducando.R;
import com.example.exit.portaleducando.api.Services;
import com.example.exit.portaleducando.deserialize.AlunoDes;
import com.example.exit.portaleducando.model.Aluno;
import com.example.exit.portaleducando.model.Hospitalar;
import com.example.exit.portaleducando.util.Config;
import com.example.exit.portaleducando.util.RestManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by EXIT on 06/11/2016.
 */

public class FragmentHistorico extends Fragment {

    private View view;
    private RestManager mManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_historico,container,false);

        mManager = new RestManager();

        TextView tv = (TextView) getActivity().findViewById(R.id.id_user);
        String msg = tv.getText().toString();
        if(!msg.isEmpty()){
            int id = Integer.parseInt(msg);

            //CONSULTA PARA PEGAR OS DADOS DO ALUNO E SEU REPONSÁVEL
            Gson gson = new GsonBuilder().registerTypeAdapter(Aluno.class, new AlunoDes()).create();
            Call<Aluno> dadosAluno = mManager.getFlowerService(gson).visualizarAluno(id);
            dadosAluno.enqueue(new Callback<Aluno>() {
                @Override
                public void onResponse(Call<Aluno> call, Response<Aluno> response) {
                    if (response.isSuccessful()) {
                        Aluno a = response.body();
                        //Dados do aluno
                        TextView tvNome = (TextView) view.findViewById(R.id.nome_aluno_medico);
                        tvNome.setText(a.getNome());

                        TextView tvTel = (TextView) view.findViewById(R.id.telefone_aluno_medico);
                        tvTel.setText(a.getTelefone());

                        //Dados Responsável
                        TextView tvNomeResp = (TextView) view.findViewById(R.id.nome_pai_aluno_medico);
                        tvNomeResp.setText(a.getResponsavel().getNome());
                        TextView tvLoginResp = (TextView) view.findViewById(R.id.login_responsavel_aluno_medico);
                        tvLoginResp.setText(a.getResponsavel().getLogin());
                        TextView tvTelResp = (TextView) view.findViewById(R.id.tel_aluno_medico);
                        tvTelResp.setText(a.getResponsavel().getTelefone());
                    }
                }

                @Override
                public void onFailure(Call<Aluno> call, Throwable t) {
                    Toast.makeText(getContext(), "ERRO: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });

            Call<Hospitalar> dadosAlunoMedico = mManager.getFlowerService(gson).procurarHospitalar(id);
            dadosAlunoMedico.enqueue(new Callback<Hospitalar>() {
                @Override
                public void onResponse(Call<Hospitalar> call, Response<Hospitalar> response) {
                    if (response.isSuccessful()) {
                        Hospitalar hospitalar = response.body();

                        TextView tvSus = (TextView) view.findViewById(R.id.sus_aluno_medico);
                        tvSus.setText(hospitalar.getCartao_sus());

                        TextView tvEmpPlano = (TextView) view.findViewById(R.id.plano_aluno_medico);
                        tvEmpPlano.setText(hospitalar.getEmpresa());

                        TextView tvNumPlano = (TextView) view.findViewById(R.id.numero_plano_aluno_medico);
                        tvNumPlano.setText(hospitalar.getCod_cartao());

                        TextView tvAcess = (TextView) view.findViewById(R.id.acess_aluno);
                        tvAcess.setText(hospitalar.getAcessibilidade());

                        TextView tvAtestado = (TextView) view.findViewById(R.id.atestado_aluno_medico);
                        tvAtestado.setText(hospitalar.getUltimo_atestado());
                    }
                }

                @Override
                public void onFailure(Call<Hospitalar> call, Throwable t) {
                    Toast.makeText(getContext(), "ERRO: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
        return (view);
    }
}
