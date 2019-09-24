package com.consultoria.cjl;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz_7 extends AppCompatActivity {


    public static int acerto7 = Quiz_6.acerto6;
    public static int erro7 = Quiz_6.erro6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_7);

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
                    acerto7++;
                    Toast.makeText(getApplicationContext(), "Resposta correta!", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_7.this, Quiz_8.class);
                    startActivity(intent);
                } if (r2.isChecked()){
                    erro7++;
                    Toast.makeText(getApplicationContext(), "Resposta errada!", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_7.this, Quiz_8.class);
                    startActivity(intent);
                } if (r3.isChecked()){
                    erro7++;
                    Toast.makeText(getApplicationContext(), "Resposta errada!", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_7.this, Quiz_8.class);
                    startActivity(intent);
                } if (r4.isChecked()){
                    erro7++;
                    Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_7.this, Quiz_8.class);
                    startActivity(intent);
                } if (r5.isChecked()){
                    erro7++;
                    Toast.makeText(getApplicationContext(), "Resposta errada", Toast.LENGTH_SHORT).show();
                    Intent intent =  new Intent (Quiz_7.this, Quiz_8.class);
                    startActivity(intent);
                }
            }
        });



    }
}
