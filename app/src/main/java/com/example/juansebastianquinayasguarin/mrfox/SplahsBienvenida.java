package com.example.juansebastianquinayasguarin.mrfox;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

/**
 * Created by juansebastianquinayasguarin on 6/3/18.
 */

public class SplahsBienvenida extends Activity {
    private TextView textoSplash;
    private CircularImageView circularImageView;
    private final int DURACION_SPLASH = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textoSplash = (TextView) findViewById(R.id.textoSplash);
        circularImageView = (CircularImageView) findViewById(R.id.imgLogo);

        Typeface fuente = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        //textoSplash.setTypeface(fuente);

        setContentView(R.layout.splah_bienvenida);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(SplahsBienvenida.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
                finish();
            }
        }, DURACION_SPLASH);
    }
}

