package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void Submit(View view)
    {
        int correctAnswers = 0;

        // Getting the name
        EditText editText = findViewById(R.id.name);
        String name = editText.getText().toString();
        String result;

        // No calculation without the name
        if(name.isEmpty())
        {
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
        }
        // Perform calculation
        else
        {
            RadioButton radioButton = findViewById(R.id.a_primitive_data_type);

            if (radioButton.isChecked())
            {
                correctAnswers++;
            }
            radioButton = findViewById(R.id.no_max_32);

            if (radioButton.isChecked())
            {
                correctAnswers++;
            }
            radioButton = findViewById(R.id.no_min_32);

            if(radioButton.isChecked())
            {
                correctAnswers++;
            }
            CheckBox checkBox = findViewById(R.id.correct_1);
            CheckBox checkBox2 = findViewById(R.id.correct_3);
            CheckBox checkBox3 = findViewById(R.id.correct_2);
            CheckBox checkBox4 = findViewById(R.id.correct_4);

            if (checkBox.isChecked() &&
                    checkBox2.isChecked() &&
                    !checkBox3.isChecked() &&
                    !checkBox4.isChecked())
            {
                correctAnswers++;

            }
            checkBox = findViewById(R.id.incorrect_1);
            checkBox2 = findViewById(R.id.incorrect_3);
            checkBox3 = findViewById(R.id.incorrect_2);
            checkBox4 = findViewById(R.id.incorrect_4);

            if (!checkBox.isChecked() &&
                    !checkBox2.isChecked() &&
                    checkBox3.isChecked() &&
                    checkBox4.isChecked())
            {
                correctAnswers++;

            }

            result = "You got " + correctAnswers + " correct answer out of 5 questions";

            // Show result
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        }
    }
}
