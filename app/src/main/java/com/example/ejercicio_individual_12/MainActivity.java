package com.example.ejercicio_individual_12;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejercicio_individual_12.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2, num3;
    public Button btnRest1, btnRest2, btnRest3;
    public Button btnAdd1, btnAdd2, btnAdd3;
    public ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        num1 = binding.num1;
        btnRest1 = binding.btnRest1;
        btnAdd1 = binding.btnAdd1;
        num2 = binding.num2;
        btnRest2 = binding.btnRest2;
        btnAdd2 = binding.btnAdd2;
        num3 = binding.num3;
        btnRest3 = binding.btnRest3;
        btnAdd3 = binding.btnAdd3;

        binding.btnCerrar.setOnClickListener(view -> {
            finishAffinity();
        });

        binding.btnUbicacion.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, activity_map.class );
            startActivity(intent);
        });

        btnAdd1.setOnClickListener((View.OnClickListener) v -> aumentarContador1());
        btnRest1.setOnClickListener((View.OnClickListener) v -> disminuirContador1());
        btnAdd2.setOnClickListener((View.OnClickListener) v -> aumentarContador2());
        btnRest2.setOnClickListener((View.OnClickListener) v -> disminuirContador2());
        btnAdd3.setOnClickListener((View.OnClickListener) v -> aumentarContador3());
        btnRest3.setOnClickListener((View.OnClickListener) v -> disminuirContador3());
    }
    private void aumentarContador1() {
        int cantidad = Integer.parseInt(num1.getText().toString());
        cantidad++;
        num1.setText(String.valueOf(cantidad));
    }
    private void disminuirContador1() {
        int cantidad = Integer.parseInt(num1.getText().toString());
        if (cantidad > 0) {
            cantidad--;
            num1.setText(String.valueOf(cantidad));
        }
    }
    private void aumentarContador2() {
        int cantidad = Integer.parseInt(num2.getText().toString());
        cantidad++;
        num2.setText(String.valueOf(cantidad));
    }
    private void disminuirContador2() {
        int cantidad = Integer.parseInt(num2.getText().toString());
        if (cantidad > 0) {
            cantidad--;
            num2.setText(String.valueOf(cantidad));
        }
    }
    private void aumentarContador3() {
        int cantidad = Integer.parseInt(num3.getText().toString());
        cantidad++;
        num3.setText(String.valueOf(cantidad));
    }
    private void disminuirContador3() {
        int cantidad = Integer.parseInt(num3.getText().toString());
        if (cantidad > 0) {
            cantidad--;
            num3.setText(String.valueOf(cantidad));
        }
    }
}
