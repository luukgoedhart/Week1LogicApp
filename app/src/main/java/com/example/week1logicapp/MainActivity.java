package com.example.week1logicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputField1;
    EditText inputField2;
    EditText inputField3;
    EditText inputField4;
    Button submitButton;
    String[] answers;
    static String CORRECT_ANSWER = "TFFF";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputField1 = findViewById(R.id.inputField1);
        inputField2 = findViewById(R.id.inputField2);
        inputField3 = findViewById(R.id.inputField3);
        inputField4 = findViewById(R.id.inputField4);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkResults();

            }

        });


    }
    private void checkResults(){
        answers = new String[4];
        answers[0] = inputField1.getText().toString();
        answers[1] = inputField2.getText().toString();
        answers[2] = inputField3.getText().toString();
        answers[3] = inputField4.getText().toString();
        String answer_user = "";
        for(String s : answers){
            answer_user+= s;
        }
        answer_user = answer_user.toUpperCase();
        if(answer_user.equals(CORRECT_ANSWER)){
            answerCorrect();
        }else{
            answerIncorrect();
        }



    }

    private void answerCorrect(){
        Toast.makeText(this, "ALL CORRECT IM PROUD!", Toast.LENGTH_SHORT).show();
    }

    private void answerIncorrect(){
        Toast.makeText(this, "ONE OR MORE ANSWERS WRONG...", Toast.LENGTH_SHORT).show();
    }
}
