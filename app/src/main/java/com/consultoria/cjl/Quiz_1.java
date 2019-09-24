package com.consultoria.cjl;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz_1 extends AppCompatActivity {


    public static int acerto = 0;
    public static int erro = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_1);

    Button btnrespodner = (Button)findViewById(R.id.btn_responder);
    final RadioButton computador = (RadioButton) findViewById(R.id.radio1);
    final RadioButton placamae = (RadioButton) findViewById(R.id.radio2);
    final RadioButton processador = (RadioButton) findViewById(R.id.radio3);



        btnrespodner.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (computador.isChecked()){
                placamae.setChecked(false);
                processador.setChecked(false);
                erro = 0;
                erro++;
                Toast.makeText(getApplicationContext(), "Resposta errada!", Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent (Quiz_1.this, Quiz_2.class);
                startActivity(intent);
            } if (placamae.isChecked()){
                acerto = 0;
                acerto++;
                computador.setChecked(false);
                processador.setChecked(false);
                Toast.makeText(getApplicationContext(), "Resposta correta!", Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent (Quiz_1.this, Quiz_2.class);
                startActivity(intent);
            } if (processador.isChecked()){
                erro = 0;
                erro++;
                placamae.setChecked(false);
                computador.setChecked(false);
                Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                Intent intent =  new Intent (Quiz_1.this, Quiz_2.class);
                startActivity(intent);
            }
        }
    });



    }


}
