package com.wiktor.demointent_inonedirection_secondtry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public final static String FIRST_KEY = "первое число";
    EditText editText1;
    Button button1;
    int number1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edit_text);
        button1 = findViewById(R.id.button);

        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        setFirstNumber();

        Intent myIntent1 = new Intent(this, SecondActivity.class);
        Bundle myBundle = new Bundle();
        myBundle.putInt(FIRST_KEY, number1);
        myIntent1.putExtras(myBundle);
        startActivity(myIntent1);
    }

    public void setFirstNumber() {
        if (!editText1.getText().toString().equals("")) {
            number1 = Integer.parseInt(editText1.getText().toString());
        }
    }


}
