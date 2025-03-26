package com.example.liczby;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.liczby.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     ActivityMainBinding binding;
     LosoweViewModel losoweViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Random random = new Random();
        losoweViewModel = new ViewModelProvider(this).get(LosoweViewModel.class);
        losoweViewModel.getLosowa().observe(
                this,
                new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer integer) {
                        binding.textViewLiczba.setText(String.valueOf(integer));
                    }
                }
        );
        binding.button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        losoweViewModel.wylosuj();

                    }
                }
        );




    }
}