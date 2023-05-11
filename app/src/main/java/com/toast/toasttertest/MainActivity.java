package com.toast.toasttertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.toast.toaster.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToasterMessage.show(MainActivity.this,"bhaala");
    }
}