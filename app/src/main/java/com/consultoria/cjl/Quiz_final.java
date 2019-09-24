package com.consultoria.cjl;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz_final extends AppCompatActivity {


    public static int finacerto = Quiz_10.acerto10;
    public static int finerro = Quiz_10.erro10;
    public static int iniciante = Quiz.ini;
    public static int intermediario = Quiz.inte;
    public static int avancado = Quiz.avanc;

    public int zerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_final);


        Button inicial = (Button) findViewById(R.id.telainicial);


        inicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Quiz_final.this, Inicio.class);
                startActivity(intent);
            }
        });


        if (iniciante == 1) {
            TextView texto = (TextView) findViewById(R.id.textView23);
            texto.setText(" Acertos: " + finacerto + "\n Erros: " + finerro + "\n NIVEL: " + "INICIANTE");
            if (finacerto == 10){
                TextView acerto = (TextView) findViewById(R.id.textView27);
                acerto.setText("PARABÉNS, VOCÊ ACERTOU TODAS AS QUESTÕES!");
            }if (finacerto < 10){
                TextView acerto = (TextView) findViewById(R.id.textView27);
                acerto.setText("\nQUE PENA :(" + "\n Tente novamente clicando no botão abaixo, e mostre que você manja! :)");
            }
        } if (intermediario == 1) {
            TextView texto = (TextView) findViewById(R.id.textView23);
            texto.setText(" Acertos: " + finacerto + "\n Erros: " + finerro + "\n NIVEL: " + "INTERMEDIARIO");
            if (finacerto == 10){
                TextView acerto = (TextView) findViewById(R.id.textView27);
                acerto.setText("PARABÉNS, VOCÊ ACERTOU TODAS AS QUESTÕES!");
            }if (finacerto < 10){
                TextView acerto = (TextView) findViewById(R.id.textView27);
                acerto.setText("\nQUE PENA :(" + "\n Tente novamente clicando no botão abaixo, e mostre que você manja! :)");
            }
        } if (avancado == 1) {
            TextView texto = (TextView) findViewById(R.id.textView23);
            texto.setText(" Acertos: " + finacerto + "\n Erros: " + finerro + "\n NIVEL: " + "AVANÇADO");
            if (finacerto == 10){
                TextView acerto = (TextView) findViewById(R.id.textView27);
                acerto.setText("PARABÉNS, VOCÊ ACERTOU TODAS AS QUESTÕES!");
            }if (finacerto < 10){
                TextView acerto = (TextView) findViewById(R.id.textView27);
                acerto.setText("\nQUE PENA :(" + "\n Tente novamente clicando no botão abaixo, e mostre que você manja! :)");
            }
        }







    }

}
