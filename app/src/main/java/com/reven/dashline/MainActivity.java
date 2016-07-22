package com.reven.dashline;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.reven.dashline.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void onClickHeight(View view) {
        String height = binding.etHeight.getText().toString().trim();
        binding.dashLine.setHeight(parseInt(height));
    }

    public void onClickColor(View view) {
        String color = binding.etColor.getText().toString().trim();
        try {
            binding.dashLine.setColor(Color.parseColor(color));
        } catch (Exception e) {
            Toast.makeText(this, "Wrong color", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickDashWidth(View view) {
        String width = binding.etDashWidth.getText().toString().trim();
        binding.dashLine.setDashWidth(parseInt(width));
    }

    public void onClickOffset(View view) {
        String offset = binding.etOffset.getText().toString().trim();
        binding.dashLine.setOffset(parseInt(offset));
    }

    private int parseInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (Exception e) {
            Toast.makeText(this, "Wrong number", Toast.LENGTH_LONG).show();
            return 1;
        }
    }
}
