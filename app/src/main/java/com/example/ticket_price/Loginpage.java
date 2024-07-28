package com.example.ticket_price;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Loginpage extends AppCompatActivity {
    EditText un,pw,ml,ph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        un=findViewById(R.id.editTextText);
        pw=findViewById(R.id.editTextTextPassword);
        ml=findViewById(R.id.editTextTextEmailAddress);
        ph=findViewById(R.id.editTextPhone);
    }



    public void reg(View view) {
        String un1=un.getText().toString();
        String pw1=pw.getText().toString();
        String ml1=ml.getText().toString();
        String ph1=ph.getText().toString();


        String un2=un.getText().toString();
        String pw2=pw.getText().toString();
        String ml2=ml.getText().toString();
        String ph2=ph.getText().toString();

        String un3=un.getText().toString();
        String pw3=pw.getText().toString();
        String ml3=ml.getText().toString();
        String ph3=ph.getText().toString();

        String un4=un.getText().toString();
        String pw4=pw.getText().toString();
        String ml4=ml.getText().toString();
        String ph4=ph.getText().toString();

        String un5=un.getText().toString();
        String pw5=pw.getText().toString();
        String ml5=ml.getText().toString();
        String ph5=ph.getText().toString();


        if(un1.equals("Pramod") && pw1.equals("pramod") && ml1.equals("pramod@123gmail.com") && ph1.equals("1234567894") ) {
            Toast.makeText(this, "Register is done", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity2.class);
            startActivity(intent3);
        }
        if(un2.equals("Jyoti") && pw2.equals("jyoti") && ml2.equals("jyoti123@gmail.com") && ph2.equals("1234567894")){
            Toast.makeText(this, "Register is done", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity2.class);
            startActivity(intent3);
        }
        if(un3.equals("Hritik") && pw3.equals("hritik") && ml3.equals("hritik123@gmail.com") && ph3.equals("1234567894")) {
            Toast.makeText(this, "Register is done", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity2.class);
            startActivity(intent3);
        }
        if(un4.equals("Mohan") && pw4.equals("mohan") && ml4.equals("mohan123@gmail.com") && ph4.equals("1234567894")) {
            Toast.makeText(this, "Register is done", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity2.class);
            startActivity(intent3);
        }
        if(un5.equals("Deepak") && pw5.equals("deepak") && ml5.equals("deepak123@gmail.com") && ph5.equals("1234567894")) {
            Toast.makeText(this, "Register is done", Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(this, MainActivity2.class);
            startActivity(intent3);
        }
    }
}