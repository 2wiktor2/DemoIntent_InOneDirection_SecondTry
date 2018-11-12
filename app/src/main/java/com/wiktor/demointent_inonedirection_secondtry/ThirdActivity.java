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
            a = myBundle3.getInt(Constants.FIRST_KEY, 5);
            Toast.makeText(this, "Певое число = " + b, Toast.LENGTH_SHORT).show();
            b = myBundle3.getInt(Constants.SECOND_KEY, 7);
            Toast.makeText(this, "Второе число = " + c, Toast.LENGTH_SHORT).show();
            result =a * b;
            String outNumber = String.valueOf(result);
            textViewResult.setText(String.valueOf(outNumber));
        } else textViewResult.setText("Что-то не так");

    }

}
