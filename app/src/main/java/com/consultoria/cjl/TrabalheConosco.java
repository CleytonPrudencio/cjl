package com.consultoria.cjl;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TrabalheConosco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabalhe_conosco);
        ImageView trabalhe = (ImageView)findViewById(R.id.image_trabalheconosco);

        trabalhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conosco= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.consultoriacjl.com/trabalhe-conosco"));
                startActivity(conosco);
            }
        });


    }
}
