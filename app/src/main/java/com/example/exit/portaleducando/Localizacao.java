package com.example.exit.portaleducando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Localizacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao);

        ImageButton imgBtnMaps = (ImageButton) findViewById(R.id.imgBtnMaps);
        ImageButton imgBtnMaps2 = (ImageButton) findViewById(R.id.imgBtnMaps2);

        imgBtnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Localizacao.this, MapsActivity.class);
                startActivity(it);
            }
        });

        imgBtnMaps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Localizacao.this, MapsActivity2.class);
                startActivity(it);
            }
        });
    }
}
