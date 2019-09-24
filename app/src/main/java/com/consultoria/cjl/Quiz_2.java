package com.consultoria.cjl;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz_2 extends AppCompatActivity {


    public static int acerto2 = Quiz_1.acerto;
    public static int erro2 = Quiz_1.erro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_2);

        Button btnrespodner = (Button)findViewById(R.id.btn_responder3);
        final RadioButton mouse = (RadioButton) findViewById(R.id.mouse);
        final RadioButton teclado = (RadioButton) findViewById(R.id.teclado);
        final RadioButton processador = (RadioButton) findViewById(R.id.processado);
        final RadioButton leitor = (RadioButton) findViewById(R.id.leitor);
        final RadioButton som = (RadioButton) findViewById(R.id.som);



        btnrespodner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mouse.isChecked()){
                    erro2++;
                    Toast.makeText(getApplicationContext(), "Resposta errada!", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_2.this, Quiz_3.class);
                    startActivity(intent);

                } if (teclado.isChecked()){
                    erro2++;
                    Toast.makeText(getApplicationContext(), "Resposta errada!", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_2.this, Quiz_3.class);
                    startActivity(intent);
                } if (processador.isChecked()){
                    acerto2++;
                    Toast.makeText(getApplicationContext(), "Resposta correta", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_2.this, Quiz_3.class);
                    startActivity(intent);
                } if (leitor.isChecked()){
                    erro2++;
                    Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_2.this, Quiz_3.class);
                    startActivity(intent);
                } if (som.isChecked()){
                    erro2++;
                    Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_2.this, Quiz_3.class);
                    startActivity(intent);
                }
            }
        });


    }

}
