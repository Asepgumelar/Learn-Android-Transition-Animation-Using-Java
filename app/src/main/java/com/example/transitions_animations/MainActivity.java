package com.example.transitions_animations;

import android.os.Bundle;

import android.content.Intent;
import android.widget.ImageView;

public class MainActivity extends BaseClass {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView redBlock = (ImageView)findViewById(R.id.redBlock);
        ImageView blueBlock = (ImageView)findViewById(R.id.blueBlock);
        ImageView yellowBlock = (ImageView)findViewById(R.id.yellowBlock);
        ImageView androidBlock = (ImageView)findViewById(R.id.androidBlock);

        explodeTransition(this, redBlock);
        fadeTransition(this, blueBlock);
        rotateView(yellowBlock);
        switchAnimation(androidBlock,blueBlock,new Intent(this,SecondActivity.class),this);
    }
}
