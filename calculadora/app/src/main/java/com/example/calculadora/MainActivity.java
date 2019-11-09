package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText Cantidad1, Cantidad2;
    //public TextView Cantidad1, Cantidad2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cantidad1 = (EditText)findViewById(R.id.editText);
        Cantidad2 = (EditText)findViewById(R.id.editText2);
    }
    public void sumar(View view){
        int cantidad1 = Integer.parseInt(Cantidad1.getText().toString());
        int cantidad2 = Integer.parseInt(Cantidad2.getText().toString());
        Integer resultado = cantidad1 + cantidad2;
        mostrar(resultado);
        Intent intent = new Intent(getApplicationContext(),calculadora.class);
        final String texTraslado = resultado.toString();
        intent.putExtra("valor",texTraslado);
        startActivity(intent);
    }
    public void mostrar(int resultado)
    {
        Toast.makeText(this,"resultado"  + resultado , Toast.LENGTH_SHORT ).show();
    }
    public void restar (View view){
        int cantidad1 = Integer.parseInt(Cantidad1.getText().toString());
        int cantidad2 = Integer.parseInt(Cantidad2.getText().toString());
        Integer resultado = cantidad1 - cantidad2;
        mostrar(resultado);
        Intent intent = new Intent(getApplicationContext(),calculadora.class);
        final String texTraslado = resultado.toString();
        intent.putExtra("valor",texTraslado);
        startActivity(intent);

    }
    public void multiplicar (View view){
        int cantidad1 = Integer.parseInt(Cantidad1.getText().toString());
        int cantidad2 = Integer.parseInt(Cantidad2.getText().toString());
        Integer resultado = cantidad1 * cantidad2;
        mostrar(resultado);
        Intent intent = new Intent(getApplicationContext(),calculadora.class);
        final String texTraslado = resultado.toString();
        intent.putExtra("valor",texTraslado);
        startActivity(intent);
    }
    public void dividir (View view){
        int cantidad1 = Integer.parseInt(Cantidad1.getText().toString());
        int cantidad2 = Integer.parseInt(Cantidad2.getText().toString());
        Integer resultado = cantidad1 / cantidad2;
        mostrar(resultado);
        Intent intent = new Intent(getApplicationContext(),calculadora.class);
        final String texTraslado = resultado.toString();
        intent.putExtra("valor",texTraslado);
        startActivity(intent);

    }


}
