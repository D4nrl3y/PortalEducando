package com.example.exit.portaleducando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Diario extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diario);
        String[] materias = new String[]{"Portugues","Matematica","Quimica","Historia","Fisica","Biologia"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,materias);
        ListView lv = (ListView) findViewById(R.id.listamateria);
        lv.setAdapter(adapter);


    }
    public  class Materia{
        String nome;
        String estadoAtual;
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
