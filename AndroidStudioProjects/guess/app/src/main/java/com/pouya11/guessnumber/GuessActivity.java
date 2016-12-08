package com.pouya11.guessnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class GuessActivity extends AppCompatActivity {

int number;
    EditText guessb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);

    }







    public void number1(View view) {





        guessb =(EditText) findViewById(R.id.guess);
        Random r=new Random();
        number = r.nextInt(9000)+1000;



    }



    public void number2(View view) {

        guessb =(EditText) findViewById(R.id.guess);
        Random r=new Random();
        number = r.nextInt(9000)+1000;

    }

    public void number3(View view) {


        guessb =(EditText) findViewById(R.id.guess);
        Random r=new Random();
        number = r.nextInt(9000)+1000;


    }


    public void number4(View view) {


        guessb =(EditText) findViewById(R.id.guess);
        Random r=new Random();
        number = r.nextInt(9000)+1000;

    }

    public void number5(View view) {



        guessb =(EditText) findViewById(R.id.guess);
        Random r=new Random();
        number = r.nextInt(9000)+1000;

    }

    public void number6(View view) {




        guessb =(EditText) findViewById(R.id.guess);
        Random r=new Random();
        number = r.nextInt(9000)+1000;

    }


    public void number7(View view) {


        guessb =(EditText) findViewById(R.id.guess);
        Random r=new Random();
        number = r.nextInt(9000)+1000;

    }

    public void number8(View view) {




        guessb =(EditText) findViewById(R.id.guess);
        Random r=new Random();
        number = r.nextInt(9000)+1000;

    }


    public void number9(View view) {

        guessb =(EditText) findViewById(R.id.guess);
        Random r=new Random();
        number = r.nextInt(9000)+1000;

    }

    public void number0(View view) {


        guessb =(EditText) findViewById(R.id.guess);
        Random r=new Random();
        number = r.nextInt(9000)+1000;


    }


    public void guesse(View view) {
        int guessn = Integer.parseInt(guessb.getText().toString());

        if (guessn == number) {
            Toast.makeText(this, "guess", Toast.LENGTH_LONG).show();
        } else if (guessn > number) {


            Toast.makeText(this, "to high", Toast.LENGTH_LONG).show();
        }
    }


}


