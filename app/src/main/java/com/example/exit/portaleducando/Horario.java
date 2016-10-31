package com.example.exit.portaleducando;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Horario extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);
        ActionBar barraHorario = getSupportActionBar();
        barraHorario.setDisplayHomeAsUpEnabled(true);
        barraHorario.show();


        TextView labelAno = (TextView)findViewById(R.id.labelAno);
        TextView labelMes = (TextView)findViewById(R.id.labelMes);
        TextView labelNomeDia = (TextView)findViewById(R.id.labelNomeDia);
        TextView labelNumeroDia = (TextView)findViewById(R.id.labelNumeroDia);

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat data = new SimpleDateFormat("yyyy/MMMM/d/E", Locale.getDefault());
        String stringData = data.format(cal.getTime());

        String[] valores = stringData.split("/",0);
//CHECAR VALORES DA DATA
//        for(int i=0; i < valores.length;i++){
//            Log.v("checar Valor", valores[i]);
//        }
        labelAno.setText(valores[0]);
        labelMes.setText(valores[1]);
        labelNumeroDia.setText(valores[2]);
        labelNomeDia.setText(valores[3]);


    }
}
