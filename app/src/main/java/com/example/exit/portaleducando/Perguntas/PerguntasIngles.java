package com.example.exit.portaleducando.Perguntas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.exit.portaleducando.R;

public class PerguntasIngles extends AppCompatActivity {
    WebView webViewQuizIng;
    Button btnIng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas_ingles);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("Perguntas - Inglês");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();

        btnIng = (Button) findViewById(R.id.btnIng);
        webViewQuizIng = (WebView) findViewById(R.id.webViewQuizIng);
        btnIng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewQuizIng.getSettings().setLoadsImagesAutomatically(true);
                webViewQuizIng.getSettings().setJavaScriptEnabled(true);
                webViewQuizIng.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webViewQuizIng.loadUrl("http://192.168.0.106:8080/PortalEducando/quiz/questionario.jsp?id=9");
                btnIng.setVisibility(View.GONE);
            }
        });
        webViewQuizIng.setWebViewClient(new PerguntasIngles.MyBrowser());
    }

    private class MyBrowser extends WebViewClient {
        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
