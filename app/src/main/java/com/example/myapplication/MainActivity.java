package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text,text2;
    Button btn;public int A;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text=findViewById(R.id.text);
        text2=findViewById(R.id.abc);
        btn=findViewById(R.id.but);
        btn.setOnClickListener(this);
        String a = text.getText().toString();
        A= Integer.parseInt(a);



    }



    @Override
    public void onClick(View v) {




        int count=++A;
        if(A==10)
            text.setText("Congrats You clicker button 10 times");

        String str=Integer.toString(count);
        text2.setText(str);


    }
}

