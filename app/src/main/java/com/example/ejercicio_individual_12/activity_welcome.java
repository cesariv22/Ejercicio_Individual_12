package com.example.ejercicio_individual_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.example.ejercicio_individual_12.databinding.ActivityWelcomeBinding;

import java.util.Timer;
import java.util.TimerTask;

public class activity_welcome extends AppCompatActivity {
    public ActivityWelcomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TimerTask timer = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(activity_welcome.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        Timer time = new Timer();
        time.schedule(timer, 5000);
    }
}