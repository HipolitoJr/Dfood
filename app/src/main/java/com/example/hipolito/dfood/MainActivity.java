package com.example.hipolito.dfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView btnCadastreSe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        btnCadastreSe = findViewById(R.id.btn_cadastre_se);

        btnCadastreSe.setOnClickListener(onclick -> {
            startActivity(new Intent(MainActivity.this, CadastreActivity.class));
        } );
    }

    public void testeListaItens(View view) {
        Intent intent =  new Intent(this,HomeActivity.class);
        startActivity(intent);
        finish();
    }


}
