package com.example.unitconversionlbstostone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputWeight = findViewById(R.id.inputweightXML);
        TextView resultView = findViewById(R.id.resultView);




        Button myBtn = findViewById(R.id.convertButt);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userWeightInput = inputWeight.getText().toString();// be careful where this is created because on the onCreate and OnClick Methods
                float weight = Float.parseFloat(userWeightInput);
                float result = weight/14;
                String resultString = String.valueOf(result);

                resultView.setText("" + result);
            }
        });

    }
}