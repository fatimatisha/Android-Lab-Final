package com.example.labfinal;

import static java.lang.Math.cos;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,
            button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,
            button21,button22,
            button23,button24,button25,button26;

    EditText edtIn;
    float mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiplication, Division,Percentage,Power,Root,Sin,Cos,Tan,Cot,Log,Fact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.buttonDel);
        button2=findViewById(R.id.buttoneql);
        button3=findViewById(R.id.sin);
        button4=findViewById(R.id.cos);
        button5=findViewById(R.id.tan);
        button6=findViewById(R.id.log);
        button7=findViewById(R.id.fact);
        button8=findViewById(R.id.power);
        button9=findViewById(R.id.root);
        button10=findViewById(R.id.b1);
        button11=findViewById(R.id.b2);
        button12=findViewById(R.id.b3);
        button13=findViewById(R.id.bdiv);
        button14=findViewById(R.id.b4);
        button15=findViewById(R.id.b5);
        button16=findViewById(R.id.b6);
        button17=findViewById(R.id.b7);
        button18=findViewById(R.id.b8);
        button19=findViewById(R.id.b9);
        button20=findViewById(R.id.b0);
        button21=findViewById(R.id.bsub);
        button22=findViewById(R.id.bDot);
        button23=findViewById(R.id.percent);
        button24=findViewById(R.id.plus);
        button25=findViewById(R.id.cot);
        button26=findViewById(R.id.mul);

        edtIn = findViewById(R.id.display);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "1");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "2");
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "3");
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "4");
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "5");
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "6");
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "7");
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "8");
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "9");
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + "0");
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText(edtIn.getText() + ".");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtIn.setText("");
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtIn.getText()+"");
                    Addition = true;
                    edtIn.setText(null);
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtIn.getText()+"");
                    Subtract = true;
                    edtIn.setText(null);
                }
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtIn.getText()+"");
                    Multiplication = true;
                    edtIn.setText(null);
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtIn.getText()+"");
                    Division = true;
                    edtIn.setText(null);
                }
            }
        });



        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtIn.getText()+"");
                    Percentage = true;
                    edtIn.setText(null);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {

                    Sin = true;
                    edtIn.setText(null);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {

                    Cos = true;
                    edtIn.setText(null);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {

                    Tan = true;
                    edtIn.setText(null);
                }
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {

                    Cot = true;
                    edtIn.setText(null);
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtIn.getText()+"");
                    Power = true;
                    edtIn.setText(null);
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {

                    Root = true;
                    edtIn.setText(null);
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {

                    Log = true;
                    edtIn.setText(null);
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtIn == null) {
                    edtIn.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtIn.getText()+"");
                    Fact = true;
                    edtIn.setText(null);
                }
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Addition == true){
                    mValueTwo=Float.parseFloat(edtIn.getText() + "");

                    edtIn.setText(mValueOne + mValueTwo+ "");
                    Addition=false;
                }

                if (Subtract == true){
                    mValueTwo=Float.parseFloat(edtIn.getText() + "");

                    edtIn.setText(mValueOne - mValueTwo+ "");
                    Subtract=false;
                }

                if (Multiplication == true){
                    mValueTwo=Float.parseFloat(edtIn.getText() + "");

                    edtIn.setText(mValueOne * mValueTwo+ "");
                    Multiplication=false;
                }
                if (Division == true){
                    mValueTwo=Float.parseFloat(edtIn.getText() + "");

                    edtIn.setText(mValueOne / mValueTwo+ "");
                    Division=false;
                }
                if(Percentage == true)
                {
                    mValueTwo = 100;
                    edtIn.setText(mValueOne/mValueTwo+"");
                    Percentage =false;
                }
                if(Sin == true)
                {
                    mValueTwo=Float.parseFloat(edtIn.getText() + "");
                    double s = Math.toRadians(mValueTwo);
                    edtIn.setText(sin(s)+"");
                    Sin=false;
                }
                if(Cos == true)
                {
                    mValueTwo=Float.parseFloat(edtIn.getText() + "");
                    double s = Math.toRadians(mValueTwo);
                    edtIn.setText(cos(s)+"");
                    Cos =false;
                }

                if(Tan == true)
                {
                    mValueTwo=Float.parseFloat(edtIn.getText() + "");
                    double s = Math.toRadians(mValueTwo);
                    edtIn.setText(tan(s)+"");
                    Tan=false;
                }
                if(Power == true)
                {
                    mValueTwo=Float.parseFloat(edtIn.getText() + "");
                    edtIn.setText(pow(mValueOne,mValueTwo)+"");
                    Power=false;
                }

                if(Root == true)
                {
                    mValueTwo=Float.parseFloat(edtIn.getText() + "");
                    edtIn.setText(sqrt(mValueTwo)+"");
                    Root=false;
                }



                if(Log == true)
                {
                    mValueTwo=Float.parseFloat(edtIn.getText() + "");
                    edtIn.setText(log10(mValueTwo)+"");
                    Log=false;
                }


                if(Fact == true)
                {

                    int fact=1;
                    for (int i=1;i<=mValueOne;i++)
                    {
                        fact=fact*i;
                    }
                    edtIn.setText(fact+"");
                    Fact=false;
                }



            }
        });






    }
}