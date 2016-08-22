package com.example.antoniocosta.kawabanga;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout tilLogin;
    private TextInputLayout tilSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tilLogin = (TextInputLayout) findViewById(R.id.tilLogin);
        tilSenha = (TextInputLayout) findViewById(R.id.tilSenha);

    }

    public void logar(View v){
        String login = tilLogin.getEditText().getText().toString();
        String pass = tilSenha.getEditText().getText().toString();

        if(login.equals("fiap") && pass.equals("123")){
            Intent i = new Intent(this, PedidoActivity.class);
            i.putExtra("usuario", login);
            startActivity(i);
        }else{
            Toast.makeText(this, "Usuario ou senha invalido",
            Toast.LENGTH_LONG).show();
        }
    }
}
