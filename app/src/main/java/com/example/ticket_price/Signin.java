package com.example.ticket_price;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signin extends AppCompatActivity {
    EditText un,pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        un=findViewById(R.id.editTextText2);
        pw=findViewById(R.id.editTextTextPassword2);
    }

    public void signup(View view) {
        String un1=un.getText().toString();
        String pw1=pw.getText().toString();



        String un2=un.getText().toString();
        String pw2=pw.getText().toString();


        String un3=un.getText().toString();
        String pw3=pw.getText().toString();


        String un4=un.getText().toString();
        String pw4=pw.getText().toString();


        String un5=un.getText().toString();
        String pw5=pw.getText().toString();


        if(un1.equals("Pramod") && pw1.equals("pramod")   ) {
            Toast.makeText(this, "Successfully Done", Toast.LENGTH_SHORT).show();
//            Toast.makeText(this, "Register is done", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity2.class);
            startActivity(intent3);
        }
        if(un2.equals("Jyoti") && pw2.equals("jyoti") ){
            Toast.makeText(this, "Successfully Done", Toast.LENGTH_SHORT).show();
//            Toast.makeText(this, "Register is done", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity2.class);
            startActivity(intent3);
        }
        if(un3.equals("Hritik") && pw3.equals("hritik") ) {
            Toast.makeText(this, "Successfully Done", Toast.LENGTH_SHORT).show();
//            Toast.makeText(this, "Register is done", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity2.class);
            startActivity(intent3);
        }
        if(un4.equals("Mohan") && pw4.equals("mohan") ) {
            Toast.makeText(this, "Successfully Done", Toast.LENGTH_SHORT).show();
//            Toast.makeText(this, "Register is done", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity2.class);
            startActivity(intent3);
        }
        if(un5.equals("Deepak") && pw5.equals("deepak") ) {
            Toast.makeText(this, "Successfully Done", Toast.LENGTH_SHORT).show();
//            Toast.makeText(this, "Register is done", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity2.class);
            startActivity(intent3);
        }
    }
}