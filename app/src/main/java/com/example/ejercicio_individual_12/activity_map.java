package com.example.ejercicio_individual_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicio_individual_12.databinding.ActivityMapBinding;

public class activity_map extends AppCompatActivity {
    public ActivityMapBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAtras.setOnClickListener(view -> {
            Intent intento = new Intent(activity_map.this, MainActivity.class);
            startActivity(intento);
        });
    }
}