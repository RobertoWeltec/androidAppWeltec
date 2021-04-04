package com.example.androidappweltec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText no1 , no2;
    Button add ,mul ,div , sub,equal;
    TextView answer;
    double ans = 0;  // global variable 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for text views
        no1 = findViewById(R.id.first_no);
        no2 = findViewById(R.id.second_no);

        // for button with operations
        add = findViewById(R.id.add);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);

        // for equal to button
        equal = findViewById(R.id.equals);

        // for answer field
        answer = findViewById(R.id.answer);
    }
}
