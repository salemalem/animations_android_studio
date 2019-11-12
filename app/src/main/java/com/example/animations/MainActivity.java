package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView homer = findViewById(R.id.homer);

//        homer.animate().alpha(0f).setDuration(2000);
//          homer.animate().translationYBy(1000f).setDuration(2000);
        homer.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600)
                .setDuration(1500);
//        ImageView bart = findViewById(R.id.bart);
//        bart.animate().alpha(1f).setDuration(2000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
