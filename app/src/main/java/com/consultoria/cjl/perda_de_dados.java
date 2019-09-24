package com.consultoria.cjl;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class perda_de_dados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perda_de_dados);


        ImageView whatsap = (ImageView) findViewById(R.id.image_whatsap);



        whatsap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatsapicone = new Intent(Intent.ACTION_VIEW, Uri.parse("http://api.whatsapp.com/send?1=pt_BR&phone=55011972294035"));
                startActivity(whatsapicone);
            }
        });

    }
}
