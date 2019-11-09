package com.example.calculadora;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {
    String valorExtraido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        TextView nombre = (TextView)findViewById(R.id.textView3);
        valorExtraido = getIntent().getExtras().getString("valor");
        nombre.setText(valorExtraido);
    }

}
