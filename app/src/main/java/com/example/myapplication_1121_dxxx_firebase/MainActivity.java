package com.example.myapplication_1121_dxxx_firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     EditText e1   =(EditText) findViewById(R.id.editTextTextEmailAddress);
     EditText    p1=(EditText)findViewById(R.id.editTextTextPassword);
     EditText    p2=(EditText)findViewById(R.id.editTextTextPassword2);
     Button btn=(Button) findViewById(R.id.button);

     btn.setOnClickListener(new View.OnClickListener() {
         @Override

         public void onClick(View view) {
             Intent it=new Intent();
             it.setClass(MainActivity.this,MainActivity2.class);
             startActivity(it);

         }
     });

        String s=e1.getText().toString();
        e1.setText("xxxxx");

    }

}