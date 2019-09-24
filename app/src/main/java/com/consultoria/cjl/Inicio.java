package com.consultoria.cjl;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.consultoria.cjl.Firebase.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;

public class Inicio extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);



    Button btn_quemsomos = (Button) findViewById(R.id.btn_quemsomos);
    Button btn_nossosservicos = (Button) findViewById(R.id.btn_servicos);
    Button btn_solucoes = (Button) findViewById(R.id.btn_solucoes);
    Button btn_Diretoria = (Button) findViewById(R.id.btn_diretoria);
    Button btn_Eventos = (Button) findViewById(R.id.btn_eventos);
    Button btn_site = (Button) findViewById(R.id.btn_site);
    Button btn_local = (Button) findViewById(R.id.btn_local);
    Button btn_crescimento = (Button)findViewById(R.id.btn_crescimento);
    Button btn_contato = (Button) findViewById(R.id.btn_contato);
    Button btn_trabalhe = (Button)findViewById(R.id.btn_trabaconosco);
    Button btn_quiz = (Button) findViewById(R.id.btn_quiz);
    Button btn_sair = (Button)findViewById(R.id.btn_sair);

        btn_quemsomos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent quemsomos = new Intent(Inicio.this, QuemSomos.class);
            startActivity(quemsomos);
        }
    });
        btn_nossosservicos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent nossosservicos = new Intent(Inicio.this, NossosServicos.class);
            startActivity(nossosservicos);
        }
    });

        btn_Diretoria.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent diretoriainstagram = new Intent(Inicio.this, Diretoria.class);
            startActivity(diretoriainstagram);
        }
    });

        btn_Eventos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent eve = new Intent(Inicio.this, Eventos.class);
            startActivity(eve);
        }
    });

        btn_local.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent locale = new Intent(Inicio.this, Local.class);
            startActivity(locale);
        }
    });

        btn_crescimento.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent cre = new Intent(Inicio.this, CrescimentoEmpresarial.class);
            startActivity(cre);
        }
    });

        btn_contato.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent cont = new Intent(Inicio.this, Contato.class);
            startActivity(cont);
        }
    });

        btn_trabalhe.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent conosco = new Intent(Inicio.this, TrabalheConosco.class);
            startActivity(conosco);
        }
    });

        btn_site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent site = new Intent(Inicio.this, Site.class);
                startActivity(site);
            }
        });

        btn_solucoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Computadores.class);
                startActivity(intent);
            }
        });


        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(Inicio.this, LoginActivity.class);
                startActivity(intent);

            }
        });

        btn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Quiz.class);
                startActivity(intent);
            }
        });



}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.btn_sair) {
            FirebaseAuth.getInstance().signOut();
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
