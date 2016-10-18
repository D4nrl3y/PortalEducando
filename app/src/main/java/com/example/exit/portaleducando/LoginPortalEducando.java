package com.example.exit.portaleducando;

import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class LoginPortalEducando extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal_educando);





        Typeface myTypefaceRbotoLight = Typeface.createFromAsset(getAssets(), "Roboto-Light.ttf");


        TextView myTextview = (TextView)findViewById(R.id.textView);
        myTextview.setTypeface(myTypefaceRbotoLight);
        TextView myTextview2 = (TextView)findViewById(R.id.textView2);
        myTextview2.setTypeface(myTypefaceRbotoLight);

        TextView myTextview4 = (TextView)findViewById(R.id.check_conectado);
        myTextview4.setTypeface(myTypefaceRbotoLight);

        Typeface myTypefaceRbotoBold = Typeface.createFromAsset(getAssets(), "Roboto-Bold.ttf");
        TextView myTextview5 = (TextView)findViewById(R.id.textview_logo1);
        myTextview5.setTypeface(myTypefaceRbotoBold);
        TextView myTextview6 = (TextView)findViewById(R.id.textviewe_logo2);
        myTextview6.setTypeface(myTypefaceRbotoLight);
        TextView myTextview3 = (TextView)findViewById(R.id.button_entrar);
        myTextview3.setTypeface(myTypefaceRbotoBold);

        Button botaoEntrar = (Button) findViewById(R.id.button_entrar);

        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_menu);
            }
        });
    }


}
