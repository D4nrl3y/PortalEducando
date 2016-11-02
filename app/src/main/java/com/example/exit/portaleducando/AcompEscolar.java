package com.example.exit.portaleducando;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class AcompEscolar extends AppCompatActivity {
    ImageButton selecbarra;
    ImageButton selecpizza;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acomp_escolar);

        webView = (WebView) findViewById(R.id.webviewGraficos);
        webView.setWebViewClient(new MyBrowser());

//            métodos para usar as fragments com a API Do google charts quando a mesma for nativa para android
//        selecbarra = (ImageButton) findViewById(R.id.selecbarra);
//        selecpizza = (ImageButton) findViewById(R.id.selecpizza);
//
//             selecbarra.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new FragmentBarra()).commit();
//            }
//        });
//
//        selecpizza.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new FragmentPizza()).commit();
//            }
//        });

    }

    public void acessoDireto (View v) {
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("+++++++++++++++++++++++++++++++++++++++++http://192.168.43.216:8080/PortalEducando/ViewAluno/graficoMobile.jsp");
    }

    private class MyBrowser extends WebViewClient {
        public boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
