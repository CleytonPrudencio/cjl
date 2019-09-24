package com.consultoria.cjl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Diretoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diretoria);

        ImageView instagram = (ImageView) findViewById(R.id.image_instagram);
        ImageView facebook = (ImageView) findViewById(R.id.image_facebook);
        ImageView whatsap = (ImageView) findViewById(R.id.image_whatsap);
        ImageView ema = (ImageView) findViewById(R.id.image_email);

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instagramimagem= new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/cleytonsales_oficial"));
                startActivity(instagramimagem);
            }
        });

    facebook.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent facebookimagem = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/cleyton.jesus"));
            startActivity(facebookimagem);
        }
    });

    whatsap.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent whatsapicone = new Intent(Intent.ACTION_VIEW, Uri.parse("http://api.whatsapp.com/send?1=pt_BR&phone=55011940090003"));
            startActivity(whatsapicone);
        }
    });


    ema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emaicone = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:consultor@consultoriacjl.com"));
                startActivity(emaicone);
            }
        });



    }







}
