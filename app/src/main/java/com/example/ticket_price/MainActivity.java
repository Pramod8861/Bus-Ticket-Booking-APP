package com.example.ticket_price;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        Intent intent1=new Intent(this, Loginpage.class);
        startActivity(intent1);
    }

    public void signin(View view) {
        Intent intent2=new Intent(this, Signin.class);
        startActivity(intent2);
    }
}