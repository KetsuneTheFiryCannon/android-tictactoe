package com.example.secondattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    EditText etxt;
    boolean TurnX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TurnX = true;
        MethodCore methodCore = new MethodCore();
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        etxt = findViewById(R.id.eText);

        btn1.setOnClickListener(view ->
        {
            btn1.setText(methodCore.Turn(TurnX,1));
            btn1.setEnabled(false);
            TurnX = methodCore.Switcher(TurnX);
            //etxt.setText(Integer.toString(methodCore.Turns1[0]));
            if(methodCore.Winner())
            {
                if(!TurnX)
                {
                    etxt.setText("X wins");
                }
                else
                {
                    etxt.setText("O wins");
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Value", etxt.getText().toString());
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(view ->
        {
            btn2.setText(methodCore.Turn(TurnX, 2));
            btn2.setEnabled(false);
            TurnX = methodCore.Switcher(TurnX);
            etxt.setText(Integer.toString(methodCore.Turns1[1]));
            if(methodCore.Winner())
            {
                if(!TurnX)
                {
                    etxt.setText("X wins");
                }
                else
                {
                    etxt.setText("O wins");
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Value", etxt.getText().toString());
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(view ->
        {
            btn3.setText(methodCore.Turn(TurnX, 3));
            btn3.setEnabled(false);
            TurnX = methodCore.Switcher(TurnX);
            etxt.setText(Integer.toString(methodCore.Turns1[2]));
            if(methodCore.Winner())
            {
                if(!TurnX)
                {
                    etxt.setText("X wins");
                }
                else
                {
                    etxt.setText("O wins");
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Value", etxt.getText().toString());
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(view ->
        {
            btn4.setText(methodCore.Turn(TurnX, 4));
            btn4.setEnabled(false);
            TurnX = methodCore.Switcher(TurnX);
            etxt.setText(Integer.toString(methodCore.Turns1[3]));
            if(methodCore.Winner())
            {
                if(!TurnX)
                {
                    etxt.setText("X wins");
                }
                else
                {
                    etxt.setText("O wins");
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Value", etxt.getText().toString());
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(view ->
        {
            btn5.setText(methodCore.Turn(TurnX, 5));
            btn5.setEnabled(false);
            TurnX = methodCore.Switcher(TurnX);
            etxt.setText(Integer.toString(methodCore.Turns1[4]));
            if(methodCore.Winner())
            {
                if(!TurnX)
                {
                    etxt.setText("X wins");
                }
                else
                {
                    etxt.setText("O wins");
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Value", etxt.getText().toString());
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(view ->
        {
            btn6.setText(methodCore.Turn(TurnX, 6));
            btn6.setEnabled(false);
            TurnX = methodCore.Switcher(TurnX);
            etxt.setText(Integer.toString(methodCore.Turns1[5]));
            if(methodCore.Winner())
            {
                if(!TurnX)
                {
                    etxt.setText("X wins");
                }
                else
                {
                    etxt.setText("O wins");
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Value", etxt.getText().toString());
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(view ->
        {
            btn7.setText(methodCore.Turn(TurnX, 7));
            btn7.setEnabled(false);
            TurnX = methodCore.Switcher(TurnX);
            etxt.setText(Integer.toString(methodCore.Turns1[6]));
            if(methodCore.Winner())
            {
                if(!TurnX)
                {
                    etxt.setText("X wins");
                }
                else
                {
                    etxt.setText("O wins");
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Value", etxt.getText().toString());
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(view ->
        {
            btn8.setText(methodCore.Turn(TurnX, 8));
            btn8.setEnabled(false);
            TurnX = methodCore.Switcher(TurnX);
            etxt.setText(Integer.toString(methodCore.Turns1[7]));
            if(methodCore.Winner())
            {
                if(!TurnX)
                {
                    etxt.setText("X wins");
                }
                else
                {
                    etxt.setText("O wins");
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Value", etxt.getText().toString());
                startActivity(intent);
            }
        });
        btn9.setOnClickListener(view ->
        {
            btn9.setText(methodCore.Turn(TurnX, 9));
            btn9.setEnabled(false);
            TurnX = methodCore.Switcher(TurnX);
            etxt.setText(Integer.toString(methodCore.Turns1[8]));
            if(methodCore.Winner())
            {
                if(!TurnX)
                {
                    etxt.setText("X wins");
                }
                else
                {
                    etxt.setText("O wins");
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Value", etxt.getText().toString());
                startActivity(intent);
            }
        });


    }
}