package com.consultoria.cjl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CrescimentoEmpresarial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crescimento_empresarial);
        TextView chamasite = (TextView)findViewById(R.id.txt_maisinformacoes_btn);
        TextView chamacontato = (TextView) findViewById(R.id.txt_contatos_btn);

        chamasite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chama1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.consultoriacjl.com.br/"));
                    startActivity(chama1);
            }
        });

        chamacontato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chama2 = new Intent(CrescimentoEmpresarial.this, Contato.class);
                startActivity(chama2);
            }
        });


    }
}
