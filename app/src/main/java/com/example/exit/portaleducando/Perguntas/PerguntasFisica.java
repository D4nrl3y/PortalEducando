package com.example.exit.portaleducando.Perguntas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.exit.portaleducando.R;

public class PerguntasFisica extends AppCompatActivity {
    WebView webViewQuizFis;
    Button btnFis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas_fisica);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("Perguntas - Fisica");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();

        btnFis = (Button) findViewById(R.id.btnFis);
        webViewQuizFis = (WebView) findViewById(R.id.webViewQuizFis);
        btnFis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewQuizFis.getSettings().setLoadsImagesAutomatically(true);
                webViewQuizFis.getSettings().setJavaScriptEnabled(true);
                webViewQuizFis.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webViewQuizFis.loadUrl("http://192.168.0.106:8080/PortalEducando/quiz/questionario.jsp?id=8");
                btnFis.setVisibility(View.GONE);
            }
        });
        webViewQuizFis.setWebViewClient(new PerguntasFisica.MyBrowser());
    }

    private class MyBrowser extends WebViewClient {
        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
