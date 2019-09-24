package com.consultoria.cjl;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class solucoes_inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solucoes_inicio);
        //chamar btn variavel
        Button btn_perdadedados = (Button) findViewById(R.id.btn_s1);
        Button btn_seginform  = (Button)findViewById(R.id.btn_s2);
        Button btns3  = (Button)findViewById(R.id.btn_s3);
        Button btns4  = (Button)findViewById(R.id.btn_s4);
        Button btns5  = (Button)findViewById(R.id.btn_s5);
        Button btns6  = (Button)findViewById(R.id.btn_s6);
        Button btns7  = (Button)findViewById(R.id.btn_s7);
        Button btns8  = (Button)findViewById(R.id.btn_s8);
        Button btns9  = (Button)findViewById(R.id.btn_s9);



        //chamar btn activity
        btn_perdadedados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(solucoes_inicio.this, perda_de_dados.class);
                startActivity(intent);
            }
        });

        btn_seginform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(solucoes_inicio.this, dados_de_seguranca.class);
                startActivity(intent);
            }
        });


        btns3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(solucoes_inicio.this, EmBreve.class);
                startActivity(intent);
            }
        });

        btns4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(solucoes_inicio.this, EmBreve.class);
                startActivity(intent);
            }
        });

        btns5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(solucoes_inicio.this, EmBreve.class);
                startActivity(intent);
            }
        });

        btns6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(solucoes_inicio.this, EmBreve.class);
                startActivity(intent);
            }
        });

        btns7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(solucoes_inicio.this, EmBreve.class);
                startActivity(intent);
            }
        });

        btns8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(solucoes_inicio.this, EmBreve.class);
                startActivity(intent);
            }
        });

        btns9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(solucoes_inicio.this, EmBreve.class);
                startActivity(intent);
            }
        });



    }
}
