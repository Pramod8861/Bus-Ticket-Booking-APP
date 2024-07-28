package com.example.ticket_price;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        editText=findViewById(R.id.editTextText3);

        double price = getIntent().getDoubleExtra("price", 0.0);
        editText.setText("Price: $" + price);

    }

    public void notifyMassage(){
        NotificationManager notificationManager;


        NotificationCompat.Builder nBuilder=new NotificationCompat.Builder(this,"noti_001");

        Intent intent=new Intent(this,MainActivity4.class);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setAction(Intent.ACTION_MAIN);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);

        PendingIntent pendingIntent=
                PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_IMMUTABLE);
        nBuilder.setContentIntent(pendingIntent);



        nBuilder.setSmallIcon(R.drawable.ic_launcher_foreground);
        nBuilder.setContentTitle("Successfully booked");
        nBuilder.setContentText("Booking");
        nBuilder.setPriority(Notification.PRIORITY_MAX);
        nBuilder.setAutoCancel(true);
        notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            String channelId = "noti_001";
            NotificationChannel channel = new NotificationChannel(
                    channelId,
                    "Channel Ready",
                    NotificationManager.IMPORTANCE_HIGH);
            notificationManager.createNotificationChannel(channel);
            nBuilder.setChannelId(channelId);
        }



        notificationManager.notify(10,nBuilder.build());
    }

    public void finish(View view) {
        notifyMassage();
    }

    public void logout(View view) {
        Intent intent00=new Intent(this, MainActivity.class);
        startActivity(intent00);
    }
}