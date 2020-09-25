package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button clear,bra,persentage,divide,seven,eight,nine,multiply,four,five,six,substraction,one,two,three,sum,dot2,equal,zero2;
    TextView input,output;
    boolean check=false;
    boolean add,sub,mul,div,pers;
    Float result1,result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clear = findViewById(R.id.clear);
        bra = findViewById(R.id.bra);
        persentage = findViewById(R.id.persentage);
        divide = findViewById(R.id.divide);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        multiply = findViewById(R.id.multiply);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        substraction = findViewById(R.id.substraction);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        sum = findViewById(R.id.sum);
        dot2 = findViewById(R.id.dot2);
        equal = findViewById(R.id.equal);
        zero2 = findViewById(R.id.zero2);
        input = findViewById(R.id.input);
        output = findViewById(R.id.output);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText("");
                output.setText("");
            }
        });
        zero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText(input.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText() + "9");
            }
        });
        bra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check) {

                    input.setText(input.getText() + "(");
                    check = false;
                } else {

                    input.setText(input.getText() + ")");
                    check = true;
                }

            }
        });
        dot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent=new Intent();
                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input==null){
                    input.setText("");

                }
                else
                {
                    result1=Float.parseFloat(input.getText()+"");
                    sub=true;
                    input.setText(null);

                }
            }
        });
        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input==null){
                    input.setText("");

                }
                else
                {
                    result1=Float.parseFloat(input.getText()+"");
                    sub=true;
                    input.setText(null);

                }

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input==null){
                    input.setText("");

                }
                else
                {
                    result1=Float.parseFloat(input.getText()+"");
                    mul=true;
                    input.setText(null);

                }

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input==null){
                    input.setText("");

                }
                else
                {
                    result1=Float.parseFloat(input.getText()+"");
                    div=true;
                    input.setText(null);

                }


            }
        });
        persentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input==null){
                    input.setText("");

                }
                else
                {
                    result1=Float.parseFloat(input.getText()+"");
                    pers=true;
                    input.setText(null);

                }


            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result2=Float.parseFloat(input.getText()+"");

                if(add==true)
                {
                    output.setText(result1+result2+" ");
                    add=false;
                }
                if(sub==true)
                {
                    output.setText(result1-result2+"");
                    sub=false;
                }
                if(mul==true){
                    output.setText(result1*result2+"");
                    mul=false;
                }
                if(div==true){
                    output.setText(result1/result2+"");
                    div=false;
                }
                if(pers==true){
                    Float per=(result1/result2)*100;
                    output.setText(+per+"%");
                    pers=true;
                }
            }
        });

    }
}
