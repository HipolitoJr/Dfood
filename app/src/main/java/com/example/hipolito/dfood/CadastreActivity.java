package com.example.hipolito.dfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class CadastreActivity extends AppCompatActivity {

    private Button btnConfirmaCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastre);
        setupViews();
    }

    private void setupViews() {
        btnConfirmaCadastro = findViewById(R.id.btn_confima_cadastro);

        btnConfirmaCadastro.setOnClickListener(onclick -> {
            confirmaCadastro();
        });
    }

    private void confirmaCadastro() {
        Toast.makeText(this, "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
