package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button convertBtn;
    private EditText userInputKG;
    private TextView showPound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertBtn = findViewById(R.id.button3);
        userInputKG = findViewById(R.id.editTextNumber3);
        showPound = findViewById(R.id.textView5);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Converted Successfully!", Toast.LENGTH_SHORT).show();

                String kg_string = userInputKG.getText().toString();
                double kg = Double.parseDouble(kg_string);
                double pound = kg * 2.205;

//                showPound.setText(kg_string + " KG is " + pound + " Pounds");
                showPound.setText(String.format("%s KG is %.3f Pounds", kg_string, pound));
            }
        });
    }
}
// MY FIRST WORKING ANDROID APP!!!!!!!
// Suvankar Das
// 2:49 AM - 21/08/2023
// Siliguri, WB, IND