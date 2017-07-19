package com.example.danon.pagmenos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText login = (EditText) findViewById(R.id.Login);
        final EditText senha = (EditText) findViewById(R.id.Senha);
        Button entrar = (Button) findViewById(R.id.entrar);
        Button limpar = (Button) findViewById(R.id.limpar);

        entrar.setOnClickListener(new View.OnClickListener(){
           @Override
           public  void  onClick(View v){
               String logincerto = "admin";
               String senhacerta = "12345";
               String strLogin = login.getText().toString();
               String strSenha = senha.getText().toString();

               if(strLogin.equals(logincerto) && strSenha.equals(senhacerta)){
                   Toast.makeText(MainActivity.this, "Login co secesso", Toast.LENGTH_SHORT).show();
               }
               else{
                   Toast.makeText(MainActivity.this, "Erro! Login incorreto", Toast.LENGTH_SHORT).show();
               }

           }
        });

    }
}
