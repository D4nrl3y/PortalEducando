package com.example.exit.portaleducando;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AjudaActivity extends AppCompatActivity {
    private List<String> listGroup;
    private HashMap<String, List<String>> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("Central de Ajuda");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();

        buildList();

        ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListView.setAdapter( new ExpandableAdapter(AjudaActivity.this,listGroup,listData));

        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                return false;
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                return false;
            }
        });
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {

            }
        });
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int i) {

            }
        });




    }
    public void buildList(){
        listGroup = new ArrayList<String>();
        listData = new HashMap<String, List<String>>();

        //ADICIONAR GRUPO
        listGroup.add("PPROBLEMAS COM O SISTEMA");
        listGroup.add("NÃO CONSIGO VER MINHAS NOTAS");
        listGroup.add("ACOMPANHAMENTO NUTRICIONAL");
        listGroup.add("ACOMPANHAMENTO HOSPITALAR");
        listGroup.add("ACOMPANHAMENTO ESCOLAR");

        //ADICIONAR ITEM
        List<String> auxiliar = new ArrayList<String>();
        auxiliar.add("Caso encontre algum problema no PortaEducando:  " +
                "Favor Entrar em contato com a equipe de suporte. \n" +
                "Email: portaeducando@gmail.com");
        auxiliar.add("Estou Matriculado na Turma Errada: \n" +
                "Passo 1: Entrar em Contato com o Setor Administrativo da sua Escola");
        listData.put(listGroup.get(0),auxiliar);

        auxiliar = new ArrayList<String>();
        auxiliar.add("1 -Caso suas notas não esteja aparecendo no Diario de Classe: \n" +
                "Passo 1: Entrar em Contato com o Setor Administrativo da sua Escola");
        auxiliar.add("2 -Quando quando acesso o Diario de Classe o Programa fecha sozinho: \n" +
                "Favor Entrar em contato com a equipe de suporte. \n" +
                "Email: portaeducando@gmail.com");
        listData.put(listGroup.get(1),auxiliar);

        auxiliar = new ArrayList<String>();
        auxiliar.add("Problemas com o Acompanhamento ModelNutricional:  " +
                "Favor Entrar em contato com a equipe de suporte. \n" +
                "Email: portaeducando@gmail.com");
        listData.put(listGroup.get(2),auxiliar);

        auxiliar = new ArrayList<String>();
        auxiliar.add("1 -Caso seus dados estejam incorretos: \n" +
                "Passo 1: Entrar em Contato com o Setor Administrativo da sua Escola");
        auxiliar.add("Problemas com o Acompanhamento Hospitalar:  " +
                "Favor Entrar em contato com a equipe de suporte. \n" +
                "Email: portaeducando@gmail.com");
        listData.put(listGroup.get(3),auxiliar);

        auxiliar = new ArrayList<String>();
        auxiliar.add("Problemas com o Acompanhamento Escolar:  " +
                "Favor Entrar em contato com a equipe de suporte. \n" +
                "Email: portaeducando@gmail.com");
        listData.put(listGroup.get(4),auxiliar);


    }
}
