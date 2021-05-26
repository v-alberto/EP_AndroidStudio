package com.example.pizza_king;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VentasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventas);
    }
    public void back(View view){

        Intent intent = new Intent(getApplicationContext(), PrincipalActivity.class);
        startActivity(intent);
    }
}