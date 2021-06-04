package com.androidfamily.sliderappbyandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout view;
    TextView textView;
    SeekBar seekBar1;
    SeekBar seekBar2;
    SeekBar seekBar3;
    private int red=0;
    private int green=0;
    private  int blue=0;
    void initialValues(){
        textView.setText("RGB: ("+red+","+green+","+blue+")");
    }
    void changeValues(){
        textView.setText("RGB: ("+red+","+green+","+blue+")");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar1=findViewById(R.id.slider1);
        seekBar2=findViewById(R.id.slider2);
        seekBar3=findViewById(R.id.slider3);
        view=findViewById(R.id.view);
        textView=findViewById(R.id.textView);
        seekBar1.setMax(255);
        seekBar2.setMax(255);
        seekBar3.setMax(255);
        initialValues();

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                red=i;
                view.setBackgroundColor(Color.argb(255,i,green,blue));
                changeValues();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                green=i;
                view.setBackgroundColor(Color.argb(255,red,i,blue));
                changeValues();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                blue=i;
                view.setBackgroundColor(Color.argb(255,red,green,i));
                changeValues();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
