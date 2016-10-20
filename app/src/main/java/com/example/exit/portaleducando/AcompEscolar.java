package com.example.exit.portaleducando;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class AcompEscolar extends AppCompatActivity {
    ImageButton selecbarra;
    ImageButton selecpizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acomp_escolar);

        selecbarra = (ImageButton) findViewById(R.id.selecbarra);
        selecpizza = (ImageButton) findViewById(R.id.selecpizza);

             selecbarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new FragmentBarra()).commit();
            }
        });

        selecpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new FragmentPizza()).commit();
            }
        });
    }

}
