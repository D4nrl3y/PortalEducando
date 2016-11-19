package com.example.exit.portaleducando;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.exit.portaleducando.deserialize.NutricionalDes;
import com.example.exit.portaleducando.model.ModelNutricional;
import com.example.exit.portaleducando.util.RestManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Nutricional extends AppCompatActivity {

    private TabLayout nTabLayout;
    private ViewPager nPagerAdapter;
    private RestManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutricional);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mManager = new RestManager();

        Gson gson = new GsonBuilder().registerTypeAdapter(Nutricional.class, new NutricionalDes()).create();
        Call<ModelNutricional> nutri = mManager.getFlowerService(gson).procurarNutricional();
        nutri.enqueue(new Callback<ModelNutricional>() {
            @Override
            public void onResponse(Call<ModelNutricional> call, Response<ModelNutricional> response) {
                if(response.isSuccessful()){
                    ModelNutricional nut = response.body();

                    TextView nomeCardapio = (TextView) findViewById(R.id.nome_cardapio);
                    nomeCardapio.setText(nut.getNome());

                    TextView dtInicio = (TextView) findViewById(R.id.data_inicio_cardapio);
                    dtInicio.setText(nut.getData_inicio());

                    TextView dtFim = (TextView) findViewById(R.id.data_fim_cardapio);
                    dtFim.setText(nut.getData_fim());

                    TextView proteina = (TextView) findViewById(R.id.proteina_cardapio);
                    proteina.setText(nut.getProteinas());

                    TextView acomp = (TextView) findViewById(R.id.acompanhamento_cardapio);
                    acomp.setText(nut.getAcompanhamento());

                    TextView bebidas = (TextView) findViewById(R.id.bebidas_cardapio);
                    bebidas.setText(nut.getBebidas());

                    TextView frutas = (TextView) findViewById(R.id.frutas_cardapio);
                    frutas.setText(nut.getFrutas());
                }
            }

            @Override
            public void onFailure(Call<ModelNutricional> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "ERRO: " + t.getMessage(), Toast.LENGTH_SHORT).show();
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
