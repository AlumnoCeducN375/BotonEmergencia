package com.example.botonemergencia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {

    private EditText nombreUsuario, apellidoUsuario, usuarioUsuario, contrasenaUsuario, telefonoUsuario, emailUsuario, direccionUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        nombreUsuario=(EditText) findViewById(R.id.txtNombre);
        apellidoUsuario=(EditText) findViewById(R.id.txtApellido);
        usuarioUsuario=(EditText) findViewById(R.id.txtUsuario);
        contrasenaUsuario=(EditText) findViewById(R.id.txtPass);
        telefonoUsuario=(EditText) findViewById(R.id.txtTelefono);
        emailUsuario=(EditText) findViewById(R.id.txtDireccion);
        direccionUsuario=(EditText) findViewById(R.id.txtDireccion);



    }

    public void avanzarDatosEmergencia(View view){
        Intent avanzarEmerg = new Intent(this,DatosEmergencia.class);






        startActivity(avanzarEmerg);
    }





}