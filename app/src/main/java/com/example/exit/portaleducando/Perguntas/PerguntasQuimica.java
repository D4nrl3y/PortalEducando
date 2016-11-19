package com.example.exit.portaleducando.Perguntas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.exit.portaleducando.R;

public class PerguntasQuimica extends AppCompatActivity {

    WebView webViewQuizQui;
    Button btnQui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas_quimica);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setSubtitle("Perguntas - Química");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.show();

        btnQui = (Button) findViewById(R.id.btnQui);
        webViewQuizQui = (WebView) findViewById(R.id.webViewQuizQui);
        btnQui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webViewQuizQui.getSettings().setLoadsImagesAutomatically(true);
                webViewQuizQui.getSettings().setJavaScriptEnabled(true);
                webViewQuizQui.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webViewQuizQui.loadUrl("http://192.168.0.106:8080/PortalEducando/quiz/questionario.jsp?id=8");
                btnQui.setVisibility(View.GONE);
            }
        });
        webViewQuizQui.setWebViewClient(new PerguntasQuimica.MyBrowser());
    }

    private class MyBrowser extends WebViewClient {
        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
