package com.example.ticket_price;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void ticketbook(View view) {
        Intent intent4=new Intent(this, MainActivity3.class);
        startActivity(intent4);

    }
}