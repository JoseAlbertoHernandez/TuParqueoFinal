package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IngresoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
    }
    public void ingresar(View view) {
        Intent ingresar = new Intent(this, ProvisionalActivity.class);
        startActivity(ingresar);

    }

    public void registrar(View vie) {

        Intent registrar = new Intent(this,ClienteActivity.class);
        startActivity(registrar);
    }
}