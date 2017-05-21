package com.example.taranjotsidhu.tinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

        public void image(View view) {
            Intent intent = new Intent(this, Fourth.class);
            startActivity(intent);
        }

    public void mes(View view) {
        Intent intent = new Intent(this,Fifth.class);
        startActivity(intent);
    }
}
