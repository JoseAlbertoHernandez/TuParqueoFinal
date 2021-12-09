package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProvisionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provisional);
    }
    public void administrador (View view) {

        Intent admin = new Intent(this, AdministradorActivity.class);
        startActivity(admin);
    }
    public void operador (View view) {

        Intent operar = new Intent(this, RegistroActivity.class);
        startActivity(operar);
    }
    public void usuario (View view) {

        Intent usuario = new Intent(this,ClienteActivity.class);
        startActivity(usuario);
    }
    public void salir (View view) {

        Intent salida = new Intent(this, MainActivity.class);
        startActivity(salida);
    }
}