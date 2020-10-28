package com.gnfo.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class infoLugar extends AppCompatActivity {

    Button btnLugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_lugar);

        btnLugar = (Button) findViewById(R.id.idbtnLugar);

        btnLugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarMapa();
            }
        });

    }
    private void mostrarMapa(){

        Intent intento = new Intent(this, MapsActivity.class);
        startActivity(intento);
    }
}