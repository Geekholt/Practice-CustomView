package com.geekholt.practiceui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.geekholt.practiceui.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void lesson1(View view) {
        Intent intent = new Intent(this, Lesson1Activity.class);
        startActivity(intent);
    }


    public void lesson2(View view) {
        Intent intent = new Intent(this, Lesson2Activity.class);
        startActivity(intent);
    }

    public void lesson3(View view) {
        Intent intent = new Intent(this, Lesson3Activity.class);
        startActivity(intent);
    }

    public void lesson4(View view) {
        Intent intent = new Intent(this, Lesson4Activity.class);
        startActivity(intent);
    }

    public void lesson5(View view) {
        Intent intent = new Intent(this, Lesson5Activity.class);
        startActivity(intent);
    }

    public void lesson6(View view) {
        Intent intent = new Intent(this, Lesson6Activity.class);
        startActivity(intent);
    }

}
