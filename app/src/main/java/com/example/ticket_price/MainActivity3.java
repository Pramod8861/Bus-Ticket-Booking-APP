package com.example.ticket_price;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {


    String[] item = {"Bhubaneswar", "Nayagarh", "Cuttack", "Puri", "Sambalpur"};
    AutoCompleteTextView autoCompleteTextView;
    AutoCompleteTextView autoCompleteTextView2;

    ArrayAdapter<String> adapterItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        autoCompleteTextView=findViewById(R.id.auto_complete_text);
        autoCompleteTextView2=findViewById(R.id.auto_complete_text2);
        adapterItem=new ArrayAdapter<String>(this,R.layout.list_item,item);
        autoCompleteTextView.setAdapter(adapterItem);
        autoCompleteTextView2.setAdapter(adapterItem);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity3.this, "Item: " + item, Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity3.this, "Item: " + item, Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void home(View view) {
        Intent intent4=new Intent(this, MainActivity2.class);
        startActivity(intent4);
    }

    public void price(View view) {
        String autoCompleteTextView1=autoCompleteTextView.getText().toString();
        String autoCompleteTextView21=autoCompleteTextView2.getText().toString();
        String autoCompleteTextView02=autoCompleteTextView.getText().toString();
        String autoCompleteTextView20=autoCompleteTextView2.getText().toString();
        String autoCompleteTextView31=autoCompleteTextView.getText().toString();
        String autoCompleteTextView32=autoCompleteTextView2.getText().toString();
        String autoCompleteTextView41=autoCompleteTextView.getText().toString();
        String autoCompleteTextView42=autoCompleteTextView2.getText().toString();
        String autoCompleteTextView51=autoCompleteTextView.getText().toString();
        String autoCompleteTextView52=autoCompleteTextView2.getText().toString();
        String autoCompleteTextView61=autoCompleteTextView.getText().toString();
        String autoCompleteTextView62=autoCompleteTextView2.getText().toString();
        String autoCompleteTextView71=autoCompleteTextView.getText().toString();
        String autoCompleteTextView72=autoCompleteTextView2.getText().toString();
        String autoCompleteTextView81=autoCompleteTextView.getText().toString();
        String autoCompleteTextView82=autoCompleteTextView2.getText().toString();

        String departure = autoCompleteTextView.getText().toString();
        String destination = autoCompleteTextView2.getText().toString();
        double price = 0;


        if(autoCompleteTextView1.equals("Bhubaneswar") && autoCompleteTextView21.equals("Nayagarh")) {

            Intent intent12 = new Intent(this, MainActivity4.class);
            startActivity(intent12);
        }

        if(autoCompleteTextView02.equals("Bhubaneswar") && autoCompleteTextView20.equals("Cuttack")) {

            Intent intent12 = new Intent(this, MainActivity4.class);
            startActivity(intent12);
        }

        if(autoCompleteTextView31.equals("Bhubaneswar") && autoCompleteTextView32.equals("Puri")) {

            Intent intent12 = new Intent(this, MainActivity4.class);
            startActivity(intent12);
        }

        if(autoCompleteTextView41.equals("Bhubaneswar") && autoCompleteTextView42.equals("Sambalpur")) {

            Intent intent12 = new Intent(this, MainActivity4.class);
            startActivity(intent12);
        }

        if(autoCompleteTextView51.equals("Nayagarh") && autoCompleteTextView52.equals("Sambalpur")) {

            Intent intent12 = new Intent(this, MainActivity4.class);
            startActivity(intent12);
        }

        if(autoCompleteTextView61.equals("Nayagarh") && autoCompleteTextView62.equals("Puri")) {

            Intent intent12 = new Intent(this, MainActivity4.class);
            startActivity(intent12);
        }

        if(autoCompleteTextView71.equals("Nayagarh") && autoCompleteTextView72.equals("Cuttack")) {

            Intent intent12 = new Intent(this, MainActivity4.class);
            startActivity(intent12);
        }

        if(autoCompleteTextView81.equals("Nayagarh") && autoCompleteTextView82.equals("Bhubaneswar")) {

            Intent intent12 = new Intent(this, MainActivity4.class);
            startActivity(intent12);
        }
        if(departure.equals("Bhubaneswar") && destination.equals("Nayagarh")) {
            price = 100.0; // Example price
        } else if(departure.equals("Bhubaneswar") && destination.equals("Cuttack")) {
            price = 150.0;
        } else if(departure.equals("Bhubaneswar") && destination.equals("Puri")) {
            price = 200.0;
        } else if(departure.equals("Bhubaneswar") && destination.equals("Sambalpur")) {
            price = 250.0;
        } else if(departure.equals("Nayagarh") && destination.equals("Sambalpur")) {
            price = 300.0;
        } else if(departure.equals("Nayagarh") && destination.equals("Puri")) {
            price = 180.0;
        } else if(departure.equals("Nayagarh") && destination.equals("Cuttack")) {
            price = 120.0;
        } else if(departure.equals("Nayagarh") && destination.equals("Bhubaneswar")) {
            price = 110.0;
        }
        Intent intent12 = new Intent(this, MainActivity4.class);
        intent12.putExtra("price", price);
        startActivity(intent12);


    }







}