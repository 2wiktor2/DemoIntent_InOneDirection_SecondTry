package com.wiktor.demointent_inonedirection_secondtry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText2;
    Button button2;
    int x, number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText2 = findViewById(R.id.edit_text_forNum2);
        button2 = findViewById(R.id.button);
        button2.setOnClickListener(this);

        Intent myIntent = getIntent();
        Bundle myB = myIntent.getExtras();
        if (myB != null) {
            x = myB.getInt(Constants.FIRST_KEY, 999);
            Toast.makeText(this, "Первое число = " + x, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View v) {
        if(setSecondNumber()){
            Intent myIntent2 = new Intent(this, ThirdActivity.class);
            Bundle myBundle2 = new Bundle();
            myBundle2.putInt(Constants.SECOND_KEY, number2);
            myBundle2.putInt(Constants.FIRST_KEY, x);
            myIntent2.putExtras(myBundle2);
            startActivity(myIntent2);
        }
        Toast.makeText(this, "Введите число", Toast.LENGTH_SHORT).show();
    }

    public boolean setSecondNumber() {
        if (!editText2.getText().toString().equals("")) {
            number2 = Integer.parseInt(editText2.getText().toString());
            return true;
        } return false;
    }
}
