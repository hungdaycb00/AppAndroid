package com.manhhung.fading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isShowing = true;
    public  void fade(View view){
        ImageView imgView = findViewById(R.id.imgView);
        ImageView imgView2 = findViewById(R.id.imgView2);

        if(isShowing){
            isShowing = false;
            imgView.animate().alpha(0).setDuration(2000);
            imgView2.animate().alpha(1).setDuration(2000);
        } else{
            isShowing = true;
            imgView.animate().alpha(1).setDuration(2000);
            imgView2.animate().alpha(0).setDuration(2000);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}