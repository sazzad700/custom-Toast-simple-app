package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    Button loginbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton=findViewById(R.id.loginbut);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               LayoutInflater inflater= getLayoutInflater();
               View custom= inflater.inflate(R.layout.customtoast, findViewById(R.id.customtoast_id));

               Toast toast= new Toast(MainActivity.this);

               toast.setDuration(Toast.LENGTH_SHORT);
               toast.setGravity(Gravity.CENTER,0,0);
               toast.setView(custom);
               toast.show();

            }
        });

    }



}