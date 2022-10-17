package com.example.edytorzdjec;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

import java.net.ContentHandler;

public class MainActivity extends AppCompatActivity {

    SeekBar seekS, seekT, seekRot, seekR, seekG, seekB;
    ImageView image;
    int r,g,bl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekS = (SeekBar) findViewById(R.id.scaleSeek);
        seekT = (SeekBar) findViewById(R.id.transitionSeek);
        seekRot = (SeekBar) findViewById(R.id.rotationSeek);
        seekR = (SeekBar) findViewById(R.id.rSeek);
        seekG = (SeekBar) findViewById(R.id.gSeek);
        seekB = (SeekBar) findViewById(R.id.bSeek);
        image = (ImageView) findViewById(R.id.obraz);

        //Skalowanie
        seekS.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                image.setScaleX(i);
                image.setScaleY(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //Przezroczystosc
        seekT.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                image.setImageAlpha(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //Rotacja
        seekRot.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                image.setRotation(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //Kolor
        //R
        seekR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                r = i;
                kolor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //G
        seekG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                g = i;
                kolor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        //B
        seekB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                bl = i;
                kolor();
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void kolor() {
        image.setColorFilter(Color.rgb(r,g,bl), PorterDuff.Mode.MULTIPLY);
    }

}