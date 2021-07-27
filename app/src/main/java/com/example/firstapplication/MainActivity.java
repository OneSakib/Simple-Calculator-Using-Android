package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonadd;
    Button buttonsubtract;
    Button buttonmul;
    Button buttondiv;
    Button buttonclear;
    Button buttonequal;
    String result;
    String tmp;
    String operator;
    TextView resulttextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
        initControlListener();

    }

    private void initControlListener() {
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClick("9");
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClearButtonClick();
            }
        });
        buttonsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorClick("-");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorClick("+");
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorClick("*");
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorClick("/");
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEqualButtonClick();
            }
        });
    }

    private void onEqualButtonClick() {
        int res = 0;
        try {
            result = resulttextview.getText().toString();
            int number1 = Integer.valueOf(tmp);
            int number2 = Integer.valueOf(resulttextview.getText().toString());
            switch (operator) {
                case "+":
                    res = number1 + number2;
                    break;
                case "-":
                    res = number1 - number2;
                    break;
                case "*":
                    res = number1 * number2;
                    break;
                case "/":
                    res = number1 / number2;
                    break;
            }
            result = String.valueOf(res).toString();
            resulttextview.setText(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void onOperatorClick(String operator) {
        tmp = resulttextview.getText().toString();
        this.operator = operator;
        onClearButtonClick();
    }

    private void onClearButtonClick() {
        result = "";
        resulttextview.setText("");
    }

    private void onNumberButtonClick(String pos) {
        result = resulttextview.getText().toString();
        result = result + pos;
        resulttextview.setText(result);
    }

    private void initControl() {
        button0 = (Button) findViewById(R.id.button14);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button5);
        button5 = (Button) findViewById(R.id.button6);
        button6 = (Button) findViewById(R.id.button7);
        button7 = (Button) findViewById(R.id.button9);
        button8 = (Button) findViewById(R.id.button10);
        button9 = (Button) findViewById(R.id.button11);

        buttonadd = (Button) findViewById(R.id.button4);
        buttonsubtract = (Button) findViewById(R.id.button8);
        buttonclear = (Button) findViewById(R.id.button13);
        buttonequal = (Button) findViewById(R.id.button15);
        buttondiv = (Button) findViewById(R.id.button16);
        buttonmul = (Button) findViewById(R.id.button12);

        resulttextview = (TextView) findViewById(R.id.viewresult);
    }
}