package com.example.test;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();
    }

    private void initListeners() {
       Math math = new Math();
        binding.btnCalculation.setOnClickListener(view -> {
            String num1 = binding.edFirst.getText().toString();
            String num2 = binding.edSecond.getText().toString();
            String result = math.add(num1, num2);
            binding.tvResult.setText(result);
        });
    }}