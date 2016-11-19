package com.example.exit.portaleducando.Perguntas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.exit.portaleducando.AcompEscolar;
import com.example.exit.portaleducando.QuizActivity;
import com.example.exit.portaleducando.R;

public class PerguntasPortugues extends AppCompatActivity {
    WebView webViewQuizPort;

    Button btnPort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas_portugues);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("Perguntas - Português");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();

       btnPort = (Button) findViewById(R.id.btnPort);
        webViewQuizPort = (WebView) findViewById(R.id.webViewQuizPort);
        btnPort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewQuizPort.getSettings().setLoadsImagesAutomatically(true);
                webViewQuizPort.getSettings().setJavaScriptEnabled(true);
                webViewQuizPort.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webViewQuizPort.loadUrl("http://192.168.0.106:8080/PortalEducando/quiz/questionario.jsp?id=8");
                btnPort.setVisibility(View.GONE);
            }
        });

        webViewQuizPort.setWebViewClient(new PerguntasPortugues.MyBrowser());
    }

    private class MyBrowser extends WebViewClient {
        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }

}
