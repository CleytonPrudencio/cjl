package com.consultoria.cjl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Computadores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computadores);
        //chama btn variavel
        Button btn_solucies = (Button) findViewById(R.id.btn_solucoes);








        //chamar btn activity
        btn_solucies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Computadores.this, solucoes_inicio.class);
                startActivity(intent);
            }
        });




    }
}
