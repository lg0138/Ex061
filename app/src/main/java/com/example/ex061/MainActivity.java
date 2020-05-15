package com.example.ex061;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton tb;
Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (ToggleButton)findViewById(R.id.tb);
        sw = (Switch)findViewById(R.id.sw);
    }

    public void check(View view) {
        if(tb.isChecked()){
            if(sw.isChecked()){
                change(0xffffff00);
            }
            else{
                change(0xff0000ff);
            }
        }
        else {
            if(sw.isChecked()){
                change(0xff00ff00);
            }
            else {
                change(0xffff0000);
            }
        }

    }//View view = this.getWindow().getDecorView();

    public void change( int color){
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}