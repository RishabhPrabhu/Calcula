package com.example.f1.calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText number1;
    private EditText number2;
    private Button plus;
    private Button divide;
    private Button multiply;
    private Button minus;
    private TextView res;
    private Button reset;

    int num1;
    int num2;
    int result;

    protected void input() {

        num1 = Integer.parseInt(number1.getText().toString());
        num2 = Integer.parseInt(number2.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        divide = (Button) findViewById(R.id.divide);
        multiply = (Button) findViewById(R.id.multiply);
        reset = (Button) findViewById(R.id.reset);
        res = (TextView) findViewById(R.id.res);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean flag=checkField();
                if(flag==false) {
                    input();
                    result = num1 + num2;
                    res.setText(result + "");
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean flag=checkField();
                if(flag==false) {
                    input();
                    result = num1 - num2;
                    res.setText(result + "");
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean flag=checkField();
                if(flag==false) {
                    input();
                    result = num1 / num2;
                    res.setText(result + "");
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                boolean flag=checkField();
                if(flag==false) {
                    input();
                    result = num1 * num2;
                    res.setText(result + "");
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                number1.setText("");
                number2.setText("");
                res.setText("");
            }
        });

    }

    private boolean checkField() {

        if (number1.getText().toString().equals("") || number2.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "All Fiedls Are Required", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
