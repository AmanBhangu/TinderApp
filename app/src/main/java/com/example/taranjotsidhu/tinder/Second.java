package com.example.taranjotsidhu.tinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Second extends AppCompatActivity {
    ImageView imgButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void messages(View view) {
        Intent intent = new Intent(this,Third.class);
        startActivity(intent);
    }
}




