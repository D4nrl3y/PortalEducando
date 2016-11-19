package com.example.exit.portaleducando.Perguntas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.exit.portaleducando.R;

public class PerguntasBiologia extends AppCompatActivity {
    WebView webViewQuizBio;
    Button btnBio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas_biologia);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("Perguntas - Biologia");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();

        btnBio = (Button) findViewById(R.id.btnBio);
        webViewQuizBio = (WebView) findViewById(R.id.webViewQuizBio);
        btnBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewQuizBio.getSettings().setLoadsImagesAutomatically(true);
                webViewQuizBio.getSettings().setJavaScriptEnabled(true);
                webViewQuizBio.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webViewQuizBio.loadUrl("http://192.168.0.106:8080/PortalEducando/quiz/questionario.jsp?id=8");
                btnBio.setVisibility(View.GONE);
            }
        });
        webViewQuizBio.setWebViewClient(new PerguntasBiologia.MyBrowser());
    }

    private class MyBrowser extends WebViewClient {
        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
