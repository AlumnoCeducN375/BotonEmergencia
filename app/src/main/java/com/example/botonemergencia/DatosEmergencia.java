package com.example.botonemergencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DatosEmergencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_emergencia);
    }

    public void volverAFormulario(View view){
        Intent volverForm = new Intent(this,Formulario.class);
        startActivity(volverForm);

    }
}