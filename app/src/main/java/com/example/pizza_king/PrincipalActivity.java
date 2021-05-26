package com.example.pizza_king;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {
    Button btnVentanas, btnContactos, btnFotos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnVentanas = (Button) findViewById(R.id.btnVentas);
        btnContactos = (Button) findViewById(R.id.btnContactos);
        btnFotos = (Button) findViewById(R.id.btnFotos);

    }
    public void ventas(View view) {

        Intent intent = new Intent(getApplicationContext(), VentasActivity.class);
        startActivity(intent);
    }
    public void contactos(View view) {

        Intent intent = new Intent(getApplicationContext(), ContactosActivity.class);
        startActivity(intent);
    }
    public void fotos(View view) {

        Intent intent = new Intent(getApplicationContext(), FotosActivity.class);
        startActivity(intent);
    }
    public void logout(View view){

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}