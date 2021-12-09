package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdministradorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);
    }

    public void parqueadero (View view) {

        Intent parqueadero = new Intent(this,ParqueaderoActivity.class);
        startActivity(parqueadero);
    }

    public void empleado (View view){

        Intent empleado = new Intent(this, EmpleadoActivity.class);
        startActivity(empleado);
    }

    public void planes (View view) {

        Intent planes = new Intent(this, PlanesActivity.class);
        startActivity(planes);
    }

    public void zona (View view) {

        Intent zona = new Intent(this, ZonaActivity.class);
        startActivity(zona);
    }


    public void salir (View view) {

        Intent salida = new Intent(this,MainActivity.class);
        startActivity(salida);
    }
}