package com.example.cwhexercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button btn1;
    private TextView showAddition;

    private EditText num3;
    private Button btn2;
    private TextView table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// EXCERCISE 1: DISPLAY A TEXT ON OPENING APP
        Toast.makeText(this, "Welcome To The App!", Toast.LENGTH_SHORT).show();



// EXCERCISE 2: ADDITION OF 2 NUMBERS
        num1 = findViewById(R.id.n1);
        num2 = findViewById(R.id.n2);
        btn1 = findViewById(R.id.btn1);
        showAddition = findViewById(R.id.addition);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int add = n1 + n2;
                showAddition.setText(String.format("Answer: %d + %d = %d", n1, n2, add));
            }
        });



// EXCERCISE 3: MULTIPLICATION TABLE
        num3 = findViewById(R.id.n3);
        btn2 = findViewById(R.id.btn2);
        table = findViewById(R.id.table);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n3 = Integer.parseInt(num3.getText().toString());
                String s = String.format("Table of %d: \n\n", n3);
                for(int i = 1; i <= 10; i++) s += String.format("%d * %d = %d\n", n3, i, n3 * i);
                table.setText(s);
            }
        });
    }
}