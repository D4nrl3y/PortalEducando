package com.example.exit.portaleducando.Perguntas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.exit.portaleducando.R;

public class PerguntasMatematica extends AppCompatActivity {
    WebView webViewQuizMat;
    Button btnMat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas_matematica);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("Perguntas - Matemática");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();

        btnMat = (Button) findViewById(R.id.btnMat);
        webViewQuizMat = (WebView) findViewById(R.id.webViewQuizMat);
        btnMat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewQuizMat.getSettings().setLoadsImagesAutomatically(true);
                webViewQuizMat.getSettings().setJavaScriptEnabled(true);
                webViewQuizMat.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webViewQuizMat.loadUrl("http://192.168.0.106:8080/PortalEducando/quiz/questionario.jsp?id=8");
                btnMat.setVisibility(View.GONE);
            }
        });

        webViewQuizMat.setWebViewClient(new PerguntasMatematica.MyBrowser());
    }

    private class MyBrowser extends WebViewClient {
        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
