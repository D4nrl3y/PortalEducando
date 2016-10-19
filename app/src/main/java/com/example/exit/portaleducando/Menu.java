package com.example.exit.portaleducando;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle(R.string.sub_titulo);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();

        ImageButton botaoescolar = (ImageButton) findViewById(R.id.botaoescolar);
        botaoescolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this, AcompEscolar.class);
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
            finish();
            return true;
        }
        else if(item.getItemId() == R.id.sobre){
                Intent intentsobre = new Intent(Menu.this,Sobre.class);
                startActivity(intentsobre);
//            Toast.makeText(this, "chamar o sobre", Toast.LENGTH_SHORT).show();
        }
        else  if (item.getItemId() == R.id.ajuda){
            Toast.makeText(this, "Tela em desemvolvimento", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.perfil){
            Intent intentsobre = new Intent(Menu.this,Perfil.class);
            startActivity(intentsobre);
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
        return super.onOptionsItemSelected(item);
    }

}
