package com.example.exit.portaleducando.Perguntas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.exit.portaleducando.R;

public class PerguntasGeografia extends AppCompatActivity {
    WebView webViewQuizGeo;
    Button btnGeo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas_geografia);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("Perguntas - Geografia");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();


        btnGeo = (Button) findViewById(R.id.btnGeo);
        webViewQuizGeo = (WebView) findViewById(R.id.webViewQuizGeo);
        btnGeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewQuizGeo.getSettings().setLoadsImagesAutomatically(true);
                webViewQuizGeo.getSettings().setJavaScriptEnabled(true);
                webViewQuizGeo.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webViewQuizGeo.loadUrl("http://192.168.0.106:8080/PortalEducando/quiz/questionario.jsp?id=8");
                btnGeo.setVisibility(View.GONE);
            }
        });
        webViewQuizGeo.setWebViewClient(new PerguntasGeografia.MyBrowser());
    }

    private class MyBrowser extends WebViewClient {
        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
