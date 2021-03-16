package com.example.pressure;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickOnButtinOK();
    }

    private void clickOnButtinOK(){                                 //Нажатие на кнопку "Сохранить"
        Button buttonOK = findViewById(R.id.buttonOK);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                @SuppressLint("WrongViewCast") EditText up = findViewById(R.id.pressureViewUp);
                @SuppressLint("WrongViewCast") EditText down = findViewById(R.id.pressureViewDown);
                @SuppressLint("WrongViewCast") EditText pulse = findViewById(R.id.pulse);
                String upValue = up.getText().toString();
                String downValue = down.getText().toString();
                String pulseValue = pulse.getText().toString();
                Pressure pressure = new Pressure(Integer.parseInt(upValue), Integer.parseInt(downValue), Integer.parseInt(pulseValue));
            }
        });
    }
}