package com.example.exit.portaleducando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Diario extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diario);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_diario, menu);
        return true;
    }
    public boolean onCreateOptionsMenu(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.sair){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
