package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView res = findViewById(R.id.res);
        Button btn = findViewById(R.id.btn);
        EditText txt = findViewById(R.id.num);

        Random random = new Random();
        int gen = random.nextInt(10);
        String sgen = String.valueOf(gen);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("Result:  ");
                String str = txt.getText().toString();
                if(sgen.equals(str)){
                    res.append("Successfully guessed!!!!");
                }
                else{
                    res.append("Wrongly guessed.......");
                }
            }
        });
    }
}