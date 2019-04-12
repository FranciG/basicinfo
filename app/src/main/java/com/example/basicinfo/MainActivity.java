package com.example.basicinfo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    double Screen;
    String result;






    @Override
    protected void onCreate(Bundle savedInstanceState) {

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        double height=metrics.heightPixels/metrics.xdpi;
        double width=metrics.widthPixels/metrics.ydpi;

       


        textView.setText(
                "The screen size is:"+Math.sqrt(height*height+width*width) +"\n" +
                        "Manufacturer: " + Build.MANUFACTURER +"\n"

                        +  "Brand:" + Build.BRAND+"\n"
                        +"Model: " + Build.MODEL+"\n"
                        +  "Board: " + Build.BOARD+"\n"
                        + "Hardware: " + Build.HARDWARE+"\n"
                        +  "Serial: " + Build.SERIAL+"\n"

                        + "Bootloader: " + Build.BOOTLOADER+"\n"
                        + "User: " + Build.USER+"\n"
                        +  "Host: " + Build.HOST+"\n"
                        + "Android version: " + Build.VERSION.RELEASE+"\n"
                        +  "API level: " + Build.VERSION.SDK_INT + ""+"\n"
                        +  "Build ID: " + Build.ID+"\n"
                        +  "Build time: " + Build.TIME +"\n"
                        +  "Fingerprint: " + Build.FINGERPRINT+"\n"
        );
    }
}
