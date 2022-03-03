package com.heltonbustos.ejemplogitlocal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSaludar;
    Button btnDespedir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSaludar = findViewById(R.id.btnSaludar);
        btnDespedir = findViewById(R.id.btnDespedir);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "HOLA MUNDO!", Toast.LENGTH_SHORT).show();
            }
        });

        btnDespedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "CHAO MUNDO! (featura/boton_despedir)", Toast.LENGTH_SHORT).show();
            }
        });
    }
}