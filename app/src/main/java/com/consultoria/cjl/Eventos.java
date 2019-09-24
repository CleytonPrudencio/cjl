package com.consultoria.cjl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Eventos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        ImageView toquesingelo = (ImageView) findViewById(R.id.image_toquesingelo);
        Button btnagenda = (Button) findViewById(R.id.btn_agendatoque);
        ImageView toquesingeloinstagram = (ImageView) findViewById(R.id.instagram_toquesingelo);

        toquesingelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toque = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.consultoriacjl.com.br/eventos"));
                startActivity(toque);
            }
        });

        btnagenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1xwesH37Lv4nix65xvgZlmwwOaK1BbU6RVXVEUzrN1Zc/edit?usp=sharing"));
                startActivity(intent);
            }
        });


        toquesingeloinstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/toquesingelo_oficial/?hl=pt-br"));
                startActivity(intent);
            }
        });

    }
}
