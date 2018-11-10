package com.wiktor.demointent_inonedirection_secondtry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    int a, b, c;
    int result;

    TextView textView1, textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView1 = findViewById(R.id.text_view1);
        textViewResult = findViewById(R.id.text_view2);


        Intent myIntent3 = getIntent();
        Bundle myBundle3 = myIntent3.getExtras();

        if (myBundle3 != null) {
            // проверить доходит ли первое число из первой активити
            a = myBundle3.getInt(MainActivity.FIRST_KEY, 3);
            Toast.makeText(this, "Первое число, из первого Активити = " + a, Toast.LENGTH_SHORT).show();
            b = myBundle3.getInt(SecondActivity.FIRST_KEY_FROM_MAIN, 5);
            Toast.makeText(this, "Певое число = " + b, Toast.LENGTH_SHORT).show();
            c = myBundle3.getInt(SecondActivity.SECOND_KEY, 7);
            Toast.makeText(this, "Второе число = " + c, Toast.LENGTH_SHORT).show();
            result =a * b;
            String outNumber = String.valueOf(result);
            textViewResult.setText(String.valueOf(outNumber));
        } else textViewResult.setText("Что-то не так");

    }

}