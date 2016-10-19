package com.example.exit.portaleducando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AcompEscolar extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acomp_escolar);

        ImageButton selecbarra = (ImageButton) findViewById(R.id.selecbarra);
        ImageButton selecpizza = (ImageButton) findViewById(R.id.selecpizza);
        selecbarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().add(R.id.container, new GraficoBarra()).commit();
            }
        });

        selecpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().add(R.id.container, new GraficoPizza()).commit();
            }
        });
    }

}
