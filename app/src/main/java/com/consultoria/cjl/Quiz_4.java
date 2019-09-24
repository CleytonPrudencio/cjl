package com.consultoria.cjl;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz_4 extends AppCompatActivity {


    public static int acerto4 = Quiz_3.acerto3;
    public static int erro4 = Quiz_3.erro3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_4);

        Button btnrespodner = (Button)findViewById(R.id.btn_responder3);
        final RadioButton r1 = (RadioButton) findViewById(R.id.r1);
        final RadioButton r2 = (RadioButton) findViewById(R.id.r2);
        final RadioButton r3 = (RadioButton) findViewById(R.id.r3);
        final RadioButton r4 = (RadioButton) findViewById(R.id.r4);
        final RadioButton r5 = (RadioButton) findViewById(R.id.r5);



        btnrespodner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (r1.isChecked()){
                    erro4++;
                    Toast.makeText(getApplicationContext(), "Resposta errada!", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_4.this, Quiz_5.class);
                    startActivity(intent);

                } if (r2.isChecked()){
                    erro4++;
                    Toast.makeText(getApplicationContext(), "Resposta errada!", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_4.this, Quiz_5.class);
                    startActivity(intent);
                } if (r3.isChecked()){
                    erro4++;
                    Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_4.this, Quiz_5.class);
                    startActivity(intent);
                } if (r4.isChecked()){
                    acerto4++;
                    Toast.makeText(getApplicationContext(), "Resposta correta", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_4.this, Quiz_5.class);
                    startActivity(intent);
                } if (r5.isChecked()){
                    erro4++;
                    Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_4.this, Quiz_5.class);
                    startActivity(intent);
                }
            }
        });

    }





}
