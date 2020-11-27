package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView consoleWrite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        consoleWrite = findViewById(R.id.textView);


        consoleWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = Color.TRANSPARENT;
                Drawable background = consoleWrite.getBackground();
                if (background instanceof ColorDrawable)
                    color = ((ColorDrawable) consoleWrite.getBackground()).getColor();


                if(color == getColor(R.color.red)){
                    consoleWrite.setBackgroundResource(R.color.yellow);
                }else if(color == getColor(R.color.yellow)){
                    consoleWrite.setBackgroundResource(R.color.green);
                }else if(color == getColor(R.color.green)){
                    consoleWrite.setBackgroundResource(R.color.red);
                }else{
                    consoleWrite.setBackgroundResource(R.color.red);
                }

            }
        });

    }
}