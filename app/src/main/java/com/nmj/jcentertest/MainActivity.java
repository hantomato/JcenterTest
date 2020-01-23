package com.nmj.jcentertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.nmj.mylibrary.Calculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int ret = Calculator.plus(10, 20);
        Toast.makeText(this, "result : " + ret, Toast.LENGTH_LONG).show();
    }
}
