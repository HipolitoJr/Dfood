package com.example.hipolito.dfood;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ConfirmacaoPedidoActivity extends AppCompatActivity {

    private FloatingActionButton btnAgendarPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao_pedido);
        setupViews();
    }

    private void setupViews() {
        btnAgendarPedido = findViewById(R.id.btn_agendar_pedido);

        btnAgendarPedido.setOnClickListener(onclick -> {
            agendarPedido();
        });
    }

    private void agendarPedido() {
        Toast.makeText(this, "Pedido agendado com sucesso!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}
