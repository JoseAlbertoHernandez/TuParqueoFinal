package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class PlanesActivity extends AppCompatActivity {

    private EditText txvNPlan,edtxHora,edtxDia,edtxSemana,edtxMes;
    private Button btnMoto,btnAutomovil,btnCamioneta,btnCamion,btnTractocamion,btnRegPlan,btnConsulPlan,btnEditPlan,btnElimPlan;
    private String tVehiculo;
    private TextView txvTVehiculo;

FirebaseFirestore firestore = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planes);

        txvNPlan = findViewById(R.id.txvNPlan);
        edtxHora = findViewById(R.id.edtxHora);
        edtxDia = findViewById (R.id.edtxDia);
        edtxSemana = findViewById(R.id.edtxSemana);
        edtxMes = findViewById(R.id.edtxMes);

        btnMoto = findViewById(R.id.btnMoto);
        btnAutomovil = findViewById(R.id.btnAutomovil);
        btnCamioneta = findViewById(R.id.btnCamioneta);
        btnCamion = findViewById(R.id.btnCamion);
        btnTractocamion = findViewById(R.id.btnTractoCamion);
        btnRegPlan = findViewById(R.id.btnRegPlan);
        btnConsulPlan = findViewById(R.id.btnConsulPlan);
        btnEditPlan = findViewById(R.id.btnEditPlan);
        btnElimPlan = findViewById(R.id.btnElimPlan);

        btnRegPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrar();

            }
        });

        btnEditPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editar();

            }
        });

        btnConsulPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnElimPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }




    private void registrar() {

        Map<String,Object> planesTarifas = new HashMap<>();
        planesTarifas.put("hora",edtxHora.getText().toString());
        planesTarifas.put("dia",edtxDia.getText().toString());
        planesTarifas.put("semana",edtxSemana.getText().toString());
        planesTarifas.put("mes",edtxMes.getText().toString());
        firestore.collection("PlanesTarifas").document(txvNPlan.getText().toString()).set(planesTarifas);

    }

    private void editar() {
        Map<String,Object> planesTarifas = new HashMap<>();
        planesTarifas.put("hora",edtxHora.getText().toString());
        planesTarifas.put("dia",edtxDia.getText().toString());
        planesTarifas.put("semana",edtxSemana.getText().toString());
        planesTarifas.put("mes",edtxMes.getText().toString());
        firestore.collection("PlanesTarifas").document(txvNPlan.getText().toString()).update(planesTarifas);

    }
}