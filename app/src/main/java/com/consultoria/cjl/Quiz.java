package com.consultoria.cjl;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz extends AppCompatActivity {

    public static int ini = 0;
    public static int inte = 0;
    public static int avanc = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button btn_ini = (Button)findViewById(R.id.btn_iniciante);
        Button btn_inter = (Button)findViewById(R.id.btn_intermediario);
        Button btn_avanc = (Button)findViewById(R.id.btn_avancado);

        btn_ini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ini++;
                Intent intent = new Intent(Quiz.this, Quiz_1.class);
                startActivity(intent);
            }
        });

        btn_inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inte++;
                Intent intent = new Intent(Quiz.this, EmBreve.class);
                startActivity(intent);
            }
        });

        btn_avanc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                avanc++;
                Intent intent = new Intent(Quiz.this, EmBreve.class);
                startActivity(intent);
            }
        });




    }
}
