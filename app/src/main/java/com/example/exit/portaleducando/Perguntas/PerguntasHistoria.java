package com.example.exit.portaleducando.Perguntas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.exit.portaleducando.R;

public class PerguntasHistoria extends AppCompatActivity {
    WebView webViewQuizHis;
    Button btnHis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas_historia);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("Perguntas - História");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();

        btnHis = (Button) findViewById(R.id.btnHis);
        webViewQuizHis = (WebView) findViewById(R.id.webViewQuizHis);
        btnHis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewQuizHis.getSettings().setLoadsImagesAutomatically(true);
                webViewQuizHis.getSettings().setJavaScriptEnabled(true);
                webViewQuizHis.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webViewQuizHis.loadUrl("http://192.168.0.106:8080/PortalEducando/quiz/questionario.jsp?id=8");
                btnHis.setVisibility(View.GONE);
            }
        });
        webViewQuizHis.setWebViewClient(new PerguntasHistoria.MyBrowser());
    }

    private class MyBrowser extends WebViewClient {
        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
