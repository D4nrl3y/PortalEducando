package com.example.exit.portaleducando.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.exit.portaleducando.R;
import com.example.exit.portaleducando.deserialize.AlunoDes;
import com.example.exit.portaleducando.deserialize.HospitalarDes;
import com.example.exit.portaleducando.model.Aluno;
import com.example.exit.portaleducando.model.Hospitalar;
import com.example.exit.portaleducando.util.RestManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by EXIT on 06/11/2016.
 */

public class FragmentMedicamento extends Fragment {

    private View view;
    private RestManager mManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_medicamentos,container,false);

        mManager = new RestManager();

        TextView tv = (TextView) getActivity().findViewById(R.id.id_user);
        String msg = tv.getText().toString();

        if(!msg.isEmpty()) {
            int id = Integer.parseInt(msg);

                Gson gson = new GsonBuilder().registerTypeAdapter(Hospitalar.class, new HospitalarDes()).create();
                Call<Hospitalar> dadosAlunoMedico = mManager.getFlowerService(gson).procurarHospitalar(id);
                dadosAlunoMedico.enqueue(new Callback<Hospitalar>() {
                    @Override
                    public void onResponse(Call<Hospitalar> call, Response<Hospitalar> response) {
                        if(response.isSuccessful()){
                            Hospitalar hospitalar = response.body();

                            TextView tvMedicamento1 = (TextView) view.findViewById(R.id.medicamento1);
                            tvMedicamento1.setText(hospitalar.getMedicamentos1());

                            TextView tvMedicamento2 = (TextView) view.findViewById(R.id.medicamento2);
                            tvMedicamento2.setText(hospitalar.getMedicamentos2());

                            TextView tvMedicamento3 = (TextView) view.findViewById(R.id.medicamento3);
                            tvMedicamento3.setText(hospitalar.getMedicamentos3());
                        }
                    }

                    @Override
                    public void onFailure(Call<Hospitalar> call, Throwable t) {
                        Toast.makeText(getContext(), "ERRO: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        }

        return view;
    }
}
